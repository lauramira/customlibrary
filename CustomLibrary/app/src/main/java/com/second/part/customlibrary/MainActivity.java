package com.second.part.customlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;
import com.second.part.customlibrary.activity.list.ListActivity;

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
        Button listButton = (Button) findViewById(R.id.listButton);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(i);
            }
        });
    }

}
