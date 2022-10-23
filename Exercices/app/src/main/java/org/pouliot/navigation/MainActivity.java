package org.pouliot.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import org.pouliot.navigation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        String name = getIntent().getStringExtra("name");
        String welcom = binding.welcom.getText().toString();

        binding.welcom.setText( name != null ? welcom + " " + name: welcom);

        NumberPicker np = binding.numArticle;
        np.setMinValue(1);
        np.setMaxValue(5);

        setContentView(view);

        binding.btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, ArticleActivity.class );
                i.putExtra("id", binding.numArticle.getValue());
                startActivity(i);
            }
        });

        binding.btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, ContactActivity.class );
                startActivity(i);
            }
        });

        binding.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, CallActivity.class );
                startActivity(i);
            }
        });

    }
}