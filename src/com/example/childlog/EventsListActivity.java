package com.example.childlog;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;

public class EventsListActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Context context = this;
		super.onCreate(savedInstanceState);
		
		setListAdapter(new EventsListAdapter(context));
	}

}
