package com.ag.api;

import com.ag.api.math.IAgMathApi;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  implements OnClickListener{

	TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		text = (TextView) findViewById(R.id.textView1);
		text.setOnClickListener(this);
//		{
//			int nRes = IAgSdkMath.add(55, 66);
//			Log.e("whg", "nRes = " + nRes);
//		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		{
			IAgMathApi iMath = new IAgMathApi();
			int nRes = iMath.add(55, 66);
			Log.e("whg", "nRes = " + nRes);
		}
	}

}
