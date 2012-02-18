package com.example.childlog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventsListAdapter extends BaseAdapter {
	private Context context;
	private Event[] eventsList;

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
		eventDate.setText(eventsList[position].getDateAdd().toString());
		return null;
	}

}
