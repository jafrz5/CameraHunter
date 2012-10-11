package edu.umkc.camerahunter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Camera_Hunter extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera__hunter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_camera__hunter, menu);
        return true;
    }

	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.button1:
		{
			Intent i = new Intent(this, Hunt.class);
			startActivity(i); 
			
			break;
		}
		
		case R.id.button2:
		{
			Intent i = new Intent(this, Create_Account.class);
			startActivity(i);
			
			break;
		}
		
		}
		
		
	}
}
