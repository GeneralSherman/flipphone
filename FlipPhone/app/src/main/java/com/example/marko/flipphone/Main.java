package com.example.marko.flipphone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }



    while(true)
    {
        TextView t1 = new TextView(this);
        t1 = (TextView)findViewById(R.id.textView);
        TextView t2 = new TextView(this);
        t2 = (TextView)findViewById(R.id.textView2);
        TextView t3 = new TextView(this);
        t3 = (TextView)findViewById(R.id.textView3);

        int[] arr = getRequestedOrientation();
        t1.setText(Integer.toString(arr[0]));
        t2.setText(Integer.toString(arr[1]));
        t3.setText(Integer.toString(arr[2]));
    }
}
