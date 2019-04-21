package com.tjedit.jickbanglistviewpractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tjedit.jickbanglistviewpractice.R;
import com.tjedit.jickbanglistviewpractice.datas.Data;

import java.util.List;

public class HouseAdapter extends ArrayAdapter <Data> {
    Context mContext;
    List<Data> mList;
    LayoutInflater inf;
    public HouseAdapter(Context context, List<Data>list){
        super(context, R.layout.list_item,list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);


    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row = convertView;
        if(row==null)
        {
            row = inf.inflate(R.layout.list_item,null);
        }
        Data houseData = mList.get(position);
        TextView houseMy = row.findViewById(R.id.houseMy);
        TextView houseFloor = row.findViewById(R.id.houseFloor);
        TextView houseAddress = row.findViewById(R.id.houseAddress);

        houseMy.setText(houseData.houseMy);
        houseFloor.setText(String.format("%d 층",houseData.houseFloor));
        houseAddress.setText(houseData.houseAddress);


        return row;
    }
}
