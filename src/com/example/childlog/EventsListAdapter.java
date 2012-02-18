package com.example.childlog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.childlog.db.ChildEvent;
import com.example.childlog.db.EventsDataSource;

public class EventsListAdapter extends BaseAdapter {
	private Context context;
	private ChildEvent[] eventsList = {};
	
	public EventsListAdapter(Context context){
		this.context = context;
		EventsDataSource db = new EventsDataSource(context);
		db.open();
		eventsList = db.getAllEvents().toArray(eventsList);
		db.close();
	}

	public int getCount() {
		return eventsList.length;
	}

	public Object getItem(int position) {
		return eventsList[position];
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		TextView eventName;
		TextView eventDate;
		
		if (convertView == null) {
			view = LayoutInflater.from(context).inflate(
					R.layout.events_adding_menu_item, null);
		}
		
		eventName = (TextView) view.findViewById(R.id.tvEventsList_Name);
		eventDate = (TextView) view.findViewById(R.id.tvEventsList_Date);
		
		eventName.setText(eventsList[position].getEventType().toString());
		eventDate.setText(eventsList[position].getEventTime().toString());
		return null;
	}

}
