package com.example.administrator.designsupportdemo;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_NavigationView;
    private TextView tv_DrawerLayout;
    private TextView tv_FloatingAction;
    private TextView tv_CoordinatorLayout;
    private TextView tv_collapingToolbarLayout;
    private TextView tv_fangzhihu;
    private TextView tv_StaggeredGrid;
    private TextView tv_bottomsheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvents();
    }
    private void initView() {
        tv_NavigationView = (TextView) findViewById(R.id.tv_NavigationView);
        tv_DrawerLayout = (TextView) findViewById(R.id.tv_DrawerLayout);
        tv_FloatingAction = (TextView) findViewById(R.id.tv_FloatingAction);
        tv_CoordinatorLayout = (TextView) findViewById(R.id.tv_CoordinatorLayout);
        tv_collapingToolbarLayout = (TextView) findViewById(R.id.tv_collapingToolbarLayout);
        tv_fangzhihu = (TextView) findViewById(R.id.tv_fangzhihu);
        tv_StaggeredGrid = (TextView) findViewById(R.id.tv_StaggeredGrid);
        tv_bottomsheet = (TextView) findViewById(R.id.tv_bottomsheet);


    }
    private void initEvents() {
        tv_NavigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(intent);
            }
        });
        tv_DrawerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DrawerLayoutActivity.class);
                startActivity(intent);
            }
        });
        tv_FloatingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FloatingActionButtonActivity.class);
                startActivity(intent);
            }
        });
        tv_CoordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CoordinatorLayoutActivity.class);
                startActivity(intent);
            }
        });
        tv_collapingToolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CollapsingToolbarLayoutActivity.class);
                startActivity(intent);
            }
        });

        tv_fangzhihu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,KnowAlmostActivity.class);
                startActivity(intent);
            }
        });
        tv_StaggeredGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StaggeredGridActivity.class);
                startActivity(intent);
            }
        });
        tv_bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BottomSheetActivity.class);
                startActivity(intent);
            }
        });
    }

}
