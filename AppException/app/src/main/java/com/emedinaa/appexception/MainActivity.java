package com.emedinaa.appexception;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private List<String> stringList;
    private Button clic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clic = (Button) findViewById(R.id.clic);
        clic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, BlankFragment.newInstance(), BlankFragment.class.getSimpleName())
                        .commit();
            }
        });

        //Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this, ReportActivity.class));
        stringList.add("Esto va generar un error :(");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
