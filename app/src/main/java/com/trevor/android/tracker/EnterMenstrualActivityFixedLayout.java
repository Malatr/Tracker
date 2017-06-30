package com.trevor.android.tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.trevor.android.tracker.data.StringHelper;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterMenstrualActivityFixedLayout extends AppCompatActivity {

    // Will display field names
    TextView periodStartLabelView;
    TextView periodEndLabelView;
    TextView crampsLabelView;
    TextView spottingLabelView;
    // Button periodStartLabelView;
    // Will display which ViewHolder is displaying this data
    EditText periodStartEntryView;
    EditText periodEndEntryView;
    RadioButton crampsNo;
    RadioButton crampsYes;
    RadioButton spottingNo;
    RadioButton spottingYes;
    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;
    private String[] mRowValuesStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_menstruation_data);
        mLabels = StringHelper.getMenstruationLabels();
        mRowValuesStrings = StringHelper.rowValuesStrings;
        setTitle(mLabels[0]);

        periodStartLabelView = (TextView) findViewById(R.id.text_view_period_start_label);
        periodStartLabelView.setText(mLabels[1]);
        periodStartEntryView = (EditText) findViewById(R.id.edit_text_period_start_label);
        periodStartEntryView.setHint("12/12/12");

        periodEndLabelView = (TextView) findViewById(R.id.text_view_period_end_label);
        periodEndLabelView.setText(mLabels[2]);
        periodEndEntryView = (EditText) findViewById(R.id.edit_text_period_end_label);
        periodEndEntryView.setHint("12/12/12");

        spottingLabelView = (TextView) findViewById(R.id.text_view_spotting_label);
        spottingLabelView.setText(mLabels[4]);
        spottingNo = (RadioButton) findViewById(R.id.spotting_no);
        spottingNo.setText("No");
        spottingNo.setSelected(true);
        spottingYes = (RadioButton) findViewById(R.id.spotting_yes);
        spottingYes.setText("Yes");

        crampsLabelView = (TextView) findViewById(R.id.text_view_cramps_label);
        crampsLabelView.setText(mLabels[3]);
        crampsNo = (RadioButton) findViewById(R.id.cramps_no);
        crampsNo.setText("No");
        crampsNo.setSelected(true);
        crampsYes = (RadioButton) findViewById(R.id.cramps_yes);
        crampsYes.setText("Yes");


        nextButton = (Button) findViewById(R.id.button_menstruation_next);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.spotting_no:
                if (checked)
                    mRowValuesStrings[4] = "0";
                    break;
            case R.id.spotting_yes:
                if (checked)
                    mRowValuesStrings[4] = "1";
                break;
            case R.id.cramps_no:
                if (checked)
                    mRowValuesStrings[5] = "0";
                    break;
            case R.id.cramps_yes:
                if (checked)
                    mRowValuesStrings[5] = "1";
                break;

        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        //savedInstanceState.putInt(STATE_SCORE, mCurrentScore);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
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
        String textToShow;
        Context context = EnterMenstrualActivityFixedLayout.this;

        // show a Toast with the label of the button and return true to tell Android that I've handled this menu click

        switch (item.getItemId()) {
            case R.id.bar_button:
                textToShow = getString(R.string.bar_button_text) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_retrieve_entries:
                textToShow = getString(R.string.delete_all_entries) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_retrieve_data:
                //textToShow = getString(R.string.insert_dummy_data) + " Tapped";
                //Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
        }
        //ElseIf we do NOT handle the menu click,
        // return super.onOptionsItemSelected to let Android handle the menu click
        return super.onOptionsItemSelected(item);
    }

    public void button_menstruation_next(View view) {
        mRowValuesStrings[1] = "Do date things";
        mRowValuesStrings[2] = periodStartEntryView.getText().toString().trim();
        mRowValuesStrings[3] = periodEndEntryView.getText().toString().trim();


        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterMenstrualActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = EnterPainActivityFixedLayout.class;

        /*
         * Here, we create the Intent that will start the Activity we specified above in
         * the destinationActivity variable. The constructor for an Intent also requires a
         * context, which we stored in the variable named "context".
         */
        Intent startChildActivityIntent = new Intent(context, destinationActivity);

         /*
         * We use the putExtra method of the Intent class to pass some extra stuff to the
         * Activity that we are starting. Generally, this data is quite simple, such as
         * a String or a number. However, there are ways to pass more complex objects.
         */

        //startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
        startChildActivityIntent.putExtra("pointers", pointers);


         /*
         * Once the Intent has been created, we can use Activity's method, "startActivity"
         * to start the DataEntryChooserActivity.
         */
        startActivity(startChildActivityIntent);
    }


}