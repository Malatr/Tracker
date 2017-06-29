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

    TextView sex_pivLabelView;
    RadioButton sex_pivZero;
    RadioButton sex_pivOne;

    TextView sex_piaLabelView;
    RadioButton sex_piaZero;
    RadioButton sex_piaOne;

    TextView sex_oralLabelView;
    RadioButton sex_oralZero;
    RadioButton sex_oralOne;
    RadioButton sex_oralTwo;

    TextView high_sex_driveLabelView;
    RadioButton high_sex_driveZero;
    RadioButton high_sex_driveOne;

    TextView herpes_outbreakLabelView;
    RadioButton herpes_outbreakZero;
    RadioButton herpes_outbreakOne;

    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_sexual_data);
        mLabels = StringHelper.getSexualLabels();
        setTitle(mLabels[0]);
        sex_pivLabelView = (TextView) findViewById(R.id.text_view_sex_piv_label);
        sex_pivLabelView.setText(mLabels[1]);
        sex_pivZero = (RadioButton) findViewById(R.id.sex_piv_zero);
        sex_pivOne = (RadioButton) findViewById(R.id.sex_piv_one);
        sex_pivZero.setSelected(true);

        sex_piaLabelView = (TextView) findViewById(R.id.text_view_sex_pia_label);
        sex_piaLabelView.setText(mLabels[2]);
        sex_piaZero = (RadioButton) findViewById(R.id.sex_pia_zero);
        sex_piaOne = (RadioButton) findViewById(R.id.sex_pia_one);
        sex_piaZero.setSelected(true);

        sex_oralLabelView = (TextView) findViewById(R.id.text_view_sex_oral_label);
        sex_oralLabelView.setText(mLabels[3]);
        sex_oralZero = (RadioButton) findViewById(R.id.sex_oral_zero);
        sex_oralOne = (RadioButton) findViewById(R.id.sex_oral_one);
        sex_oralZero.setSelected(true);

        high_sex_driveLabelView = (TextView) findViewById(R.id.text_view_high_sex_drive_label);
        high_sex_driveLabelView.setText(mLabels[4]);
        high_sex_driveZero = (RadioButton) findViewById(R.id.high_sex_drive_zero);
        high_sex_driveOne = (RadioButton) findViewById(R.id.high_sex_drive_one);
        high_sex_driveZero.setSelected(true);

        herpes_outbreakLabelView = (TextView) findViewById(R.id.text_view_herpes_outbreak_label);
        herpes_outbreakLabelView.setText(mLabels[5]);
        herpes_outbreakZero = (RadioButton) findViewById(R.id.herpes_outbreak_zero);
        herpes_outbreakOne = (RadioButton) findViewById(R.id.herpes_outbreak_one);
        herpes_outbreakZero.setSelected(true);

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
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sex_piv_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sex_pia_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sex_pia_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sex_oral_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sex_oral_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.high_sex_drive_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.high_sex_drive_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.herpes_outbreak_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.herpes_outbreak_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
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
            case R.id.action_delete_all_entries:
                textToShow = getString(R.string.delete_all_entries) + " Tapped";
                Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_insert_data:
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