package com.example.administrator.designsupportdemo;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.administrator.designsupportdemo.adapter.GridAdapter;
import com.example.administrator.designsupportdemo.javabean.HzDataClass;
import com.example.administrator.designsupportdemo.retrofit.DAL;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/8/21.
 * http://gank.io/api/data/福利/10/1
 */

public class StaggeredGridActivity extends BaseActivity {
    private static final String TAG = "StaggeredGridActivity";
    private RecyclerView recycler_view;
    private StaggeredGridLayoutManager mLayoutManager;
    private GridAdapter mAdapter;
    List<HzDataClass.DataBean> mDataArray = new ArrayList<HzDataClass.DataBean>();

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_staggeredgrid);
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recycler_view.setLayoutManager(mLayoutManager);

    }

    @Override
    protected void loadData() {
        Call<JSONObject> meiZiData = DAL.shareDAL.baseAPIService().getMeiZiData();

        meiZiData.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                JSONObject body = response.body();
                Logger.e(TAG,body.toString());

            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {

            }
        });



    }
}
