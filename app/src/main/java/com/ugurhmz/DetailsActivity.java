package com.ugurhmz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ugurhmz.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark selectedLandmark =  (Landmark) intent.getSerializableExtra("landmark");

        binding.countryText.setText(selectedLandmark.country);
        binding.nameText.setText(selectedLandmark.name);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}