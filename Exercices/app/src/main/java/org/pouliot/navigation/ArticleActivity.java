package org.pouliot.navigation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.pouliot.navigation.databinding.ActivityArticleBinding;

public class ArticleActivity extends AppCompatActivity {

    ActivityArticleBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityArticleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        int id = getIntent().getIntExtra("id", -1);
        setTitle("Article #" + id);
        setContentView(view);

    }
}
