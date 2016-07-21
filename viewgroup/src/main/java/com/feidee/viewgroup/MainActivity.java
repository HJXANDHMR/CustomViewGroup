package com.feidee.viewgroup;

/**
 * Created by 何健雄 on 16-7-21.
 */

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.feidee.viewgroup.domain.ViewSize;
import com.feidee.viewgroup.utils.ScreenUtil;
import com.feidee.viewgroup.view.CustomViewGroup;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private CustomViewGroup mViewGroup;
    private ArrayList<ViewSize> mViewSizes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化数据
        mViewSizes = getViewSizes();
        mViewGroup = getMyViewGroup(mViewSizes);
        setContentView(mViewGroup);

    }

    private ArrayList<ViewSize> getViewSizes() {
        ArrayList<ViewSize> viewSizes = new ArrayList<>();

        viewSizes.add(new ViewSize(1, 1,"#FF69B4"));
        viewSizes.add(new ViewSize(2, 2,"#FF00FF"));
        viewSizes.add(new ViewSize(4, 4,"#9932CC"));
        viewSizes.add(new ViewSize(2, 5,"#0000FF"));
//        viewSizes.add(new ViewSize(1, 2));
        return viewSizes;
    }

    private CustomViewGroup getMyViewGroup(ArrayList<ViewSize> viewSizes) {
        CustomViewGroup myViewGroup = new CustomViewGroup(this);

        myViewGroup.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        int width = ScreenUtil.getScreenWidth(this)/10;
        int height =ScreenUtil.getScreenHeight(this)/5;
        for (int i = 0; i <viewSizes.size() ; i++) {
            ViewSize viewSize =viewSizes.get(i);
            TextView textView = new TextView(this);
            textView.setText("TextView"+i);
//            textView.setBackgroundColor(Color.RED);
            textView.setBackgroundColor(Color.parseColor(viewSize.getColor()));
            textView.setWidth(width* viewSize.getWidth());
            textView.setHeight(height* viewSize.getHeight());
            myViewGroup.addView(textView);
        }

        return myViewGroup;
    }
}

