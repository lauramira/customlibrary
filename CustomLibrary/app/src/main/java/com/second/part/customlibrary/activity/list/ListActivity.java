package com.second.part.customlibrary.activity.list;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;
import com.second.part.customlibrary.activity.list.recycler.Adapter;

public class ListActivity extends CustomToolbarActivity {

    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_list;
    }

    @Override
    protected void customizeToolbar() {}

    @Override
    protected void initViews() {
        super.initViews();
       /* //FRAGMENT
        TabLayout tabLayout = (TabLayout) findViewById(R.id.activity_tab_layout_container);
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_tab_layout_view_pager);*/

        //RECYCLER
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_library_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);
    }
}
