package com.ugurhmz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Landmark colosseum = new Landmark("Colosseum","Rome",R.drawable.colosseum);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark londonBridge = new Landmark("London Bridge", "England", R.drawable.londonbridge);
        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);

        landmarkList = new ArrayList<>();
        landmarkList.add(colosseum);
        landmarkList.add(eiffel);
        landmarkList.add(londonBridge);
        landmarkList.add(pisa);



    }
}