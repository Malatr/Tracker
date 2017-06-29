package com.trevor.android.tracker.data;

import android.provider.BaseColumns;

/**
 * Created by Trevor on 6/25/2017.
 */

public final class SQLContract {

    private SQLContract() {
    }

    public static class tableJA implements BaseColumns {

        public static final String TABLE_NAME = "jessica";
        public static final String PRIMARY_KEY = "_id";
        public static final String COLUMN_NAME_DATE = "date";

        public static final String COLUMN_NAME_PERIOD_START = "periodstart";
        public static final String COLUMN_NAME_PERIOD_END = "periodend";
        public static final String COLUMN_NAME_SPOTTING = "spotting";
        public static final String COLUMN_NAME_CRAMPING = "cramping";

        public static final String COLUMN_NAME_HEADACHE = "headache";
        public static final String COLUMN_NAME_SHOULDER_PAIN = "shoulderpain";
        public static final String COLUMN_NAME_SORE_THROAT = "sorethroat";

        public static final String COLUMN_NAME_DIARRHEA = "diarrhea";
        public static final String COLUMN_NAME_FOOD_CRAVINGS = "foodcravings";
        public static final String COLUMN_NAME_UNREASONABLE_HUNGER = "unreasonablehunger";

        public static final String COLUMN_NAME_SEX_PIV = "sexpiv";
        public static final String COLUMN_NAME_SEX_PIA = "sexpia";
        public static final String COLUMN_NAME_SEX_ORAL = "sex oral";
        public static final String COLUMN_NAME_HIGH_SEX_DRIVE = "highsexdrive";
        public static final String COLUMN_NAME_HERPES_OUTBREAK = "herpesoutbreak";
        public static final String COLUMN_NAME_STEPS = "steps";
        public static final String COLUMN_NAME_SLEEP_TIME = "sleeptimewhole";
        public static final String COLUMN_NAME_SLEEP_TIME_DECIMAL = "sleeptimedecimal";
        public static final String COLUMN_NAME_INSOMNIA = "insomnia";
        public static final String COLUMN_NAME_NIGHTMARES = "nightmares";
        public static final String COLUMN_NAME_CALL_DURING_NIGHT = "callduringnight";

        public static final String COLUMN_NAME_WORK_HOURS = "workhourswhole";
        public static final String COLUMN_NAME_WORK_HOURS_DECIMAL = "workhoursdecimal";
        public static final String COLUMN_NAME_EMOTION = "emotion";
        public static final String COLUMN_NAME_FOCUS = "focus";
        public static final String COLUMN_NAME_ENERGY = "energy";

        public static final String SCALE_LEVEL_NULL = "0";
        public static final String SCALE_LEVEL_ONE = "1";
        public static final String SCALE_LEVEL_TWO = "2";
        public static final String SCALE_LEVEL_THREE = "3";
        public static final String SCALE_LEVEL_FOUR = "4";

    }
}
