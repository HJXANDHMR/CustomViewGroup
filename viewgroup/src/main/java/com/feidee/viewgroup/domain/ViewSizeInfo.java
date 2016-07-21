package com.feidee.viewgroup.domain;

/**
 * Created by 何健雄 on 16-7-20.
 */
public class ViewSizeInfo {
    private int width;
    private int height;
    // 设置默认颜色
    private int color;

    public ViewSizeInfo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ViewSizeInfo(int width, int height, int color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
