package com.feidee.viewgroup;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
        mViewGroup = getCustomViewGroup(mViewSizes);
        setContentView(mViewGroup);

    }

    private CustomViewGroup getCustomViewGroup(ArrayList<ViewSize> viewSizes) {
        LinearLayout layout = new LinearLayout(this);
        CustomViewGroup myViewGroup = new CustomViewGroup(this);

        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setBackgroundColor(Color.GREEN);

        int width =ScreenUtil.getScreenWidth(this)/10;
        int height =ScreenUtil.getScreenHeight(this)/5;
        for (ViewSize viewSize : viewSizes) {
            TextView textView = new TextView(this);
            textView.setText("TextView");
            textView.setBackgroundColor(Color.RED);
            textView.setWidth(width* viewSize.getWidth());
            textView.setHeight(height* viewSize.getHeight());
            layout.addView(textView);

        }
        myViewGroup.addView(layout, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return myViewGroup;
    }

    private ArrayList<ViewSize> getViewSizes() {
        ArrayList<ViewSize> viewSizes = new ArrayList<>();

        viewSizes.add(new ViewSize(1, 1));
        viewSizes.add(new ViewSize(2, 2));
        viewSizes.add(new ViewSize(4, 4));
        viewSizes.add(new ViewSize(2, 5));

        return viewSizes;
    }
}
