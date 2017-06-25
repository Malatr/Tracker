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
package com.trevor.android.tracker;

public final class SQLUtils {

    /**
     * This method returns a list of popular toy names from the 20th and early 21st centuries.
     * I don't know about you guys, but this definitely brings me back to my childhood...
     *
     * @return A list db field names
     */
    public static String[] getFieldNames() {
        return new String[] {
                "Date",
                "Period Start",
                "Period End",
                "Spotting",
                "Cramping",
                "Headache",
                "Shoulder Pain",
                "Sore Throat",
                "Steps",
                "Sleep Time",
                "Insomnia",
                "Nightmares",
                "Call During Night",
                "Work Hours",
                "Diarrhea",
                "Food Cravings",
                "Unreasonable Hunger",
                "Emotion",
                "Focus",
                "Energy",
                "Sex PIV",
                "Sex PIA",
                "Sex Oral",
                "High Sex Drive",
        };
    }

    public static String[] getRows() {
        return new String[]{
                "12/22/22",
                "12/10/22",
                "12/22/22",
                "Spotting, Yes/No",
                "Cramping, Yes/No",
                "Headache, Yes/No",
                "Shoulder Pain, Yes/No",
                "Sore Throat, Yes/No",
                "Steps, Quantity",
                "Sleep Time, Quantity",
                "Insomnia, Yes/No",
                "Nightmares, Yes/No",
                "Call During Night, Yes/No",
                "Work Hours, Quantity",
                "Diarrhea, Yes/No",
                "Food Cravings, Yes/No",
                "Unreasonable Hunger, Yes/No",
                "Emotion, Yes/No",
                "Focus, Yes/No",
                "Energy, Yes/No",
                "Sex PIV, Yes/No",
                "Sex PIA, Yes/No",
                "Sex Oral, Yes/No",
                "High Sex Drive, Yes/No",
        };
    }
}
