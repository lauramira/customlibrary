package com.second.part.customlibrary.activity.customactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.second.part.customlibrary.R;

/**
 * Created by Usuario on 27/01/2017.
 */

public abstract class CustomToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        initViews();
        customizeToolbar();
    }

    protected abstract int getLayoutResourceId();
    protected abstract void customizeToolbar();

    protected void initViews(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public Toolbar getToolbar(){
        return toolbar;
    }
}
