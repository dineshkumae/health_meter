package com.example.healthmeter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bmi extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi);
		final TextView resn=(TextView)findViewById(R.id.resn);
		final TextView res=(TextView)findViewById(R.id.res);
		final Button resb=(Button)findViewById(R.id.resb);
		final EditText height=(EditText)findViewById(R.id.height);
		final EditText weight=(EditText)findViewById(R.id.weight);
		Button submit=(Button)findViewById(R.id.submit);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float n=0,b=0;
				float n1 = 0;
				try{
					   n1 = Float.valueOf(height.getText().toString());
					} catch (NumberFormatException e) {
					   e.printStackTrace();
					}
				float n2 = 0;
				try{
					   n2 = Float.valueOf(weight.getText().toString());
					} catch (NumberFormatException e) {
					   e.printStackTrace();
					}
				n=n1/100;
				b=n2/(n*n);
				resn.setVisibility(View.VISIBLE);
				resn.setText("Value:"+b);
				res.setVisibility(View.VISIBLE);
				if(b<15){
					res.setText("Very Severely Underweighted");
				}else if(b>=15&&b<16){
					res.setText("Severely Underweighted");
				}else if(b>=16 && b<18.5 ){
					res.setText("UnderWeighted");
				}else if(b>=18.5&& b<25){
					res.setText("Normal");
				}else if(b>=25 && b<30){
					res.setText("Overweighted");
				}else if(b>=30 && b<35){
					res.setText("Obese Class 1(Moderately Obese)");
				}else if(b>=35 && b<40){
					res.setText("Obese Class 2(Severely Obese)");
				}else {
					res.setText("Obese Class 3(Very Severely Obese)");
				}
				resb.setVisibility(View.VISIBLE);
			}
		});
		
	}
	

}
