package com.hedgehog.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.hedgehog.view.CircleImageDrawable;

public class LoginActivity extends Activity implements OnClickListener {

	private Button mLoginBtn;
	private ImageView mHeadIconImg;
	private Button mSignUpBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);

		mLoginBtn = (Button) findViewById(R.id.loginBtn);
		mLoginBtn.setOnClickListener(this);
		
		mSignUpBtn = (Button) findViewById(R.id.registerBtn);
		mSignUpBtn.setOnClickListener(this);
		
		mHeadIconImg = (ImageView) findViewById(R.id.headIconImg);

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.hedgehog);
		CircleImageDrawable circle = new CircleImageDrawable(bitmap);
		mHeadIconImg.setImageDrawable(circle);
		
	}

	@Override
	public void onClick(View view) {
		if (view.equals(mLoginBtn)) {
			System.out.println("===mLoginBtn");
		} else if (view.equals(mSignUpBtn)) {
			Intent intent = new Intent(LoginActivity.this, SignUpTabActivity.class);
			startActivity(intent);
		}
	}
	
}
