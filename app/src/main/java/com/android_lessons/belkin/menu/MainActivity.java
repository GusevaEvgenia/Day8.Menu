package com.android_lessons.belkin.menu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // у атрибута пункта меню Settings установлено значение android:onClick="onSettingsMenuClick"
    public void onSettingsMenuClick(MenuItem item) {
        TextView infoTextView = (TextView) findViewById(R.id.id_textView);
        infoTextView.setText("Вы выбрали пункт Settings, лучше бы выбрали кота");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.id_textView);

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_cat1:
                infoTextView.setText("Вы выбрали кота!");
                return true;
            case R.id.action_cat2:
                infoTextView.setText("Вы выбрали кошку!");
                return true;
            case R.id.action_cat3:
                infoTextView.setText("Вы выбрали котёнка!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
