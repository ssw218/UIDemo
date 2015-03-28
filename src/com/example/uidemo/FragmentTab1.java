package com.example.uidemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTab1 extends Fragment {
	private RecyclerView mRecyclerView;
	private RecyclerView.Adapter mAdapter;
	private RecyclerView.LayoutManager mLayoutManager;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.tab1, container, false);
		mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
	    mRecyclerView.setHasFixedSize(true);
	    mLayoutManager = new LinearLayoutManager(getActivity());
	    mRecyclerView.setLayoutManager(mLayoutManager);
	    mAdapter = new RecyclerViewAdapter(new String[]{"1", "2", "3", "4"});
	    mRecyclerView.setAdapter(mAdapter);
		
		return view;
	}
	
	
}