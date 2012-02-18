package com.example.childlog.activity;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;

import com.example.childlog.db.ChildEvent;
import com.example.childlog.db.EventsDataSource;

public class EventList extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		EventsDataSource datasource = new EventsDataSource(this);
		datasource.open();

		List<ChildEvent> events = datasource.getAllEvents();
		datasource.close();
	}
	
}
