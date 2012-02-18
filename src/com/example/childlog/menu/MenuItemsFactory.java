package com.example.childlog.menu;

import com.example.childlog.R;

public class MenuItemsFactory {
	private static final Integer[] iconsIds = {
		R.drawable.sleep,
		R.drawable.wake_up,
		R.drawable.diaper,
		R.drawable.bath,
		R.drawable.food
	};

	private static final Integer[] namesIds = {
		R.string.menu_sleep,
		R.string.menu_wake_up,
		R.string.menu_diaper,
		R.string.menu_bath,
		R.string.menu_food
	};
	
	private static final Class<?>[] activityClasses = {
		null,
		null,
		null,
		null,
		null
	};

	public static MainMenuItem[] getItems() {
		MainMenuItem[] items = new MainMenuItem[namesIds.length];
		for (int i = 0; i < items.length; i++) {
			items[i] = new MainMenuItem(iconsIds[i], namesIds[i], activityClasses[i]);
		}
		return items;
	}

}
