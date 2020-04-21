package com.example.listview;

import android.view.View;
import android.view.ViewGroup;

interface Adapterfilmes {
    int getCount();

    Object getItem(int position);

    long getItemId(int position);

    View getView(int position, View view, ViewGroup parent);
}
