package test.jiyun.com.kaiyuanzhongguo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by admin on 2017/5/9.
 */
public abstract class BaseFragment extends Fragment{
    protected Unbinder unbinder;
    private Bundle params;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId(),container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder= ButterKnife.bind(this,view);
        initViews(view);
        initListener();
        initDatas();
    }

    protected abstract void initDatas();

    protected abstract void initListener();

    protected abstract void initViews(View view);

    protected abstract int layoutId();

    public void setParams(Bundle params) {
        this.params = params;
    }
}
