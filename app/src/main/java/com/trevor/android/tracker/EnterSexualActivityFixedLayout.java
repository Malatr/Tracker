package com.trevor.android.tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.trevor.android.tracker.data.StringHelper;

/**
 * Created by Trevor on 6/25/2017.
 */

public class EnterSexualActivityFixedLayout extends AppCompatActivity {

    TextView sexPIVLabelView;
    RadioButton sexPIVZero;
    RadioButton sexPIVOne;

    TextView sexPIALabelView;
    RadioButton sexPIAZero;
    RadioButton sexPIAOne;

    TextView sexOralLabelView;
    RadioButton sexOralZero;
    RadioButton sexOralOne;

    TextView highSexDriveLabelView;
    RadioButton highSexDriveZero;
    RadioButton highSexDriveOne;

    TextView herpesOutbreakLabelView;
    RadioButton herpesOutbreakZero;
    RadioButton herpesOutbreakOne;

    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;
    private String[] mRowValuesStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_sexual_data);
        mLabels = StringHelper.getSexualLabels();
        mRowValuesStrings = StringHelper.rowValuesStrings;
        setTitle(mLabels[0]);


        sexPIVLabelView = (TextView) findViewById(R.id.text_view_sex_piv_label);
        sexPIVLabelView.setText(mLabels[1]);
        sexPIVZero = (RadioButton) findViewById(R.id.sex_piv_zero);
        sexPIVZero.setSelected(true);
        sexPIVZero.setText(R.string.no_label);
        sexPIVOne = (RadioButton) findViewById(R.id.sex_piv_one);
        sexPIVOne.setText(R.string.yes_label);

        sexPIALabelView = (TextView) findViewById(R.id.text_view_sex_pia_label);
        sexPIALabelView.setText(mLabels[2]);
        sexPIAZero = (RadioButton) findViewById(R.id.sex_pia_zero);
        sexPIAZero.setSelected(true);
        sexPIAZero.setText(R.string.no_label);
        sexPIAOne = (RadioButton) findViewById(R.id.sex_pia_one);
        sexPIAOne.setText(R.string.yes_label);

        sexOralLabelView = (TextView) findViewById(R.id.text_view_sex_oral_label);
        sexOralLabelView.setText(mLabels[3]);
        sexOralZero = (RadioButton) findViewById(R.id.sex_oral_zero);
        sexOralZero.setSelected(true);
        sexOralZero.setText(R.string.no_label);
        sexOralOne = (RadioButton) findViewById(R.id.sex_oral_one);
        sexOralOne.setText(R.string.yes_label);

        highSexDriveLabelView = (TextView) findViewById(R.id.text_view_high_sex_drive_label);
        highSexDriveLabelView.setText(mLabels[4]);
        highSexDriveZero = (RadioButton) findViewById(R.id.high_sex_drive_zero);
        highSexDriveZero.setSelected(true);
        highSexDriveZero.setText(R.string.no_label);
        highSexDriveOne = (RadioButton) findViewById(R.id.high_sex_drive_one);
        highSexDriveOne.setText(R.string.yes_label);

        herpesOutbreakLabelView = (TextView) findViewById(R.id.text_view_herpes_outbreak_label);
        herpesOutbreakLabelView.setText(mLabels[5]);
        herpesOutbreakZero = (RadioButton) findViewById(R.id.herpes_outbreak_zero);
        herpesOutbreakZero.setSelected(true);
        herpesOutbreakZero.setText(R.string.no_label);
        herpesOutbreakOne = (RadioButton) findViewById(R.id.herpes_outbreak_one);
        herpesOutbreakOne.setText(R.string.yes_label);

        nextButton = (Button) findViewById(R.id.button_sexual_next);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sex_piv_zero:
                if (checked)
                    mRowValuesStrings[12] = "0";
                    break;
            case R.id.sex_piv_one:
                if (checked)
                    mRowValuesStrings[12] = "1";
                    break;
            case R.id.sex_pia_zero:
                if (checked)
                    mRowValuesStrings[13] = "0";
            case R.id.sex_pia_one:
                if (checked)
                    mRowValuesStrings[13] = "1";
                    break;
            case R.id.sex_oral_zero:
                if (checked)
                    mRowValuesStrings[14] = "0";
                    break;
            case R.id.sex_oral_one:
                if (checked)
                    mRowValuesStrings[14] = "1";
                    break;
            case R.id.high_sex_drive_zero:
                if (checked)
                    mRowValuesStrings[15] = "0";
                    break;
            case R.id.high_sex_drive_one:
                if (checked)
                    mRowValuesStrings[15] = "1";
                    break;
            case R.id.herpes_outbreak_zero:
                if (checked)
                    mRowValuesStrings[16] = "0";
                    break;
            case R.id.herpes_outbreak_one:
                if (checked)
                    mRowValuesStrings[16] = "1";
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
        Context context = EnterSexualActivityFixedLayout.this;

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

    public void button_sexual_next(View view) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterSexualActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = EnterSleepActivityFixedLayout.class;

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