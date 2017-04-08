package com.example.currencyconverter_project4;

import android.support.v7.app.ActionBarActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	Button usDollar;
	Button japaneseYen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		usDollar= (Button) findViewById(R.id.dollarButton);
		japaneseYen= (Button) findViewById(R.id.yenButton);
		
		usDollar.setOnClickListener(this);
		japaneseYen.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		else if(id == R.id.action_aboutus)
		{
			//this code will start the about us activity
			Intent aboutus = new Intent(getApplicationContext(), AboutUsActivity.class);
			startActivity(aboutus);
			
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.dollarButton)
		{
			getFragmentManager().beginTransaction().replace(R.id.fragmentLayout, new USDollar()).commit();
		}
		else if(v.getId()==R.id.yenButton)
		{
			getFragmentManager().beginTransaction().replace(R.id.fragmentLayout, new JapaneseYen()).commit();
		}
	}
}
