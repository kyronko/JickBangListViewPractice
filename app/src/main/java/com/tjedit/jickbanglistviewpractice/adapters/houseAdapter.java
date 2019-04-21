package com.tjedit.jickbanglistviewpractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.tjedit.jickbanglistviewpractice.R;

import java.util.List;

public class houseAdapter extends ArrayAdapter <houseAdapter> {
    Context mContext;
    List<houseAdapter> mList;
    LayoutInflater inf;
    public houseAdapter(Context context, List<houseAdapter>list){
        super(context, R.layout.list_item,list);

    }
}
