package com.example.administrator.designsupportdemo;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/21.
 */

public class BottomSheetActivity extends BaseActivity {
    private TextView tv_BottomSheetBehavior;
    private TextView tv_BottomSheetDialog;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottom_sheet;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_bottomsheet);
        tv_BottomSheetBehavior = (TextView) findViewById(R.id.tv_BottomSheetBehavior);
        tv_BottomSheetDialog = (TextView) findViewById(R.id.tv_BottomSheetDialog);
        bottom_sheet = (FrameLayout) findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottom_sheet);
        behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);


    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        tv_BottomSheetBehavior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(behavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }else {
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
            }
        });
        tv_BottomSheetDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //可以搞个类继承BottomSheetDialog这里就不演示了
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(BottomSheetActivity.this);
                bottomSheetDialog.setContentView(R.layout.dailog_tjyhk);
                LinearLayout ll_nh = (LinearLayout)bottomSheetDialog.findViewById(R.id.ll_nh);
                ImageView iv_cancle=(ImageView)bottomSheetDialog.findViewById(R.id.iv_cancle);
                ll_nh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //bottomSheetDialog.dismiss();
                        Toast.makeText(getApplicationContext(),"ll_nh----click",Toast.LENGTH_SHORT).show();
                    }
                });
                iv_cancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.show();
            }
        });

    }

    @Override
    protected void loadData() {

    }
}
