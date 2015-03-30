package com.hedgehog.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class SignUpTabActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up_layout);
		
		TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
		tabHost.setup();
		
		TabSpec tabSpecMail = tabHost.newTabSpec("Mail");
		tabSpecMail.setContent(R.id.tabMail);
		tabSpecMail.setIndicator("Mail");
		
		TabSpec tabSpecPhone = tabHost.newTabSpec("Phone");
		tabSpecPhone.setContent(R.id.tabSmartPhone);
		tabSpecPhone.setIndicator("Phone");
		
		tabHost.addTab(tabSpecMail);
		tabHost.addTab(tabSpecPhone);
	}
}
