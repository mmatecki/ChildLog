package com.example.childlog.db;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class EventsDataSource {

	// Database fields
		private SQLiteDatabase database;
		private ChildLogDbHelper dbHelper;
		private String[] allColumns = { ChildLogDbHelper.COLUMN_ID,
				ChildLogDbHelper.COLUMN_EVENT_TIME, ChildLogDbHelper.COLUMN_EVENT_TYPE };

		public EventsDataSource(Context context) {
			dbHelper = new ChildLogDbHelper(context);
		}

		public void open() throws SQLException {
			database = dbHelper.getWritableDatabase();
		}

		public void close() {
			dbHelper.close();
		}

		public ChildEvent createEvent(String eventType) {
			ContentValues values = new ContentValues();
			values.put(ChildLogDbHelper.COLUMN_EVENT_TIME, System.currentTimeMillis());
			values.put(ChildLogDbHelper.COLUMN_EVENT_TYPE, eventType);
			long insertId = database.insert(ChildLogDbHelper.TABLE_EVENTS, null,
					values);
			// To show how to query
			Cursor cursor = database.query(ChildLogDbHelper.TABLE_EVENTS,
					allColumns, ChildLogDbHelper.COLUMN_ID + " = " + insertId, null,
					null, null, null);
			cursor.moveToFirst();
			return cursorToEvent(cursor);
		}

		public void deleteEvent(ChildEvent event) {
			long id = event.getId();
			System.out.println("Event deleted with id: " + id);
			database.delete(ChildLogDbHelper.TABLE_EVENTS, ChildLogDbHelper.COLUMN_ID
					+ " = " + id, null);
		}

		public List<ChildEvent> getAllEvents() {
			List<ChildEvent> events = new ArrayList<ChildEvent>();
			Cursor cursor = database.query(ChildLogDbHelper.TABLE_EVENTS,
					allColumns, null, null, null, null, null);
			cursor.moveToFirst();
			while (!cursor.isAfterLast()) {
				ChildEvent event = cursorToEvent(cursor);
				events.add(event);
				cursor.moveToNext();
			}
			// Make sure to close the cursor
			cursor.close();
			return events;
		}

		private ChildEvent cursorToEvent(Cursor cursor) {
			ChildEvent event = new ChildEvent();
			event.setId(cursor.getLong(0));
			event.setEventTime(new Timestamp(cursor.getLong(1)));
			event.setEventType(cursor.getString(2));
			return event;
		}	
	
}
