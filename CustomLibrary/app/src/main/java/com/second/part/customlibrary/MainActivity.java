package com.second.part.customlibrary;

import android.os.Bundle;

import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;

public class MainActivity extends CustomToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void customizeToolbar() {}

    @Override
    protected void initViews() {
        super.initViews();
    }

}
