package com.trevor.android.tracker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.trevor.android.tracker.StringArrays.RowValuesStrings;
import static com.trevor.android.tracker.StringArrays.getFieldNames;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_CALL_DURING_NIGHT;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_CRAMPING;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_DATE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_DIARRHEA;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_EMOTION;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_ENERGY;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_FOCUS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_FOOD_CRAVINGS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_HEADACHE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_HIGH_SEX_DRIVE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_INSOMNIA;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_NIGHTMARES;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_PERIOD_END;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_PERIOD_START;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SEX_ORAL;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SEX_PIA;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SEX_PIV;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SHOULDER_PAIN;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SLEEP_TIME;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SLEEP_TIME_DECIMAL;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SORE_THROAT;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_SPOTTING;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_STEPS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_UNREASONABLE_HUNGER;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_WORK_HOURS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_WORK_HOURS_DECIMAL;
import static com.trevor.android.tracker.data.SQLContract.tableJA.PRIMARY_KEY;
import static com.trevor.android.tracker.data.SQLContract.tableJA.TABLE_NAME;

/**
 * Created by Trevor on 6/26/2017.
 */

public class dbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "trackerdatabase";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME +
                    " (" +
                    PRIMARY_KEY + " INTEGER PRIMARY KEY, " +
                    COLUMN_NAME_DATE + " TEXT, " +
                    COLUMN_NAME_PERIOD_START + " TEXT, " +
                    COLUMN_NAME_PERIOD_END + " TEXT, " +
                    COLUMN_NAME_SPOTTING + " INTEGER, " +
                    COLUMN_NAME_CRAMPING + " INTEGER, " +
                    COLUMN_NAME_HEADACHE + " INTEGER, " +
                    COLUMN_NAME_SHOULDER_PAIN + " INTEGER, " +
                    COLUMN_NAME_SORE_THROAT + " INTEGER, " +
                    COLUMN_NAME_DIARRHEA + " INTEGER, " +
                    COLUMN_NAME_FOOD_CRAVINGS + " INTEGER, " +
                    COLUMN_NAME_UNREASONABLE_HUNGER + " INTEGER, " +
                    COLUMN_NAME_SEX_PIV + " INTEGER, " +
                    COLUMN_NAME_SEX_PIA + " INTEGER, " +
                    COLUMN_NAME_SEX_ORAL + " INTEGER," +
                    COLUMN_NAME_HIGH_SEX_DRIVE + " INTEGER, " +
                    COLUMN_NAME_STEPS + " INTEGER, " +
                    COLUMN_NAME_SLEEP_TIME + " INTEGER, " +
                    COLUMN_NAME_SLEEP_TIME_DECIMAL + " INTEGER, " +
                    COLUMN_NAME_INSOMNIA + " INTEGER, " +
                    COLUMN_NAME_NIGHTMARES + " INTEGER, " +
                    COLUMN_NAME_CALL_DURING_NIGHT + " INTEGER, " +
                    COLUMN_NAME_WORK_HOURS + " INTEGER, " +
                    COLUMN_NAME_WORK_HOURS_DECIMAL + " INTEGER, " +
                    COLUMN_NAME_EMOTION + " INTEGER, " +
                    COLUMN_NAME_FOCUS + " INTEGER, " +
                    COLUMN_NAME_ENERGY + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public dbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static void insertRow() {
        int its = 1;
        String[] rowIndexStrings = getFieldNames();
        for (int i = 1; i < its; i++) {
            ContentValues values = new ContentValues();
            values.put(rowIndexStrings[i], RowValuesStrings[i]);
            /*
            values.put(COLUMN_NAME_PERIOD_START, "06-07-2016");
            values.put(COLUMN_NAME_PERIOD_END, "06-08-2016");
            values.put(COLUMN_NAME_SPOTTING, 1);
            values.put(COLUMN_NAME_CRAMPING, 1);
            values.put(COLUMN_NAME_HEADACHE, 1);
            values.put(COLUMN_NAME_SHOULDER_PAIN, 1);
            values.put(COLUMN_NAME_SORE_THROAT, 1);
            values.put(COLUMN_NAME_DIARRHEA, 1);
            values.put(COLUMN_NAME_FOOD_CRAVINGS, 1);
            values.put(COLUMN_NAME_UNREASONABLE_HUNGER, 1);
            values.put(COLUMN_NAME_SEX_PIV, 1);
            values.put(COLUMN_NAME_SEX_PIA, 1);
            values.put(COLUMN_NAME_SEX_ORAL, 1);
            values.put(COLUMN_NAME_HIGH_SEX_DRIVE, 1);
            values.put(COLUMN_NAME_STEPS, 1);
            values.put(COLUMN_NAME_SLEEP_TIME, 1);
            values.put(COLUMN_NAME_SLEEP_TIME_DECIMAL, 1);
            values.put(COLUMN_NAME_INSOMNIA, 1);
            values.put(COLUMN_NAME_NIGHTMARES, 1);
            values.put(COLUMN_NAME_CALL_DURING_NIGHT, 1);
            values.put(COLUMN_NAME_WORK_HOURS, 1);
            values.put(COLUMN_NAME_WORK_HOURS_DECIMAL, 1);
            values.put(COLUMN_NAME_EMOTION, 1);
            values.put(COLUMN_NAME_FOCUS, 1);
            values.put(COLUMN_NAME_ENERGY, 1);
            */
        }
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
