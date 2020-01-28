package com.example.projectandroid_splashscreen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "amazigh.db";
    public static final String TABLE_NAME = "items_table";
    public static final String COL_1 = "id";
    public static final String COL_2 = "nlnaam";
    public static final String COL_3 = "amznaam";
    public static final String COL_4 = "img";
    public static final String COL_5 = "sound";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (id INTEGER PRIMARY KEY AUTOINCREMENT, nlnaam STRING, amznaam STRING, img STRING, sound STRING)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
    }
}
