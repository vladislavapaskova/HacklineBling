package com.example.vladislavapaskova.hacklineblinghh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {

    Database questionDat;
    public TextView question;
    public EditText answer;
    public Button hint;
    public Button done;

    //the answer of the user
    public String qAns;
    public String value;
    private String actualAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initialize the two text fields
        question = (TextView) findViewById(R.id.question);
        answer = (EditText) findViewById(R.id.answer);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = getIntent().getStringExtra("question_num");
        }
        questionDat = new Database();
        //set the text into the question field
        question.setText(questionDat.retrieve(value));

        //initialize the two buttons
        done = (Button)findViewById(R.id.done);
        hint = (Button)findViewById(R.id.hint);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                qAns = answer.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CheckActivity.class);
                intent.putExtra("user_answer", qAns);
                intent.putExtra("answer", value);
                startActivity(intent);
            }

        };
        done.setOnClickListener(listener);

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

    public String getAnswer()
    {
        return qAns;
    }

}
