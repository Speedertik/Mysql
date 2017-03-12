package com.example.mysql;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Configure extends Activity {
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_configure);
	        ProgressBar progress = (ProgressBar) findViewById(R.id.Progress);
	        progress.setProgress(30);
	    }
	}