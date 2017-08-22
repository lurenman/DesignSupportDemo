package com.example.administrator.designsupportdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 * 发现recycleView才能产生这种悬浮效果
 * 应该是design要求的结果
 */

public class ListFragment1 extends Fragment {
    private RecyclerView recycler_view;
    private List<String> mDatas=new ArrayList<String>();
    private static final String TAG = "ListFragment1";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logger.e(TAG,"onAttach-------------------------------");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 10; i++) {
            mDatas.add("item"+i);
        }
        Logger.e(TAG,"onCreate-------------------------------");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(),R.layout.fragment_list1,null);
        recycler_view= (RecyclerView) view.findViewById(R.id.recycler_view);
        Logger.e(TAG,"onCreateView-------------------------------");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logger.e(TAG,"onActivityCreated-------------------------------");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler_view.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler_view.setAdapter(new RecyclerViewAdapter(getContext(),mDatas));
        Logger.e(TAG,"onViewCreated-------------------------------");
    }

    @Override
    public void onStart() {
        super.onStart();
        Logger.e(TAG,"onStart-------------------------------");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logger.e(TAG,"onResume-------------------------------");
    }

    @Override
    public void onPause() {
        super.onPause();
        Logger.e(TAG,"onPause-------------------------------");
    }

    @Override
    public void onStop() {
        super.onStop();
        Logger.e(TAG,"onStop-------------------------------");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.e(TAG,"onDestroyView-------------------------------");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.e(TAG,"onDestroy-------------------------------");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Logger.e(TAG,"onDetach-------------------------------");
    }

}
