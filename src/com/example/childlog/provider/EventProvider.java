package com.example.childlog.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;

import com.example.childlog.provider.EventHelper.EventColumns;
import com.example.childlog.provider.EventTypeHelper.EventTypeColumns;

public class EventProvider extends ContentProvider {

	private static final String TAG = "EventProvider";
	
	private static final String DATABASE_NAME = "childlog.db";
	private static final int DATABASE_VERSION = 2;
	private static final String T_EVENT = "event";
	private static final String T_EVENT_TYPE = "event_type";
	
    /**
     * This class helps open, create, and upgrade the database file.
     */
    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + T_EVENT + " ("
                    + EventColumns._ID + " INTEGER PRIMARY KEY,"
                    + EventColumns.CREATE + " INTEGER,"
                    + EventColumns.EVENT_TYPE_ID + " INTEGER "
                    + ");");
            
            db.execSQL("CREATE TABLE " + T_EVENT_TYPE + " ("
            		+ EventTypeColumns._ID + " INTEGER PRIMARY KEY,"
            		+ EventTypeColumns.NAME + " TEXT "
            		+ ");");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + T_EVENT);
            db.execSQL("DROP TABLE IF EXISTS " + T_EVENT_TYPE );
            onCreate(db);
        }
    }
	
	
	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri arg0, ContentValues arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3,
			String arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return 0;
	}

}
