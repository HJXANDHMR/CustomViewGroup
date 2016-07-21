package com.feidee.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomImgContainer customImgContainer = new CustomImgContainer(this);
        TextView textView = new TextView(this);
        textView.setText("TextView");
        textView.setBackgroundColor(Color.RED);
        textView.setWidth(20);
        textView.setHeight(20);
        customImgContainer.addView(textView);
        setContentView(R.layout.activity_main);

    }
}
