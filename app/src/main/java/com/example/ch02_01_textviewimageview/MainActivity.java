package com.example.ch02_01_textviewimageview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Demo 2.1 TextView 和 ImageView
 *
 * 页面布局在 activity_main.xml 中完成：
 * 垂直方向的 LinearLayout 依次排列
 * 标题 TextView、介绍 TextView、ImageView（drawable 本地图片）、图片说明 TextView。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载布局，文字与图片的显示均由 XML 布局文件控制
        setContentView(R.layout.activity_main);
    }
}
