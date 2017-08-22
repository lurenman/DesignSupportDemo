package com.example.administrator.designsupportdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/8/19.
 */

public class NavigationActivity extends BaseActivity {
    private ImageView iv_menu;
    private DrawerLayout dl_drawer;
    private NavigationView nv_navigation;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_navigation);
        iv_menu = (ImageView) findViewById(R.id.iv_menu);
        dl_drawer = (DrawerLayout) findViewById(R.id.dl_drawer);
        nv_navigation = (NavigationView) findViewById(R.id.nv_navigation);

    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl_drawer.openDrawer(GravityCompat.START);
            }
        });
        nv_navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //关闭drawer
                dl_drawer.closeDrawers();
                return true;
            }
        });

    }

    @Override
    protected void loadData() {

    }
}
