package com.example.childlog.events;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.childlog.R;
import com.example.childlog.db.EventsDataSource;

public class FoodActivity extends Activity {
	private Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food);

		final EventsDataSource db = new EventsDataSource(context);
		db.open();
		db.createEvent("fooooooooood lewy cyœ");
		db.close();

		Button bLewa = (Button) findViewById(R.id.bLewa);
		bLewa.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				db.open();
				db.createEvent("fooooooooood lewy cyœ");
				db.close();
				Toast.makeText(context, "lewy cysiek", Toast.LENGTH_SHORT).show();
			}
		});

		Button bPrawa = (Button) findViewById(R.id.bPrawa);
		bPrawa.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				db.open();
				db.createEvent("fooooooooood prawy cyœ");
				db.close();
				Toast.makeText(context, "prawy cysiek", Toast.LENGTH_SHORT).show();
			}
		});
	}

}
