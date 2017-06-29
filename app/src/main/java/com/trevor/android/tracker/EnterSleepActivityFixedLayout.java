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

public class EnterSleepActivityFixedLayout extends AppCompatActivity {

    TextView stepsLabelView;
    TextView sleepTimeLabelView;
    TextView nightmaresLabelView;
    TextView spottingLabelView;

    EditText stepsEntryView;
    EditText sleepTimeEntryView;
    RadioButton nightmaresNo;
    RadioButton nightmaresYes;

    TextView insomniaLabelView;
    RadioButton insomniaZero;
    RadioButton insomniaOne;
    RadioButton insomniaTwo;
    RadioButton insomniaThree;
    RadioButton insomniaFour;

    TextView nightCallsLabelView;
    RadioButton nightCallsZero;
    RadioButton nightCallsOne;
    RadioButton nightCallsTwo;
    RadioButton nightCallsThree;
    RadioButton nightCallsFour;

    Button nextButton;
    private String[] mLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_sleep_data);
        mLabels = StringHelper.getSleepLabels();
        setTitle(mLabels[0]);


        stepsLabelView = (TextView) findViewById(R.id.text_view_steps_label);
        stepsLabelView.setText(mLabels[1]);
        stepsEntryView = (EditText) findViewById(R.id.edit_text_steps_label);
        stepsEntryView.setHint("How many Steps today?");

        sleepTimeLabelView = (TextView) findViewById(R.id.text_view_sleep_label);
        sleepTimeLabelView.setText(mLabels[2]);
        sleepTimeEntryView = (EditText) findViewById(R.id.edit_text_sleep_label);
        sleepTimeEntryView.setHint("Get any sleep?");

        insomniaLabelView = (TextView) findViewById(R.id.text_view_insomnia_label);
        insomniaLabelView.setText(mLabels[4]);
        insomniaZero = (RadioButton) findViewById(R.id.insomnia_zero);
        insomniaOne = (RadioButton) findViewById(R.id.insomnia_one);
        insomniaTwo = (RadioButton) findViewById(R.id.insomnia_two);
        insomniaThree = (RadioButton) findViewById(R.id.insomnia_three);
        insomniaFour = (RadioButton) findViewById(R.id.insomnia_four);
        insomniaZero.setSelected(true);

        nightmaresLabelView = (TextView) findViewById(R.id.text_view_nightmares_label);
        nightmaresLabelView.setText(mLabels[5]);
        nightmaresNo = (RadioButton) findViewById(R.id.nightmares_no);
        nightmaresYes = (RadioButton) findViewById(R.id.nightmares_yes);
        insomniaZero.setSelected(true);
        nightmaresNo.setText("No");
        nightmaresYes.setText("Yes");

        nightCallsLabelView = (TextView) findViewById(R.id.text_view_night_calls_label);
        nightCallsLabelView.setText(mLabels[6]);
        nightCallsZero = (RadioButton) findViewById(R.id.night_calls_zero);
        nightCallsOne = (RadioButton) findViewById(R.id.night_calls_one);
        nightCallsTwo = (RadioButton) findViewById(R.id.night_calls_two);
        nightCallsThree = (RadioButton) findViewById(R.id.night_calls_three);
        nightCallsFour = (RadioButton) findViewById(R.id.night_calls_four);
        nightCallsZero.setSelected(true);

        nextButton = (Button) findViewById(R.id.button_sleep_next);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.nightmares_no:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.nightmares_yes:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.night_calls_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.insomnia_four:
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
        Context context = EnterSleepActivityFixedLayout.this;

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

    public void button_sleep_next(View view) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterSleepActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = EnterMiscActivityFixedLayout.class;

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