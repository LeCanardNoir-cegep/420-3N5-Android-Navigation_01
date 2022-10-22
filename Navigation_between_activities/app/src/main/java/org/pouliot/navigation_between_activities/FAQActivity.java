package org.pouliot.navigation_between_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.pouliot.navigation_between_activities.databinding.ActivityFaqBinding;

import java.util.zip.Inflater;

public class FAQActivity extends AppCompatActivity {
    private ActivityFaqBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("FAQ");
        binding = ActivityFaqBinding.inflate((getLayoutInflater()));
        View view = binding.getRoot();
        setContentView((view));

        String question = getIntent().getStringExtra("question");
        binding.myInput.setText(question);

        binding.btnProducts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FAQActivity.this, ProductActivity.class);
                i.putExtra("id", 30);
                i.putExtra("age", 46);
                startActivity(i);
            }
        });

        binding.btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
