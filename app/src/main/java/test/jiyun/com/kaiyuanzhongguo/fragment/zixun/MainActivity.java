package test.jiyun.com.kaiyuanzhongguo.fragment.zixun;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.OnClick;
import test.jiyun.com.kaiyuanzhongguo.BaseActivity;
import test.jiyun.com.kaiyuanzhongguo.R;
import test.jiyun.com.kaiyuanzhongguo.config.FragmentBuilder;
import test.jiyun.com.kaiyuanzhongguo.fragment.NewsFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.sousuo)
    ImageView sousuo;
    @BindView(R.id.home_frameLayout)
    FrameLayout homeFrameLayout;
    @BindView(R.id.main_news)
    RadioButton mainNews;
    @BindView(R.id.main_move)
    RadioButton mainMove;
    @BindView(R.id.main_iamge_build)
    RadioButton mainIamgeBuild;
    @BindView(R.id.main_discover)
    RadioButton mainDiscover;
    @BindView(R.id.main_mine)
    RadioButton mainMine;
    @BindView(R.id.Main_group)
    RadioGroup MainGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private SharedPreferences mShared;
    private String uid;
    private long mExitTime;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_hone;
    }

    @Override
    protected void init() {
        mShared = getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor editor = mShared.edit();

        fragmentManager = getSupportFragmentManager();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void LoadData() {
        FragmentBuilder.getInstance().init().start(NewsFragment.class).build();
    }


    @OnClick({R.id.sousuo, R.id.main_news, R.id.main_move, R.id.main_iamge_build, R.id.main_discover, R.id.main_mine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.sousuo:
                break;
            case R.id.main_news:
                break;
            case R.id.main_move:
                break;
            case R.id.main_iamge_build:
                break;
            case R.id.main_discover:
                break;
            case R.id.main_mine:
                break;
        }
    }
}
