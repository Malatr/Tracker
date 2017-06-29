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

    TextView shoulder_painLabelView;
    RadioButton shoulder_painZero;
    RadioButton shoulder_painOne;
    RadioButton shoulder_painTwo;
    RadioButton shoulder_painThree;
    RadioButton shoulder_painFour;

    TextView sore_throatLabelView;
    RadioButton sore_throatZero;
    RadioButton sore_throatOne;
    RadioButton sore_throatTwo;
    RadioButton sore_throatThree;
    RadioButton sore_throatFour;

    //Button periodStartEntryView;
    Button nextButton;
    private String[] mLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set outer wrapper view xml for layout
        setContentView(R.layout.activity_pain_data);
        mLabels = StringHelper.getPainLabels();
        setTitle(mLabels[0]);
        headacheLabelView = (TextView) findViewById(R.id.text_view_headache_label);
        headacheLabelView.setText(mLabels[1]);
        headacheZero = (RadioButton) findViewById(R.id.headache_zero);
        headacheOne = (RadioButton) findViewById(R.id.headache_one);
        headacheTwo = (RadioButton) findViewById(R.id.headache_two);
        headacheThree = (RadioButton) findViewById(R.id.headache_three);
        headacheFour = (RadioButton) findViewById(R.id.headache_four);
        headacheZero.setSelected(true);

        shoulder_painLabelView = (TextView) findViewById(R.id.text_view_shoulder_pain_label);
        shoulder_painLabelView.setText(mLabels[2]);
        shoulder_painZero = (RadioButton) findViewById(R.id.shoulder_pain_zero);
        shoulder_painOne = (RadioButton) findViewById(R.id.shoulder_pain_one);
        shoulder_painTwo = (RadioButton) findViewById(R.id.shoulder_pain_two);
        shoulder_painThree = (RadioButton) findViewById(R.id.shoulder_pain_three);
        shoulder_painFour = (RadioButton) findViewById(R.id.shoulder_pain_four);
        shoulder_painZero.setSelected(true);

        sore_throatLabelView = (TextView) findViewById(R.id.text_view_sore_throat_label);
        sore_throatLabelView.setText(mLabels[3]);
        sore_throatZero = (RadioButton) findViewById(R.id.sore_throat_zero);
        sore_throatOne = (RadioButton) findViewById(R.id.sore_throat_one);
        sore_throatTwo = (RadioButton) findViewById(R.id.sore_throat_two);
        sore_throatThree = (RadioButton) findViewById(R.id.sore_throat_three);
        sore_throatFour = (RadioButton) findViewById(R.id.sore_throat_four);
        sore_throatZero.setSelected(true);

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
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.headache_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.headache_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.headache_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.headache_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.shoulder_pain_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.shoulder_pain_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.shoulder_pain_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.shoulder_pain_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.shoulder_pain_four:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sore_throat_zero:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sore_throat_one:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sore_throat_two:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sore_throat_three:
                if (checked)
                    // TODO: 6/28/2017 set flag in SQL
                    break;
            case R.id.sore_throat_four:
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
        Context context = EnterPainActivityFixedLayout.this;

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