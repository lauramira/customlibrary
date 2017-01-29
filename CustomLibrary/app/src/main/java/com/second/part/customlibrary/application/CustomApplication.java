package com.second.part.customlibrary.application;

import android.app.Application;

import com.second.part.customlibrary.manager.LibraryManager;

/**
 * Created by Usuario on 29/01/2017.
 */

public class CustomApplication extends Application {
    private static CustomApplication instance;

    private LibraryManager libraryManager;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        libraryManager = new LibraryManager();
    }

    public static CustomApplication getInstance() {
        return instance;

    }


    public LibraryManager getLibraryManager() {
        return libraryManager;
    }
}
