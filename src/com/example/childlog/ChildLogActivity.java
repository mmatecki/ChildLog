package com.example.childlog;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class ChildLogActivity extends TabActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		intent = new Intent(this, EventsAddingActivity.class);
		spec = tabHost
				.newTabSpec("events_adding")
				.setIndicator(getString(R.string.events_tab_adding),res.getDrawable(android.R.drawable.ic_menu_add))
				.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent(this, EventsListActivity.class);
		spec = tabHost
				.newTabSpec("events_list")
				.setIndicator(getString(R.string.events_tab_list),res.getDrawable(android.R.drawable.ic_menu_agenda))
				.setContent(intent);
		tabHost.addTab(spec);
	}
}