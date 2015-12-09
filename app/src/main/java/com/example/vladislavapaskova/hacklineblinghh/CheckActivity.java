package com.example.vladislavapaskova.hacklineblinghh;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    TextView answer;
    TextView user_answer;

    private String actual_answer;
    private String answerI;

    Database qdat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initialize the two text fields
        user_answer = (TextView) findViewById(R.id.user_answer);
        answer = (TextView) findViewById(R.id.answer);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            actual_answer = getIntent().getStringExtra("user_answer");
            answerI= getIntent().getStringExtra("answer");
        }


        //set the text into the question field
        user_answer.setText(actual_answer);
        user_answer.setMovementMethod(new ScrollingMovementMethod());

        //qdat = new Database();

        answer.setText(qdat.retrieveAnswer());
        answer.setMovementMethod(new ScrollingMovementMethod());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
