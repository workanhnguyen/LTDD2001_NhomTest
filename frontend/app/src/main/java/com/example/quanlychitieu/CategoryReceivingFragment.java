package com.example.quanlychitieu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class CategoryReceivingFragment extends Fragment {
    ListView lv;
    private CategoryReceiveAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.category_list_receive, container, false);
        lv = view.findViewById(R.id.listViewReceiving);
        adapter = new CategoryReceiveAdapter(getContext(), ListCategory.getCategoryReceivingList());
        lv.setAdapter(adapter);
        return view;
    }
}
