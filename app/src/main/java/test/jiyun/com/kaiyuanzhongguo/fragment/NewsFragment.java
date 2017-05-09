package test.jiyun.com.kaiyuanzhongguo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.jiyun.com.kaiyuanzhongguo.R;

/**
 * Created by admin on 2017/5/9.
 */

public class NewsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                 View view=inflater.inflate(R.layout.news,null);


        return view;
    }
}
