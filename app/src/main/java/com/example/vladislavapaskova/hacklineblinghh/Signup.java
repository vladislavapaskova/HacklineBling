package com.example.vladislavapaskova.hacklineblinghh;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Signup extends AppCompatActivity {

    private EditText username;
    private EditText pass;
    private EditText cpass;
    private Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        username = (EditText) findViewById(R.id.signup_name);
        pass = (EditText) findViewById(R.id.signup_password);
        cpass = (EditText) findViewById(R.id.signup_rpassword);

        done = (Button)findViewById(R.id.signup_done);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //check if the username and the two pass match
                boolean valid = true;
                StringBuffer message = new StringBuffer("Please ");

                if(username.getText()==null)
                {
                    if(!valid)
                    {
                        message.append("and");
                    }
                    valid = false;
                    message.append("add username ");
                }
                if(pass.getText()==null)
                {
                    if(!valid)
                    {
                        message.append("and");
                    }
                    valid = false;
                    message.append("add password  ");
                }
                if(cpass.getText()==null)
                {
                    if(!valid)
                    {
                        message.append("and");
                    }
                    valid = false;
                    message.append("confirm password ");
                }
                if(!pass.getText().toString().equals(cpass.getText().toString()))
                {
                    if(!valid)
                    {
                        message.append("and");
                    }
                    valid = false;
                    message.append("enter the same password ");
                }
                message.append(".");
                //display error if any
                if(!valid)
                {
                    Toast.makeText(Signup.this,message.toString(), Toast.LENGTH_SHORT).show();
                    return;
                }


                //put user info in parse

                final ProgressDialog dialog = new ProgressDialog(Signup.this);
                dialog.setTitle("Please wait. We appreciate your patience.");
                dialog.setMessage("Singing up ...");
                dialog.show();


                //create a new user
                ParseUser user = new ParseUser();
                user.setPassword(pass.getText().toString());
                user.setUsername(username.getText().toString());

                user.signUpInBackground(new SignUpCallback() {
                    public void done(com.parse.ParseException e) {
                        dialog.dismiss();
                        if (e == null) {
                            //start next activity
                            Intent i = new Intent(Signup.this, MainActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(i);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    e.getMessage()
                                    , Toast.LENGTH_LONG).show();
                        }
                    }
                });


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

}
