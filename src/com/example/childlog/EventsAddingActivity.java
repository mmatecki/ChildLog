package com.example.childlog;

import android.app.Activity;
import android.content.Context;
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
				onClickButton();
			}
		});
	}
	
	/** draft **/
	private void onClickButton(){
		// do nothing
	}

}
