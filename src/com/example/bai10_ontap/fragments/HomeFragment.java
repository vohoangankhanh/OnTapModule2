package com.example.bai10_ontap.fragments;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.bai10_ontap.R;
import com.example.bai10_ontap.constant.FragmentId;

public class HomeFragment extends BaseFragment implements OnClickListener {

	TextView tvDate;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_home, container, false);

		View btn1 = view.findViewById(R.id.button1);
		View btn2 = view.findViewById(R.id.button2);
		tvDate = (TextView) view.findViewById(R.id.textView1);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);

		tvDate.setText("30/6/2015");
		tvDate.setOnClickListener(this);
		
		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.button1:
			showDialog();
			break;
		case R.id.button2:
			
			Bundle bundle = new Bundle();
			//add 
			//Hocsinh --> bundle
			
			addFrgment(FragmentId.DETAIL, bundle);
			
			break;
		case R.id.textView1:
			showDateDialog();
			break;
		default:
			break;
		}

	}
	
	private void showDialog(){
		
		AlertDialog.Builder builder = new Builder(getActivity());
		
		builder.setTitle("aadfadsf");
		builder.setMessage("alasdfjafasdfasf  asdf");
		builder.setNegativeButton("Thoat", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
			}
		});
		
		builder.show();
		
	}
	
	private void showDateDialog(){
		DatePickerDialog dialog = new DatePickerDialog(getActivity(), new OnDateSetListener() {
			
			@Override
			public void onDateSet(DatePicker view, int year, int monthOfYear,
					int dayOfMonth) {
				tvDate.setText( dayOfMonth + "/" + monthOfYear + "/" + year );
			}
		}, 2015, 6, 30);
		dialog.show();
	}
	
}
