package com.trevor.android.tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
}