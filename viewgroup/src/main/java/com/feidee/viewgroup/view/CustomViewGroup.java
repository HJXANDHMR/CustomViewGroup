package com.feidee.viewgroup.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 何健雄 on 16-7-21.
 */
public class CustomViewGroup extends ViewGroup {

    private final static String TAG = "CustomViewGroup";

    // view 的间隔
    private final static int VIEW_MARGIN = 0;

    public CustomViewGroup(Context context) {
        super(context);
    }

    // 重写它的onMeasure() 在该方法中进行对子View的大小进行测量
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        Log.d(TAG, "widthMeasureSpec = " + widthMeasureSpec
                + " heightMeasureSpec" + heightMeasureSpec);
        for (int index = 0; index < getChildCount(); index++) {
            final View child = getChildAt(index);
            child.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    // 重写onLayout方法实现子View的定位
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        Log.d(TAG, "changed = " + changed + " left = " + l + " top = " + t
                + " right = " + r + " botom = " + b);
        final int count = getChildCount();
        int row = 0;
        //当前宽度
        int lengthX = l;
        //当前高度
        int lengthY = t;
        for (int i = 0; i < count; i++) {
            final View child = this.getChildAt(i);
            int width = child.getMeasuredWidth();
            int height = child.getMeasuredHeight();
            lengthX += width + VIEW_MARGIN;
            lengthY = row * (height + VIEW_MARGIN) + VIEW_MARGIN + height
                    + t;
            if (lengthX > r) {
                lengthX = width + VIEW_MARGIN + l;
                row++;
                lengthY = row * (height + VIEW_MARGIN) + VIEW_MARGIN + height
                        + t;
            }
            child.layout(lengthX - width, lengthY - height, lengthX, lengthY);
        }
    }
}
