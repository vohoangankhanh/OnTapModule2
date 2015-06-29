package com.example.bai10_ontap.fragments;

import com.example.bai10_ontap.MainActivity;
import com.example.bai10_ontap.constant.FragmentId;

import android.app.Fragment;
import android.os.Bundle;

public class BaseFragment extends Fragment{
	public void addFrgment(FragmentId id, Bundle bundle) {
		MainActivity activity = (MainActivity) getActivity();
		activity.addFragment(id, bundle);
	}
}
