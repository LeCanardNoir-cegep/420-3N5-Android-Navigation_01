package org.pouliot.navigation_between_activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int id = getIntent().getIntExtra("id", -1);
        int age = getIntent().getIntExtra("age", -1);
        Toast.makeText(this, "Mon id: " + id + " age: " + age, Toast.LENGTH_SHORT).show();
        setTitle("Produit");
    }
}
