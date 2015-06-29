package com.example.bai10_ontap.fragments;

import com.example.bai10_ontap.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailFragment extends BaseFragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		Bundle bundle = getArguments();
		//get Hocsinh
		
		View view = inflater.inflate(R.layout.fragment_detail, container, false);
		
		return view;
	}
	
}
