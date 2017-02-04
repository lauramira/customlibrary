package com.second.part.customlibrary.activity.create.viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.application.CustomApplication;
import com.second.part.customlibrary.model.TvShow;

public class CreateTvShowFragment extends Fragment {
    private EditText editTextName;
    private EditText editTextYear;
    private EditText editTextSeasons;

    public CreateTvShowFragment() {}

    public static CreateTvShowFragment newInstance() {
        CreateTvShowFragment fragment = new CreateTvShowFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_tv_show, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button buttonAdd = (Button) getActivity().findViewById(R.id.fragment_create_tv_show_button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTvShow();
            }
        });

        editTextName  = (EditText) getActivity().findViewById(R.id.fragment_create_tv_show_edit_text_name);
        editTextYear = (EditText) getActivity().findViewById(R.id.fragment_create_tv_show_edit_text_year);
        editTextSeasons = (EditText) getActivity().findViewById(R.id.fragment_create_tv_show_edit_text_seasons);
    }

    private void addTvShow(){
        String name = editTextName.getText().toString();
        String year = editTextYear.getText().toString();
        String seasons = editTextSeasons.getText().toString();
        if (name.isEmpty() || year.isEmpty() || seasons.isEmpty()){
            Toast.makeText(getContext(), getActivity().getString(R.string.fragment_create_error_empty_fields), Toast.LENGTH_LONG).show();
        } else {
            CustomApplication application = (CustomApplication) getActivity().getApplication();
            application.getLibraryManager().createTvShow(
                    new TvShow(
                            name,
                            Integer.parseInt(year),
                            Integer.parseInt(seasons)
                    )
            );
            getActivity().finish();
        }
    }
}
