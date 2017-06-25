package com.trevor.android.tracker;

import android.database.Cursor;
import android.os.AsyncTask;

/**
 * Created by Trevor on 6/25/2017.
 */

// Create a class called DbQueryTask that extends AsyncTask<Object, Object, Cursor>
public class DbQuery extends AsyncTask<Object, Object, Cursor> {

    // Override the doInBackground method to perform the query.
    // Return the results.
    @Override
    protected Cursor doInBackground(Object... params) {
        /*Context context = MainActivity.this;
        String textToShow = "oInBackground executed";
        Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
       */
        return null;

    }

    // Override onPostExecute to display the results in the TextView
    @Override
    protected void onPostExecute(Cursor result) {
        /*
        Context context = MainActivity.this;
        String textToShow = "onPostExecute executed";
        Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
          */
    }

}
