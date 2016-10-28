package com.example.register;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {
	
	registerBtn.setOnClickListener(new OnClickListener){
		String checkResult=checkInfo();
		if(checkResult!=null){
			
			
			Builder builder=new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("出错提示");
			builder.setMessage(checkResult);
			builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int which){
					psd.setText("");
					psd2.setText("");
				}
			});
			builder.create().show();
	}else{
		Intent intent=newIntent(MainActivity.this,ResultActivity.class);
		intent.putExtra("name",name.getText().toString());
		intent.putExtra("psd",psd.getText().toString());
		String gender=male.ischecked()?"男":"女";
		intent.putExtra("name",name.getText().toString());
		intent.putExtra("gender",gender);
		intent.putExtra("city",city.getText().toString());
		starActivity(intent);
	}
}
});
				

