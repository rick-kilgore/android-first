package net.rkilgore.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * A popup window to display my hello msg.
 * Created by rkilgore on 11/16/14.
 */
public class DisplayMessageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String msg = getIntent().getStringExtra(MainActivity.EXTRA_MSG);
        TextView text = new TextView(this);
        text.setTextSize(40.0f);
        text.setText(msg);
        setContentView(text);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
}