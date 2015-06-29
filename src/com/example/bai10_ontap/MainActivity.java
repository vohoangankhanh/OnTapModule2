package com.example.bai10_ontap;

import com.example.bai10_ontap.constant.FragmentId;
import com.example.bai10_ontap.fragments.BaseFragment;
import com.example.bai10_ontap.fragments.DetailFragment;
import com.example.bai10_ontap.fragments.HomeFragment;
import com.example.bai10_ontap.fragments.NewFragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//
		addFragment(FragmentId.HOME, null);
	}
	
	public void addFragment(FragmentId id, Bundle bundle){
		
		BaseFragment frag = null;
		
		if( id == FragmentId.HOME){
			frag = new HomeFragment();
		}
		else if( id == FragmentId.DETAIL ){
			frag = new DetailFragment();
		}
		else if( id == FragmentId.NEW ){
			frag = new NewFragment();
		}
		
		//update Bundle
		frag.setArguments(bundle);
		
		//add fragment into contain layout
		FragmentManager manager = getFragmentManager();
		
		//
		FragmentTransaction ts = manager.beginTransaction();
		
		ts.replace(R.id.contain, frag);
		ts.addToBackStack(id.toString());
		
		//
		ts.commit();
		
	}
	
	/*public void addFragmentHome(FragmentId id){
		
		BaseFragment frag = null;
		
		
			frag = new HomeFragment();
		
		
		add fragment into contain layout
		FragmentManager manager = getFragmentManager();
		
		//
		FragmentTransaction ts = manager.beginTransaction();
		
		ts.replace(R.id.contain, frag);
		ts.addToBackStack(id.toString());
		
		//
		ts.commit();
		
	}
	
	public void addFragmentDetail(FragmentId id){
		
		BaseFragment frag = null;
		
		
			frag = new DetailFragment();
		
		
		add fragment into contain layout
		FragmentManager manager = getFragmentManager();
		
		//
		FragmentTransaction ts = manager.beginTransaction();
		
		ts.replace(R.id.contain, frag);
		ts.addToBackStack(id.toString());
		
		//
		ts.commit();
		
	}
	
	public void addFragmentNew(FragmentId id){
		
		BaseFragment frag = null;
		
		
			frag = new NewFragment();
		
		
		add fragment into contain layout
		FragmentManager manager = getFragmentManager();
		
		//
		FragmentTransaction ts = manager.beginTransaction();
		
		ts.replace(R.id.contain, frag);
		ts.addToBackStack(id.toString());
		
		//
		ts.commit();
		
	}*/
	
}
