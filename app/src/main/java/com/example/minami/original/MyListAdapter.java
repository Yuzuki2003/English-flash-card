package com.example.minami.original;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
/**
 * Created by minami on 2017/07/02.
 */

public class MyListAdapter extends ArrayAdapter {
    Context mContext;
    LayoutInflater mInflater;
    int mResourceId;


    public MyListAdapter(Context context, int resourceId) {
        super(context, resourceId);
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mResourceId = resourceId;
    }

}
