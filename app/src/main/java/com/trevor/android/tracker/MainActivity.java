package com.trevor.android.tracker;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare a TextView variable
    private RecyclerView mFieldsListTextView;
    private static final int NUM_LIST_ITEMS = 100;

   /*
    * References to RecyclerView and Adapter to reset the list to its
    * "pretty" state when the reset menu item is clicked.
    */private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * Using findViewById, we get a reference to our RecyclerView from xml. This allows us to
         * do things like set the adapter of the RecyclerView and toggle the visibility.
         */
        mFieldsListTextView = (RecyclerView) findViewById(R.id.rv_field_names);

        /*
         * A LinearLayoutManager is responsible for measuring and positioning item views within a
         * RecyclerView into a linear list. This means that it can produce either a horizontal or
         * vertical list depending on which parameter you pass in to the LinearLayoutManager
         * constructor. By default, if you don't specify an orientation, you get a vertical list.
         * In our case, we want a vertical list, so we don't need to pass in an orientation flag to
         * the r constructor.
         *
         * There are other LayoutManagers available to display your data in uniform grids,
         * staggered grids, and more! See the developer documentation for more details.
         */
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mFieldsListTextView.setLayoutManager(layoutManager);

       /*
        Old string code for the list - can go?

        String[] fieldNames = FieldList.geFieldNames();
        //Loop through each toy and append the name to the TextView (add \n for spacing)
        for (String fieldName : fieldNames) {mFieldsListTextView.append(fieldName + "\n\n\n");
       }
       */

       /*
         * Use this setting to improve performance if you know that changes in content do not
         * change the child layout size in the RecyclerView
         */
        mFieldsListTextView.setHasFixedSize(true);

         /* The GreenAdapter is responsible for displaying each item in the list.
         */
        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);

        mFieldsListTextView.setAdapter(mAdapter);


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
        }
    }

}