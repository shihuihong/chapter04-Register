package com.example.register;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChooseCityActivity extends ExpandableListActivity{
	private String[] provinces =new String []{"江西","江苏","浙江"};
	private String[][] cities =new String [][]{{"南昌","九江","赣州","吉安"},
			{"南京","苏州","无锡","扬州"},{"杭州","温州","台州","金华"}};
			public void onCreate(Bundle savedInstanceState){
				super.onCreate(savedInstanceState);
				ExpandableListAdapter adapter=new BaseExpandableListAdapter(){
					public Object getChild (int groupPosition ,int chilPosition){
						return cities[groupPosition][chilPosition];
						
					}
					public long getChildId(int groupPosition,int childPosition){
						return childPosition;
					}
					public int getChildId(int groupPosition){
						return cities[groupPosition].length;
					}
					private TextView getTextView(){
						AbsListView.LayoutParams ip=new AbsListView.LayoutParams(
						ViewGroup.LayoutParams.MATCH_PARENT,64);
						TextView textView=new TextView(ChooseCityActivity.this);
						textView.setLayoutParams(ip);
						textView.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
						textView.setPadding(36,0,0,0);
						textView.setTextSize(20);
						return textView;						
						
					}
					public View getChildView(int groupPosition,int chlidPosition,
							boolean isLastChild,View convertView,ViewGroup parent){
						TextView textView=getTextView();
						textView.setText(getChild(groupPosition,childPosition).
								toString());
						return textView;
					}
					public Object getGroup(int groupPosition){
						return provinces[groupPosition];
					}
					public int getGroupCount(){
						return provinces.length;
				}
					public long getGroupId(int groupPosition){
						return groupPosition;
					
				}
					public View getGroupView(int groupPosition,boolean isExpanded,
							View convertView,Viewgroup parent){
						LinearLayout 11=new LinearLayout(chooseCityActivity.this);
						ll.setOrientation(LinearLayout.VERTICAL);
						ImageView logo=new ImageView(ChooseCityActivity.this);
						ll.addView(logo);
						TextView textView=getTextView();
						textView.setText(getGroup(groupPosition).toString());
						ll.addView(textView);
						return ll;
						
						
					}
					public  boolean isChildSelectable(int groupPosition,int
							childPosition){
						return true;
						
					        }
							);
				    setListAdapter(adapter);
				    getExpandableListenerView().setOnChildClickListenner(
				    		new OnChildClickListener()
					@Override
					public int getChildrenCount(int arg0) {
						// TODO Auto-generated method stub
						return 0;
					}
					@Override
					public View getGroupView(int arg0, boolean arg1, View arg2,
							ViewGroup arg3) {
						// TODO Auto-generated method stub
						return null;
					}
					@Override
					public boolean hasStableIds() {
						// TODO Auto-generated method stub
						return false;
					}{
				   public  boolean onChildSelectable	(ExpandableListenerView parent,View 
						   source,
						   int groundPosition,intchildPosition,long id){
					   Intent intent=getIntent();
					   Bundle data=new Bundle();
					   data.putString("city", cities[groupPosition][childPosition]);
					   intent.putExtra(data);
					   ChooseCityActivity.this.setResult(0,intent);
					   chooseCityActivity.this.finish();
					   return false;
				   }
				    		});
				}
			}
				    		
					
					
					
					
					
					
}
