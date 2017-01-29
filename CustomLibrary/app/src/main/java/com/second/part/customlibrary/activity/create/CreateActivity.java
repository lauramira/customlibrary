package com.second.part.customlibrary.activity.create;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.create.viewpager.CreateAdapter;
import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;

public class CreateActivity extends CustomToolbarActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_create;
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

        viewPager.setAdapter(new CreateAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
}
