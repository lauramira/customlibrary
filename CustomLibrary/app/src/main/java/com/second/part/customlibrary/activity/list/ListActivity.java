package com.second.part.customlibrary.activity.list;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;
import com.second.part.customlibrary.activity.list.recycler.Adapter;

public class ListActivity extends CustomToolbarActivity {

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
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_library_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final Adapter a = new Adapter(this);
        recyclerView.setAdapter(a);

        Button movie = (Button) findViewById(R.id.moviebuttonchange);
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.changeListType(1);
            }
        });

        Button tvshow = (Button) findViewById(R.id.tvshowbuttonchange);
        tvshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.changeListType(2);
            }
        });
    }
}
