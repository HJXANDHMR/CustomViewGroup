package com.feidee.viewgroup.domain;

/**
 * Created by 何健雄 on 16-7-20.
 */
public class ViewSize {
    private int width;
    private int height;
    // 设置默认颜色
    private String color="#B0E0E6";

    public ViewSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ViewSize(int width, int height, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
