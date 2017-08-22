package com.example.administrator.designsupportdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.designsupportdemo.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/19.
 *
 */

public class ListFragment extends Fragment {
    private ListView lv_listView;
    private List<String> mDatas=new ArrayList<String>();
    private ListViewAdapter mListViewAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 10; i++) {
            mDatas.add("item"+i);
        }
        mListViewAdapter=new ListViewAdapter(getContext(),mDatas);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(),R.layout.fragment_list,null);
        lv_listView = (ListView) view.findViewById(R.id.lv_listView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (null!=mListViewAdapter)
        lv_listView.setAdapter(mListViewAdapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
       // if (null!=mDatas)
       // mDatas.clear();
    }
}
