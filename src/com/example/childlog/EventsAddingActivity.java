package com.example.childlog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.childlog.menu.MainMenuItem;
import com.example.childlog.menu.MenuItemsFactory;
import com.example.childlog.menu.MenuListAdapter;

public class EventsAddingActivity extends Activity {
	private Context context = this;
	private MainMenuItem[] menuItems;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events_adding_menu);
		
		menuItems = MenuItemsFactory.getItems();
		
		GridView gridView = (GridView) findViewById(R.id.gvEventsAdding_menu);
		
		gridView.setAdapter(new MenuListAdapter(context, menuItems));
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				onClickButton(position);
			}
		});
	}
	
	/** draft **/
	private void onClickButton(int position){
		Class<?> activityClass = menuItems[position].getActivityClass();
		if (activityClass != null) {
			Intent intent = new Intent(context, activityClass);
			startActivity(intent);
		}
	}

}
