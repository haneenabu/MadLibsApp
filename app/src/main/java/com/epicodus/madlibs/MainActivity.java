package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.submitMadLibsButton) Button mSubmitMadLibsButton;
    @Bind(R.id.noun1) EditText noun1;
    @Bind(R.id.noun2) EditText noun2;
    @Bind(R.id.noun3) EditText noun3;
    @Bind(R.id.verb) EditText verb;
    @Bind(R.id.adj) EditText adjective;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mSubmitMadLibsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String noun1out = noun1.getText().toString();
                String noun2out = noun2.getText().toString();
                String noun3out = noun3.getText().toString();
                String verbOut = verb.getText().toString();
                String adjOut = adjective.getText().toString();


                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("Noun1", noun1out);
                intent.putExtra("Noun2", noun2out);
                intent.putExtra("Noun3", noun3out);
                intent.putExtra("Verb", verbOut);
                intent.putExtra("Adj", adjOut);

                startActivity(intent);
            }
        });
    }
}
