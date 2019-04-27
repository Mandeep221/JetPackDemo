package com.msarangal.androidjetpackdemo.room;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by Mandeep Sarangal on 27,April,2019
 */
@Database(entities = {Note.class}, version = 1)
public abstract class NoteRoomDatabase extends RoomDatabase {

    public abstract NoteDao noteDao();

    public static volatile NoteRoomDatabase noteRoomDatabase;

    public static NoteRoomDatabase getDatabase(final Context context){
        if(noteRoomDatabase == null){
            synchronized (NoteRoomDatabase.class){
                if(noteRoomDatabase == null){
                    noteRoomDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            NoteRoomDatabase.class,
                            "note_database").build();
                }
            }
        }
        return noteRoomDatabase;
    }
}

