package com.example.childlog.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.childlog.R;

public class MenuListAdapter extends BaseAdapter {
	private Context context;
	private MainMenuItem[] menuItems;

	public MenuListAdapter(Context context, MainMenuItem[] menuItems) {
		this.context = context;
		this.menuItems = menuItems;
	}

	public int getCount() {
		return menuItems.length;
	}

	public Object getItem(int position) {
		return menuItems[position];
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ImageView imageView;
		TextView textView;

		if (convertView == null) {
			view = LayoutInflater.from(context).inflate(
					R.layout.events_adding_menu_item, null);
		}

		imageView = (ImageView) view.findViewById(R.id.ivMainMenuItem_Icon);
		textView = (TextView) view.findViewById(R.id.tvMainMenuItem_Name);

		imageView.setImageResource(menuItems[position].getIconId());
		textView.setText(menuItems[position].getNameId());
		return view;
	}
}