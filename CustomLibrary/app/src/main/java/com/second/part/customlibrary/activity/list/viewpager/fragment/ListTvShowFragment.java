package com.second.part.customlibrary.activity.list.viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.second.part.customlibrary.R;
import com.second.part.customlibrary.activity.list.viewpager.fragment.recycler.RecyclerViewAdapter;
import com.second.part.customlibrary.utils.CustomLibraryConstants;

public class ListTvShowFragment extends Fragment {

    RecyclerViewAdapter recyclerViewAdapter;
    public ListTvShowFragment() {
    }

    public static ListTvShowFragment newInstance() {
        ListTvShowFragment fragment = new ListTvShowFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_tv_show, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.fragment_list_tv_show_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), CustomLibraryConstants.TV_SHOW_TAB);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fragment_list_tv_show_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int sortType = 0;
        switch (item.getItemId()){
            case R.id.fragment_list_tv_show_menu_option_item_1:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_NAME_A_TO_Z_OPTION;
                break;
            case R.id.fragment_list_tv_show_menu_option_item_2:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_NAME_Z_TO_A_OPTION;
                break;
            case R.id.fragment_list_tv_show_menu_option_item_3:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_YEAR_NEW_TO_OLD_OPTION;
                break;
            case R.id.fragment_list_tv_show_menu_option_item_4:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_YEAR_OLD_TO_NEW_OPTION;
                break;
            case R.id.fragment_list_tv_show_menu_option_item_5:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_SEASONS_MORE_TO_LESS;
                break;
            case R.id.fragment_list_tv_show_menu_option_item_6:
                sortType = CustomLibraryConstants.SORT_TV_SHOW_SEASONS_LESS_TO_MORE;
                break;
        }

        recyclerViewAdapter.setTvShowList(sortType);
        return super.onOptionsItemSelected(item);
    }




}
