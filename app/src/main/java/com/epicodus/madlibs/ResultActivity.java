package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @Bind(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        String noun1 = intent.getStringExtra("Noun1");
        String noun2 = intent.getStringExtra("Noun2");
        String noun3 = intent.getStringExtra("Noun3");
        String verb = intent.getStringExtra("Verb");
        String adj = intent.getStringExtra("Adj");

        mResultTextView.setText("This is my " + noun1 + ". They had a " + noun2 + ". During " + noun3 + "Likes to " + verb + " and " + adj  + "! It’s 6:30 Monday morning and you’re alarm "+" is going off! You "+verb+ " out of bed and into the shower. Then you grab the nearest and run down the stairs to the kitchen. You make your morning beverage and pack a  "+ noun1 +" lunch. But when you go into the front hall, you discover that your pet has vomited on the floor! You have to clean it up, so now you’re running late for the bus!  You run out the door to catch your bus, but while you are waiting for the light to change to cross the street, you see your bus zoom by.  So you stick out your" +noun2 +" and catch a ride with a passing time instead. You make it to Epicodus just in time to sign in before 8:15 and start your MadLibs project.");
    }
}
