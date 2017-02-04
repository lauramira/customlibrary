package com.second.part.customlibrary.activity.create;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.EditText;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.create.viewpager.ViewPagerAdapter;
import com.second.part.customlibrary.activity.astractactivity.AbstractToolbarActivity;
import com.second.part.customlibrary.activity.create.viewpager.fragment.CreateMovieFragment;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.manager.LibraryManager;

public class CreateActivity extends AbstractToolbarActivity{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_create);
    }

    @Override
    protected void customizeToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void initViews() {
        super.initViews();
        tabLayout = (TabLayout) findViewById(R.id.activity_create_tab_layout);
        viewPager = (ViewPager) findViewById(R.id.activity_create_view_pager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
