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

        mResultTextView.setText("This is my " + noun1 + ". They had a " + noun2 + ". During " + noun3 + "Likes to " + verb + " and " + adj);
    }
}
