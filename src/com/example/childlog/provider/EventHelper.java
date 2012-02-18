package com.example.childlog.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public class EventHelper {

	public static final String AUTHORITY = "com.example.childlog.provider.Event";

    private EventHelper() {}
    
    public static final class EventColumns implements BaseColumns {

    	private EventColumns() {}

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/event");

//        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.note";

//        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.note";

        public static final String DEFAULT_SORT_ORDER = "created DESC";

        public static final String EVENT_TYPE_ID = "event_type_id";

        public static final String CREATE = "create";

//        public static final String MODIFIED_DATE = "modified";
    }
}
