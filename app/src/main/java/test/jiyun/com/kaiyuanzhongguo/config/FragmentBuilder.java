package test.jiyun.com.kaiyuanzhongguo.config;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import test.jiyun.com.kaiyuanzhongguo.App;
import test.jiyun.com.kaiyuanzhongguo.R;
import test.jiyun.com.kaiyuanzhongguo.fragment.BaseFragment;

/**
 * Created by admin on 2017/5/9.
 */

public class FragmentBuilder  {
    private android.support.v4.app.FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private BaseFragment baseFragment;
    private String simpleName;
    private FragmentBuilder(){
        init();
    }

    private static FragmentBuilder fragmentBuilder;
    public synchronized static FragmentBuilder getInstance(){
        if(fragmentBuilder == null){
            fragmentBuilder = new FragmentBuilder();
            return fragmentBuilder;
        }
        return fragmentBuilder;
    }

    public FragmentBuilder init() {
        fragmentManager = App.activity.getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        return this;
    }

    public FragmentBuilder start(Class<? extends BaseFragment> fragmentClass){
        //使用Fragment类名做tag；
        simpleName = fragmentClass.getSimpleName();
        //根据tag查找fragment 如果能找到就代表fragment已经实例化了，否则动态实例化；
        baseFragment = (BaseFragment) fragmentManager.findFragmentByTag(simpleName);
        if(baseFragment == null){
            try {
                baseFragment = fragmentClass.newInstance();
                fragmentTransaction.add(R.id.home_frameLayout,baseFragment,simpleName);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //隐藏上一个fragment
        if(App.lastFragment == null){
            fragmentTransaction.hide(App.lastFragment);
        }
        //判断是否已经添加 如果没有添加过就添加
        //已经添加就调用show方法显示；
        fragmentTransaction.show(baseFragment);
        fragmentTransaction.addToBackStack(simpleName);
        return this;
    }

    public FragmentBuilder params(Bundle params) {

        if (params != null) {
            baseFragment.setParams(params);
        }
        return this;
    }
    public FragmentBuilder isBack(boolean isBack) {
        if (isBack) {
        }
        return this;
    }

    public BaseFragment build(){
        fragmentTransaction.addToBackStack(simpleName);
        App.lastFragment = baseFragment;
        fragmentTransaction.commit();
        return baseFragment;
    }
}
