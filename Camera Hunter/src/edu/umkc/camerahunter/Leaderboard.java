package edu.umkc.camerahunter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Leaderboard extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_leaderboard, menu);
        return true;
    }
}
