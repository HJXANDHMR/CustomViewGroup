package com.feidee.viewgroup.domain;

/**
 * Created by 何健雄 on 16-7-20.
 */
public class ViewSizeInfo {
    private int mWidth;
    private int mHeight;
    // 设置默认颜色
    private int color;

    public ViewSizeInfo(int width, int height) {
        this.mWidth = width;
        this.mHeight = height;
    }

    public ViewSizeInfo(int width, int height, int color) {
        this.mWidth = width;
        this.mHeight = height;
        this.color = color;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int height) {
        this.mHeight = height;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
