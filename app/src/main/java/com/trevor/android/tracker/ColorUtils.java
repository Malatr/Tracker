package com.trevor.android.tracker;

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

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;


/**
 * ColorUtils is a class with one method, used to color the ViewHolders in
 * the RecyclerView. I put in a separate class in an attempt to keep the
 * code organized.
 *
 * We aren't going to go into detail about how this method works, but feel
 * free to explore!
 */
public class ColorUtils {

    /**
     * This method returns the appropriate shade of Purple to form the gradient
     * seen in the list, based off of the order in which the
     * com.trevor.android.recyclerview.LaunchAdapter.NumberViewHolder}
     * instance was created.
     *
     * This method is used to show how ViewHolders are recycled in a RecyclerView.
     * At first, the colors will form a nice, consistent gradient. As the
     * RecyclerView is scrolled, the
     * com.trevor.android.recyclerview.LaunchAdapter.NumberViewHolder}'s will be
     * recycled and the list will no longer appear as a consistent gradient.
     *
     * @param context     Context for getting colors
     * @param instanceNum Order in which the calling ViewHolder was created
     *
     * @return A shade of Purple based off of when the calling ViewHolder
     * was created.
     */
    public static int getViewHolderBackgroundColorFromInstance(Context context, int instanceNum) {
        switch (instanceNum) {
            case 0:
                return ContextCompat.getColor(context, R.color.material50Purple);
            case 1:
                return ContextCompat.getColor(context, R.color.material100Purple);
            case 2:
                return ContextCompat.getColor(context, R.color.material150Purple);
            case 3:
                return ContextCompat.getColor(context, R.color.material200Purple);
            case 4:
                return ContextCompat.getColor(context, R.color.material250Purple);
            case 5:
                return ContextCompat.getColor(context, R.color.material300Purple);
            case 6:
                return ContextCompat.getColor(context, R.color.material350Purple);
            case 7:
                return ContextCompat.getColor(context, R.color.material400Purple);
            case 8:
                return ContextCompat.getColor(context, R.color.material450Purple);
            case 9:
                return ContextCompat.getColor(context, R.color.material500Purple);
            case 10:
                return ContextCompat.getColor(context, R.color.material550Purple);
            case 11:
                return ContextCompat.getColor(context, R.color.material600Purple);
            case 12:
                return ContextCompat.getColor(context, R.color.material650Purple);
            case 13:
                return ContextCompat.getColor(context, R.color.material700Purple);
            case 14:
                return ContextCompat.getColor(context, R.color.material750Purple);
            case 15:
                return ContextCompat.getColor(context, R.color.material800Purple);
            case 16:
                return ContextCompat.getColor(context, R.color.material850Purple);
            case 17:
                return ContextCompat.getColor(context, R.color.material900Purple);

            default:
                return Color.WHITE;
        }
    }
}
