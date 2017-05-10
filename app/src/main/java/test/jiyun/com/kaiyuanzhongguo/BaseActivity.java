package test.jiyun.com.kaiyuanzhongguo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by admin on 2017/5/9.
 */

public abstract class BaseActivity extends AppCompatActivity{
    //记录上一个Fragment，记录要隐藏的Fragment；
    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        App.activity = this;
        fragmentManager = getSupportFragmentManager();
        ButterKnife.bind(this);
        init();
        initListener();
        LoadData();
    }

    protected abstract int getLayoutId();

    protected abstract void LoadData();


    protected abstract void initListener();

    protected abstract void init();

    @Override
    protected void onResume() {
        super.onResume();
        App.activity = this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
