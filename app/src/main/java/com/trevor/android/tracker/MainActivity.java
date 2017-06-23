package com.trevor.android.tracker;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare a TextView variable
    TextView mFieldsListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Use findViewById to get a reference to the TextView from the layout
        mFieldsListTextView = (TextView) findViewById(R.id.field_names);
        //Use the  FieldList.geFieldNames method and store the names in a String array called fieldNames
        String[] fieldNames = FieldList.geFieldNames();

        //Loop through each toy and append the name to the TextView (add \n for spacing)
        for (String fieldName : fieldNames) {
            mFieldsListTextView.append(fieldName + "\n\n\n");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
        getMenuInflater().inflate(R.menu.overflow, menu);
        //Return true to display menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Get the ID of the item that was selected and store it in itemThatWasClicked
        int itemThatWasClicked = item.getItemId();
        //If the item's ID is R.id.overflow,
        // show a Toast and return true to tell Android that I've handled this menu click
        if (itemThatWasClicked == R.id.overflow){
            Context context = MainActivity.this;
            String textToShow = "Menu Selected";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();

            return true;
        }
        //ElseIf we do NOT handle the menu click,
        // return super.onOptionsItemSelected to let Android handle the menu click
        return super.onOptionsItemSelected(item);
    }

    // Create a class called DbQueryTask that extends AsyncTask<Object, Object, Cursor>
    public class DbQueryTask extends AsyncTask<Object, Object, Cursor>{

        // Override the doInBackground method to perform the query.
        // Return the results.
        @Override
        protected Cursor doInBackground(Object... params) {
            Context context = MainActivity.this;
            String textToShow = "doInBackground executed";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
            return null;
        }

        // Override onPostExecute to display the results in the TextView
        @Override
        protected void onPostExecute(Cursor result) {
            Context context = MainActivity.this;
            String textToShow = "onPostExecute executed";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
            return;
        }
    }

}