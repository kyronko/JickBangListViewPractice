package com.tjedit.jickbanglistviewpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import com.tjedit.jickbanglistviewpractice.adapters.HouseAdapter;
import com.tjedit.jickbanglistviewpractice.databinding.ActivityMainBinding;
import com.tjedit.jickbanglistviewpractice.datas.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding act;
    List <Data> houselist = new ArrayList<>();
    HouseAdapter mhouseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        fullhouse();

        mhouseAdapter = new HouseAdapter(MainActivity.this, houselist);
        act.houselist.setAdapter(mhouseAdapter);
    }
    void fullhouse()
    {
        houselist.add(new Data("100/13",2,"경상북도 구미시 송정동"));
        houselist.add(new Data("100/15",3,"경상북도 구미시 신평동"));
        houselist.add(new Data("100/13",3,"경상북도 구미시 원편동"));
        houselist.add(new Data("100/13",2,"경상북도 구미시 형곡동"));
        houselist.add(new Data("100/15",2,"경상북도 구미시 신평동"));


    }
}
