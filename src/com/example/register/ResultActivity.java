package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class ResultActivity extends Activity{
	protected void onCreate (BundlesavedInstanceState){
		super.onCreate(savedInstanceState);
		setContenView(R.layout.activity_result);
		TextView resultName=(TextView)findViewById(R.id.resultName);
		TextView resultPsd=(TextView)findViewById(R.id.resultPsd);
		TextView resultGender=(TextView)findViewById(R.id.resultgender);
		TextView resultCity=(TextView)findViewById(R.id.resultCity);
		Intent intent=getIntent();
		resultName.setText(intent.getStringExtra("name"));
		resultPsd.setText(intent.getStringExtra("Psd"));
		resultGender.setText(intent.getStringExtra("Gender"));
		resultCity.setText(intent.getStringExtra("city"));
	}
}

