package com.example.portfolio_calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements OnClickListener{

	Button nine,eig,sev,six,fiv,four,thr,two,one,zero,dot,plus,mins,div,mul,eq,cl, percent,plusMinus;
    EditText et;
    String s = "0";
    float result = 0;
    char lO = ' ';
    private boolean isNegative = false;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et=(EditText)findViewById(R.id.input);
		cl=(Button)findViewById(R.id.btnClear);
		percent=(Button)findViewById(R.id.btnPercent);
		div=(Button)findViewById(R.id.btnDivide);
		mul=(Button)findViewById(R.id.btnMultiply);
		mins=(Button)findViewById(R.id.btnMinus);
		plus=(Button)findViewById(R.id.btnAdd);
		eq=(Button)findViewById(R.id.btnEqual);
		plusMinus=(Button)findViewById(R.id.btnPlusMinus);
		dot=(Button)findViewById(R.id.btnDecimal);
		nine=(Button)findViewById(R.id.btnNine);
        eig=(Button)findViewById(R.id.btnEight);
        sev=(Button)findViewById(R.id.btnSeven);
        six=(Button)findViewById(R.id.btnSix);
        fiv=(Button)findViewById(R.id.btnFive);
        four=(Button)findViewById(R.id.btnFour);
        thr=(Button)findViewById(R.id.btnThree);
        two=(Button)findViewById(R.id.btnTwo);
        one=(Button)findViewById(R.id.btnOne);
        zero=(Button)findViewById(R.id.btnZero);
        et.setOnClickListener(this);
        cl.setOnClickListener(this);
        percent.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        mins.setOnClickListener(this);
        plus.setOnClickListener(this);
        eq.setOnClickListener(this);
        plusMinus.setOnClickListener(this);
        dot.setOnClickListener(this);
        nine.setOnClickListener(this);
        eig.setOnClickListener(this);
        sev.setOnClickListener(this);
        six.setOnClickListener(this);
        fiv.setOnClickListener(this);
        four.setOnClickListener(this);
        thr.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        zero.setOnClickListener(this);
        
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId())
        {
            case R.id.btnZero:
            case R.id.btnOne:
            case R.id.btnTwo:
            case R.id.btnThree:
            case R.id.btnFour:
            case R.id.btnFive:
            case R.id.btnSix:
            case R.id.btnSeven:
            case R.id.btnEight:
            case R.id.btnNine:
            case R.id.btnDecimal:

            String inDigit = ((Button) v).getText().toString();
            if (s.equals("0"))
            {
                s= inDigit;
            }
            else
            {
                s+=inDigit;
            }
            et.setText(s);
            if(lO == '=')
            {
                result=0;
                lO =' ';
            }
            break;
            case R.id.btnAdd:
            	
		            compute();
		            lO = '+';
		            
		            break;
            	
            case R.id.btnMinus:
            	
		            compute();
		            lO = '-';
		           
		            break;
            	
            case R.id.btnDivide:
            	
		            compute();
		            lO = '/';
		          
		            break;
            	
            case R.id.btnMultiply:
            	
		            compute();
		            lO = '*';
		            
		            break;
            	
            case R.id.btnEqual:
            	
		            compute();
		            lO = '=';
		           
		            break;
            	
            case R.id.btnPercent:
            	    
            	float floatNum = Float.parseFloat(s);		   
                	
                	if(result==0)
                	{
                		floatNum *=0.01;
                		et.setText(String.valueOf(floatNum));
                	}
                	else
                	{
                		result/=100;
                		et.setText(String.valueOf(result));
                	}
		            break;
            
            case R.id.btnPlusMinus:
            	if(result==0)
            	{
            		if (s.charAt(0) == '-')
            		{
	            		s = s.substring(1, s.length());
	            		isNegative=false;
	            		float floatNum1 = Float.parseFloat(s);
	            		et.setText(String.valueOf(floatNum1));
            		}
            		else
					
            		{
						s = "-" + s;
						isNegative=true;
						result = Float.parseFloat(s);
	            		et.setText(String.valueOf(result));
            		}
        	
            }
            	else
            	{
            		String txt =Float.toString(result);
            		if (txt.charAt(0) == '-')
            		{
	            		txt = txt.substring(1, txt.length());
	            		isNegative=false;
	            		float floatNum1 = Float.parseFloat(txt);
	            		et.setText(String.valueOf(floatNum1));
            		}
            		else
					
            		{
						txt = "-" + txt;
						isNegative=true;
						result = Float.parseFloat(txt);
	            		et.setText(String.valueOf(result));
            		}
            	}
            	
        			break;
            	
        		
            case R.id.btnClear:
            result = 0;
            s = "0";
            lO = ' ';
            
            et.setText("0");
            break;
        }
    }

    private void compute() 
    {
        // TODO Auto-generated method stub
        float floatNum = Float.parseFloat(s);
        s = "0";
        if (lO == ' ') 
        {
            result = floatNum;
        } 
        else if (lO == '+') 
        {
            result += floatNum;
        } 
        else if (lO == '-') 
        {
            result -= floatNum;
        } 
        else if (lO == '*') 
        {
            result *= floatNum;
        } 
        else if (lO == '/') 
        {
            result /= floatNum;
        } 
              
        else if (lO == '=') 
        {
            // Keep the result for the next operation
        }
        et.setText(String.valueOf(result));
    
}
		
	}
