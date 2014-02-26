package com.sahil.gui;

import com.example.gui.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Button bt,bt2,bt3;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt=(Button) findViewById(R.id.bLogin);
		bt2=(Button) findViewById(R.id.button2);
		bt3=(Button) findViewById(R.id.bContinue);
		Typeface tf=Typeface.createFromAsset(this.getAssets(),"fonts/Imprima-Regular.ttf");
		bt.setTypeface(tf);
		bt2.setTypeface(tf);
		bt3.setTypeface(tf);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
