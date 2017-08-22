package com.example.administrator.designsupportdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 */

public class KnowAlmostActivity extends AppCompatActivity {
    private RecyclerView rv_recycler;
    //private FloatingActionButton fab;
    private List<String> mDatas=new ArrayList<String>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initViews();
    }

    private void initVariables() {
        for (int i = 0; i < 10; i++) {
            mDatas.add("item"+i);
        }
    }

    private void initViews() {
        setContentView(R.layout.activity_knowalmost);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rv_recycler = (RecyclerView) findViewById(R.id.rv_recycler);
       // fab=(FloatingActionButton) findViewById(R.id.fab);
        rv_recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv_recycler.setAdapter(new RecyclerViewAdapter(getApplicationContext(),mDatas));
    }
}
