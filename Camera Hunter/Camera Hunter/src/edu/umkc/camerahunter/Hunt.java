package edu.umkc.camerahunter;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Hunt extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hunt, menu);
        return true;
    }

	public void onClick(View v) {
		
		switch (v.getId())
		{
		case R.id.Leaderboard:
		{
			Intent i = new Intent(this, Leaderboard.class);
			startActivity(i);
			
			break;
		}
		
		case R.id.launch_camera:
		{
			Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

		    Uri photoUri = Uri.fromFile(null);
		    intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);

		    startActivityForResult(intent, 0);
		    
			break;
		}
		}
		
	}
}
