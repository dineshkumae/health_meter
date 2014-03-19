package com.example.healthmeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageButton help=(ImageButton) findViewById(R.id.help);
		ImageButton bmicheck=(ImageButton) findViewById(R.id.bmicheck);
		
		help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent star3=new Intent ("com.example.healthmeter.HELP");
				startActivity(star3);
			}
		});
bmicheck.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent star4=new Intent ("com.example.healthmeter.BMI");
				startActivity(star4);
			}
		});

	}

}
