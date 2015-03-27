package com.hedgehog.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		Handler handler = new Handler();
		handler.postDelayed(autoChangeToMainActivityRunnable, 1000);
	}

	Runnable autoChangeToMainActivityRunnable = new Runnable() {
		
		@Override
		public void run() {
			Intent intent = new Intent(StartActivity.this, LoginActivity.class);
			startActivity(intent);
			StartActivity.this.finish();
		}
	};
}
