package com.feidee.viewgroup;

/**
 * Created by 何健雄 on 16-7-21.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.feidee.viewgroup.domain.ViewSizeInfo;
import com.feidee.viewgroup.utils.ScreenUtil;
import com.feidee.viewgroup.view.CustomViewGroup;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private CustomViewGroup mViewGroup;
    private ArrayList<ViewSizeInfo> mViewSizes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化数据
        mViewSizes = getViewSizes();
        mViewGroup = getViewGroup(mViewSizes);
        setContentView(mViewGroup);
    }

    private ArrayList<ViewSizeInfo> getViewSizes() {
        ArrayList<ViewSizeInfo> viewSizes = new ArrayList<>();

        viewSizes.add(new ViewSizeInfo(1, 1,R.color.colorAccent));
        viewSizes.add(new ViewSizeInfo(3, 2,R.color.colorDarkOrchid));
        viewSizes.add(new ViewSizeInfo(4, 4,R.color.colorPrimary));
        viewSizes.add(new ViewSizeInfo(1, 5,R.color.colorLightBLue));
        return viewSizes;
    }

    private CustomViewGroup getViewGroup(ArrayList<ViewSizeInfo> viewSizes) {
        CustomViewGroup myViewGroup = new CustomViewGroup(this);

        myViewGroup.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        int width = ScreenUtil.getScreenWidth(this)/10;
        int height =ScreenUtil.getScreenHeight(this)/5;

        for (int i = 0; i <viewSizes.size() ; i++) {
            ViewSizeInfo viewSize =viewSizes.get(i);
            TextView textView = new TextView(this);
            textView.setText("TextView"+i);
            textView.setBackgroundColor(getResources().getColor(viewSize.getColor()));
            textView.setWidth(width* viewSize.getWidth());
            textView.setHeight(height* viewSize.getHeight());
            myViewGroup.addView(textView);
        }
        return myViewGroup;
    }
}

