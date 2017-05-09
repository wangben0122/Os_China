package test.jiyun.com.kaiyuanzhongguo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import test.jiyun.com.kaiyuanzhongguo.fragment.NewsFragment;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.sousuo)
    ImageView sousuo;
    @InjectView(R.id.home_frameLayout)
    FrameLayout homeFrameLayout;
    @InjectView(R.id.main_news)
    RadioButton mainNews;
    @InjectView(R.id.main_move)
    RadioButton mainMove;
    @InjectView(R.id.main_iamge_build)
    RadioButton mainIamgeBuild;
    @InjectView(R.id.main_discover)
    RadioButton mainDiscover;
    @InjectView(R.id.main_mine)
    RadioButton mainMine;
    @InjectView(R.id.Main_group)
    RadioGroup MainGroup;
    private FragmentManager fragmentManager;
  private FragmentTransaction  transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hone);
        ButterKnife.inject(this);
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
