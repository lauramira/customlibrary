package com.second.part.customlibrary.activity.list;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;
import com.second.part.customlibrary.activity.list.recycler.Adapter;

public class ListActivity extends CustomToolbarActivity {

    private Adapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_list;
    }

    @Override
    protected void customizeToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void initViews() {
        super.initViews();
        //TAB LAYOUT
        tabLayout = (TabLayout) findViewById(R.id.activity_library_list_tab_layout);
        initTabLayout();

        //RECYCLER
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_library_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
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
    }

    private void initTabLayout(){
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab_layout_movies)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab_layout_tv_shows)));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0){
                    adapter.changeListType(1);
                } else {
                    adapter.changeListType(2);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
    }


}
