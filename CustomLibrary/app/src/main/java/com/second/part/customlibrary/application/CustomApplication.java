package com.second.part.customlibrary.application;

import android.app.Application;

import com.second.part.customlibrary.manager.LibraryManager;

/**
 * Created by Usuario on 29/01/2017.
 */

public class CustomApplication extends Application {
    private LibraryManager libraryManager;

    @Override
    public void onCreate() {
        super.onCreate();
        libraryManager = new LibraryManager();
    }

    public LibraryManager getLibraryManager() {
        return libraryManager;
    }
}
