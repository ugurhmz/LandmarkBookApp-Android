package com.ugurhmz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ugurhmz.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkList;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkList = new ArrayList<>();

        Landmark colosseum = new Landmark("Colosseum","Rome",R.drawable.colosseum);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark londonBridge = new Landmark("London Bridge", "England", R.drawable.londonbridge);
        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);


        landmarkList.add(colosseum);
        landmarkList.add(eiffel);
        landmarkList.add(londonBridge);
        landmarkList.add(pisa);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapterRecycler landmarkAdapterRecycler = new LandmarkAdapterRecycler(landmarkList);
        binding.recyclerView.setAdapter(landmarkAdapterRecycler);

    }
}