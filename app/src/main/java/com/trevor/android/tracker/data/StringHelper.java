/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.trevor.android.tracker.data;

import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_CALL_DURING_NIGHT;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_CRAMPING;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_DATE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_DIARRHEA;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_EMOTION;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_ENERGY;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_FOCUS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_FOOD_CRAVINGS;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_HEADACHE;
import static com.trevor.android.tracker.data.SQLContract.tableJA.COLUMN_NAME_HERPES_OUTBREAK;
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

public final class StringHelper {


    public static final String GROUP_NAME_ONE = "Tap here to change date";
    public static final String GROUP_NAME_TWO = "Start with menstruation";
    public static final String GROUP_NAME_THREE = "Start with pain";
    public static final String GROUP_NAME_FOUR = "Start with GI issues";
    public static final String GROUP_NAME_FIVE = "Start with sex";
    public static final String GROUP_NAME_SIX = "Start with steps and sleep";
    public static final String GROUP_NAME_SEVEN = "Not a valid option";
    public static final String MENSTRUAL_DATA_TITLE = "Menstruation Data";
    public static final String PAIN_DATA_TITLE = "Pain Data";
    public static final String GASTROINTESTINAL_DATA_TITLE = "Gastrointestinal Data";
    public static final String SEXUAL_DATA_TITLE = "Sexual Data";
    public static final String SLEEP_DATA_TITLE = "Steps and Sleep Data";
    public static final String MISC_DATA_TITLE = "Miscellaneous Data";

    public static String[] RowValuesStrings;

    /**
     * This method returns a list of popular toy names from the 20th and early 21st centuries.
     * I don't know about you guys, but this definitely brings me back to my childhood...
     *
     * @return A list db field names
     */
    public static String[] knowFieldNames() {
        return new String[]{
                PRIMARY_KEY, //INTEGER PRIMARY KEY
                COLUMN_NAME_DATE, // TEXT
                COLUMN_NAME_PERIOD_START, // TEXT
                COLUMN_NAME_PERIOD_END, // TEXT
                COLUMN_NAME_SPOTTING, // INTEGER
                COLUMN_NAME_CRAMPING, // INTEGER
                COLUMN_NAME_HEADACHE, // INTEGER
                COLUMN_NAME_SHOULDER_PAIN, // INTEGER
                COLUMN_NAME_SORE_THROAT, // INTEGER
                COLUMN_NAME_DIARRHEA, // INTEGER
                COLUMN_NAME_FOOD_CRAVINGS, // INTEGER
                COLUMN_NAME_UNREASONABLE_HUNGER, // INTEGER
                COLUMN_NAME_SEX_PIV, // INTEGER
                COLUMN_NAME_SEX_PIA, // INTEGER
                COLUMN_NAME_SEX_ORAL, // INTEGER
                COLUMN_NAME_HIGH_SEX_DRIVE, // INTEGER
                COLUMN_NAME_HERPES_OUTBREAK, // INTEGER
                COLUMN_NAME_STEPS, // INTEGER
                COLUMN_NAME_SLEEP_TIME, // INTEGER
                COLUMN_NAME_SLEEP_TIME_DECIMAL,
                COLUMN_NAME_INSOMNIA, // INTEGER
                COLUMN_NAME_NIGHTMARES, // INTEGER
                COLUMN_NAME_CALL_DURING_NIGHT, // INTEGER
                COLUMN_NAME_WORK_HOURS, // INTEGER
                COLUMN_NAME_WORK_HOURS_DECIMAL, // INTEGER
                COLUMN_NAME_EMOTION, // INTEGER
                COLUMN_NAME_FOCUS, //INTEGER
                COLUMN_NAME_ENERGY, // INTEGER
        };
    }

    public static String[] getGroupNames() {
        return new String[] {
                "NULL",
                GROUP_NAME_ONE,
                GROUP_NAME_TWO,
                GROUP_NAME_THREE,
                GROUP_NAME_FOUR,
                GROUP_NAME_FIVE,
                GROUP_NAME_SIX,
                GROUP_NAME_SEVEN
        };
    }

    public static String[] getMenstruationLabels() {
        return new String[]{
                MENSTRUAL_DATA_TITLE,
                COLUMN_NAME_PERIOD_START, // TEXT
                COLUMN_NAME_PERIOD_END, // TEXT
                COLUMN_NAME_SPOTTING, // INTEGER
                COLUMN_NAME_CRAMPING // INTEGER

        };
    }

    public static String[] getPainLabels() {
        return new String[]{
                PAIN_DATA_TITLE,
                COLUMN_NAME_HEADACHE, // INTEGER
                COLUMN_NAME_SHOULDER_PAIN, // INTEGER
                COLUMN_NAME_SORE_THROAT, // INTEGER

        };
    }

    public static String[] getGastrointestinalLabels() {
        return new String[]{
                GASTROINTESTINAL_DATA_TITLE,
                COLUMN_NAME_DIARRHEA, // INTEGER
                COLUMN_NAME_FOOD_CRAVINGS, // INTEGER
                COLUMN_NAME_UNREASONABLE_HUNGER, // INTEGER

        };
    }

    public static String[] getSexualLabels() {
        return new String[]{
                SEXUAL_DATA_TITLE,
                COLUMN_NAME_SEX_PIV, // INTEGER
                COLUMN_NAME_SEX_PIA, // INTEGER
                COLUMN_NAME_SEX_ORAL, // INTEGER
                COLUMN_NAME_HIGH_SEX_DRIVE, // INTEGER
                COLUMN_NAME_HERPES_OUTBREAK, // INTEGER

        };
    }

    public static String[] getSleepLabels() {
        return new String[]{
                SLEEP_DATA_TITLE,
                COLUMN_NAME_STEPS, // INTEGER
                COLUMN_NAME_SLEEP_TIME, // INTEGER
                COLUMN_NAME_SLEEP_TIME_DECIMAL,
                COLUMN_NAME_INSOMNIA, // INTEGER
                COLUMN_NAME_NIGHTMARES, // INTEGER
                COLUMN_NAME_CALL_DURING_NIGHT // INTEGER

        };
    }

    public static String[] getMiscLabels() {
        return new String[]{
                MISC_DATA_TITLE,
                COLUMN_NAME_WORK_HOURS, // INTEGER
                COLUMN_NAME_WORK_HOURS_DECIMAL, // INTEGER
                COLUMN_NAME_EMOTION, // INTEGER
                COLUMN_NAME_FOCUS, //INTEGER
                COLUMN_NAME_ENERGY, // INTEGER

        };
    }

    public static String[] getRowsText() {
        return new String[]{
                "06-26-2017",
                "06-22-2017",
                "06-27-2017",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL"
        };
    }

    public int[] getRowsInt() {
        return new int[]{
                5, 5, 5, // Strings
                0,
                1,
                2,
                3,
                0,
                1,
                2,
                3,
                0,
                1,
                2,
                3,
                0,
                1,
                0,
                1,
                2,
                0,
                1,
                2,
                0,
                1,
                2

        };
    }
}
