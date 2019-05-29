package com.example.laprap_pc;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LapRap extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap_rap);
        listView=findViewById(R.id.cau_list);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.cautaomay); //Thiết lập tiêu đề nếu muốn
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(this, R.array.cacbuoclaprap, android.R.layout.simple_list_item_1);
        listView.setAdapter(aa);
    }
}
