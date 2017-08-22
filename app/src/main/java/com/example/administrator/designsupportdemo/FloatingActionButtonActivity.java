package com.example.administrator.designsupportdemo;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/19.
 */

public class FloatingActionButtonActivity extends BaseActivity {
    private FloatingActionButton fab;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_floataction);
        fab = (FloatingActionButton) findViewById(R.id.fab);
    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
               Snackbar.make(v,"Snackbar",Snackbar.LENGTH_LONG).show();
//                Snackbar.make(v, "Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Toast.makeText(
//                                        FloatingActionButtonActivity.this,
//                                        "This is Snackbar",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        }).show();
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
