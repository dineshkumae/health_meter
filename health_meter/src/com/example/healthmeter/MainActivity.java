package com.example.healthmeter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread timer=new Thread(){
        	public void run(){
        		try{
        			sleep(5000);
        		}catch(InterruptedException e){
        			e.printStackTrace();
        		}finally{
        			Intent star1=new Intent("com.example.healthmeter.SECOND");
        			startActivity(star1);
        		}
        	}
        };timer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
