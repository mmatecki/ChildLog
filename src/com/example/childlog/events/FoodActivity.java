package com.example.childlog.events;

import com.example.childlog.R;
import com.example.childlog.db.EventsDataSource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class FoodActivity extends Activity {
	private Context context = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.karmienie);
		
		EventsDataSource db = new EventsDataSource(context);
		db.open();
		db.createEvent("fooooooooood");
		db.close();
	}

}
