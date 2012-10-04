package edu.umkc.camera.hunter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CreateAccount extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_create_account, menu);
        return true;
    }
}
