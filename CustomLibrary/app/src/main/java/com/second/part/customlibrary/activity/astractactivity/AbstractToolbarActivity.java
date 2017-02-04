package com.second.part.customlibrary.activity.astractactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.second.part.customlibrary.R;

/**
 * Created by Usuario on 27/01/2017.
 */

public abstract class AbstractToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    protected void onCreate(@Nullable Bundle savedInstanceState, int layoutResourceId) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResourceId);
        initViews();
        customizeToolbar();
    }

    protected abstract void customizeToolbar();

    protected void initViews(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public Toolbar getToolbar(){
        return toolbar;
    }
}
