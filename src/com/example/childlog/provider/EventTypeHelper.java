package com.example.childlog.provider;

import android.provider.BaseColumns;

public class EventTypeHelper {
	
	public static final class EventTypeColumns implements BaseColumns {
		
		private EventTypeColumns() {
		}

		public static final String TABLE_NAME = "event_type";
		private static final String SCHEME = "content://";
		public static final String NAME = "name";
		public static final String DEFAULT_SORT_ORDER = "name";
	}
}
