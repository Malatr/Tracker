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

public class EnterPainActivityFixedLayout extends AppCompatActivity {

    TextView headacheLabelView;
    RadioButton headacheZero;
    RadioButton headacheOne;
    RadioButton headacheTwo;
    RadioButton headacheThree;
    RadioButton headacheFour;

    TextView shoulderPainLabelView;
    RadioButton shoulderPainZero;
    RadioButton shoulderPainOne;
    RadioButton shoulderPainTwo;
    RadioButton shoulderPainThree;
    RadioButton shoulderPainFour;

    TextView soreThroatLabelView;
    RadioButton soreThroatZero;
    RadioButton soreThroatOne;
    RadioButton soreThroatTwo;
    RadioButton soreThroatThree;
    RadioButton soreThroatFour;

    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;
    private String[] mRowValuesStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_pain_data);
        mLabels = StringHelper.getPainLabels();
        mRowValuesStrings = StringHelper.rowValuesStrings;
        setTitle(mLabels[0]);

        headacheLabelView = (TextView) findViewById(R.id.text_view_headache_label);
        headacheLabelView.setText(mLabels[1]);
        headacheZero = (RadioButton) findViewById(R.id.headache_zero);
        headacheZero.setSelected(true);
        headacheZero.setText("0");
        headacheOne = (RadioButton) findViewById(R.id.headache_one);
        headacheOne.setText("1");
        headacheTwo = (RadioButton) findViewById(R.id.headache_two);
        headacheTwo.setText("2");
        headacheThree = (RadioButton) findViewById(R.id.headache_three);
        headacheThree.setText("3");
        headacheFour = (RadioButton) findViewById(R.id.headache_four);
        headacheFour.setText("4");

        shoulderPainLabelView = (TextView) findViewById(R.id.text_view_shoulder_pain_label);
        shoulderPainLabelView.setText(mLabels[2]);
        shoulderPainZero = (RadioButton) findViewById(R.id.shoulder_pain_zero);
        shoulderPainZero.setSelected(true);
        shoulderPainZero.setText("0");
        shoulderPainOne = (RadioButton) findViewById(R.id.shoulder_pain_one);
        shoulderPainOne.setText("1");
        shoulderPainTwo = (RadioButton) findViewById(R.id.shoulder_pain_two);
        shoulderPainTwo.setText("2");
        shoulderPainThree = (RadioButton) findViewById(R.id.shoulder_pain_three);
        shoulderPainThree.setText("3");
        shoulderPainFour = (RadioButton) findViewById(R.id.shoulder_pain_four);
        shoulderPainFour.setText("4");

        soreThroatLabelView = (TextView) findViewById(R.id.text_view_sore_throat_label);
        soreThroatLabelView.setText(mLabels[3]);
        soreThroatZero = (RadioButton) findViewById(R.id.sore_throat_zero);
        soreThroatZero.setSelected(true);
        soreThroatZero.setText("0");
        soreThroatOne = (RadioButton) findViewById(R.id.sore_throat_one);
        soreThroatOne.setText("1");
        soreThroatTwo = (RadioButton) findViewById(R.id.sore_throat_two);
        soreThroatTwo.setText("2");
        soreThroatThree = (RadioButton) findViewById(R.id.sore_throat_three);
        soreThroatThree.setText("3");
        soreThroatFour = (RadioButton) findViewById(R.id.sore_throat_four);
        soreThroatFour.setText("4");

        nextButton = (Button) findViewById(R.id.button_pain_next);
        nextButton.setText(R.string.next);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.headache_zero:
                if (checked)
                    mRowValuesStrings[6] = "0";
                    break;
            case R.id.headache_one:
                if (checked)
                    mRowValuesStrings[6] = "1";
                    break;
            case R.id.headache_two:
                if (checked)
                    mRowValuesStrings[6] = "2";
                    break;
            case R.id.headache_three:
                if (checked)
                    mRowValuesStrings[6] = "3";
                    break;
            case R.id.headache_four:
                if (checked)
                    mRowValuesStrings[6] = "4";
                    break;
            case R.id.shoulder_pain_zero:
                if (checked)
                    mRowValuesStrings[7] = "0";
                    break;
            case R.id.shoulder_pain_one:
                if (checked)
                    mRowValuesStrings[7] = "1";
                    break;
            case R.id.shoulder_pain_two:
                if (checked)
                    mRowValuesStrings[7] = "2";
                    break;
            case R.id.shoulder_pain_three:
                if (checked)
                    mRowValuesStrings[7] = "3";
                    break;
            case R.id.shoulder_pain_four:
                if (checked)
                    mRowValuesStrings[7] = "4";
                    break;
            case R.id.sore_throat_zero:
                if (checked)
                    mRowValuesStrings[8] = "0";
                    break;
            case R.id.sore_throat_one:
                if (checked)
                    mRowValuesStrings[8] = "1";
                    break;
            case R.id.sore_throat_two:
                if (checked)
                    mRowValuesStrings[8] = "2";
                    break;
            case R.id.sore_throat_three:
                if (checked)
                    mRowValuesStrings[8] = "3";
                    break;
            case R.id.sore_throat_four:
                if (checked)
                    mRowValuesStrings[8] = "4";
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
        Context context = EnterPainActivityFixedLayout.this;

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

    public void button_pain_next(View view) {
        /*
         * Storing the Context in a variable in this case is redundant since we could have
         * just used "this" or "EnterMenstrualActivity.this" in the method call below. However, we
         * wanted to demonstrate what parameter we were using "EnterMenstrualActivity.this" for as
         * clear as possible.
         */
        Context context = EnterPainActivityFixedLayout.this;
        // pointer[0] = clickedItemIndex, pointer[1] = , pointer[2] = ,
        int pointers[] = {0, 0, 0};
        Class destinationActivity = EnterGastrointestinalActivityFixedLayout.class;

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