package com.second.part.customlibrary.activity.list;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.astractactivity.AbstractToolbarActivity;
import com.second.part.customlibrary.activity.list.recycler.Adapter;
import com.second.part.customlibrary.activity.list.viewpager.ViewPagerAdapter;

public class ListActivity extends AbstractToolbarActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_list);
    }

    @Override
    protected void customizeToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void initViews() {
        super.initViews();
        tabLayout = (TabLayout) findViewById(R.id.activity_list_tab_layout);
        viewPager = (ViewPager) findViewById(R.id.activity_list_view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), this));
        tabLayout.setupWithViewPager(viewPager);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean menuCreated = super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu, menu);

        menuCreated &= true;
        return menuCreated;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_item_1:
                adapter.orderList("-");
                break;
            case R.id.option_item_2 :
                adapter.orderList("+");
                break;
        }

        return super.onOptionsItemSelected(item);
    }*/

}
