package com.hedgehog.activity;
                                   
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends Activity {

	private Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        
        mLoginBtn = (Button) findViewById(R.id.loginBtn);
    }
}
