package com.example.currencyconverter_project4;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.*;
import android.widget.*;

public class JapaneseYen extends Fragment implements OnClickListener{
	EditText yenAmount;
	Button convert2Button;
	TextView resultYen;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        //Replace xxxx with the name of the fragment (i.e. XML filename)
        View view = inflater.inflate(R.layout.activity_japanese_yen, container,false); 
        
        yenAmount =(EditText) view.findViewById(R.id.yenEditText);
        convert2Button= (Button) view.findViewById(R.id.convertYenButton);
        resultYen =(TextView) view.findViewById(R.id.resultYen);
        convert2Button.setOnClickListener(this);
        
        //Your code to reference/link variables to widgets
        
        
        return view;
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String yenInput = String.valueOf(yenAmount.getText());
		double yenConverted = Double.valueOf(yenInput);
		double euroAmount = yenConverted * 0.0083;
		double britishPound = yenConverted *0.0072;
		resultYen.setText(yenConverted + " Japanese yens are equivalent to " + euroAmount + " Euros and " + britishPound + " British Pounds");
	}

}
