package org.pouliot.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.setType("Text/plain");

        Intent shareIntent = Intent.createChooser(i, null);
        startActivity(shareIntent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SUPER_TAG_EXEMPLE", "SUR LA PAUSE KIT-KAT");
    }
}
