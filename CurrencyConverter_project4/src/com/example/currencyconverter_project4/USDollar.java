package com.example.currencyconverter_project4;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.*;
import android.widget.*;


public class USDollar extends Fragment implements OnClickListener{
	EditText dollarAmount;
	Button convert1Button;
	TextView resultDollar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        //Replace xxxx with the name of the fragment (i.e. XML filename)
        View view = inflater.inflate(R.layout.activity_usdollar, container,false); 
        
        dollarAmount =(EditText) view.findViewById(R.id.dollarEditText);
        convert1Button= (Button) view.findViewById(R.id.convertDollarButton);
        convert1Button.setOnClickListener(this);
        resultDollar = (TextView) view.findViewById(R.id.resultDollar);
        //Your code to reference/link variables to widgets
        
        
        
        return view;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String dollarInput = String.valueOf(dollarAmount.getText());
		double dollarConverted = Double.valueOf(dollarInput);
		double euroAmount = dollarConverted * 0.92;
		double britishPound = dollarConverted *0.81;
		resultDollar.setText("$" + dollarConverted + " is equivalent to " + euroAmount + " Euros and " + britishPound + " British Pounds");
		
	}
}
