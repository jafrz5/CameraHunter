package edu.umkc.camera.hunter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Hunt extends Activity {

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
}
