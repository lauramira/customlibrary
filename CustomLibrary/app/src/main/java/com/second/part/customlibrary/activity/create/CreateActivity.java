package com.second.part.customlibrary.activity.create;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.create.viewpager.CreateAdapter;
import com.second.part.customlibrary.activity.customactivity.CustomToolbarActivity;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.manager.LibraryManager;
import com.second.part.customlibrary.model.Movie;
import com.second.part.customlibrary.model.TvShow;

public class CreateActivity extends CustomToolbarActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private LibraryManager libraryManager;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    private String field1;
    private String field2;
    private String field3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        libraryManager = CustomApplication.getInstance().getLibraryManager();
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

        Button addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (tabLayout.getSelectedTabPosition()){
                    case 0: addMovie(); break;
                    case 1: addTvShow(); break;
                }
            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                changeEditText(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                getEditTextTexts();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void changeEditText(int position){
        switch (position){
            case 0:
                initMovieEditText();
                break;
            case 1:
                initTvShowEditText();
                break;
        }

        editText1.setText(field1);
        editText2.setText(field2);
    }

    private void getEditTextTexts(){
        if (editText1 == null){
            initMovieEditText();
        }

        field1 = editText1.getText() != null ? editText1.getText().toString() : "";
        field2 = editText2.getText() != null ? editText2.getText().toString() : "";
    }


    private void addMovie(){

        if (editText1 == null){
            initMovieEditText();
        }

        if (checkFields()){
            libraryManager.createMovie(
                    new Movie(
                            field1,
                            Integer.parseInt(field2),
                            field3
                    )
            );
            resetEditTexts();
        }

    }

    private void addTvShow(){

        if (checkFields()){
            libraryManager.createTvShow(
                    new TvShow(
                            field1,
                            Integer.parseInt(field2),
                            Integer.parseInt(field3)
                    )
            );
            resetEditTexts();
        }

    }

    private boolean checkFields(){
        field1 = editText1.getText() != null ? editText1.getText().toString() : "";
        field2 = editText2.getText() != null ? editText2.getText().toString() : "";
        field3 = editText3.getText() != null ? editText3.getText().toString() : "";

        return !field1.isEmpty() && !field2.isEmpty() && !field3.isEmpty();
    }

    private void resetEditTexts(){
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
    }


    private void initMovieEditText(){
        editText1 = (EditText) findViewById(R.id.textViewMovieName);
        editText2 = (EditText) findViewById(R.id.textViewMovieYear);
        editText3 = (EditText) findViewById(R.id.textViewDirectorName);
    }

    private void initTvShowEditText(){
        editText1 = (EditText) findViewById(R.id.textViewTvShowName);
        editText2 = (EditText) findViewById(R.id.textViewTvShowStartYear);
        editText3 = (EditText) findViewById(R.id.textViewTvShowSeasons);
    }
}
