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

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class Login extends AppCompatActivity {
    private EditText username;
    private EditText pass;
    private Button login;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        username = (EditText) findViewById(R.id.login_name);
        pass = (EditText) findViewById(R.id.login_password);

        signup = (Button)findViewById(R.id.sign_up);
        login = (Button)findViewById(R.id.log_in);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
            }

        };
        signup.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //check if the username and the two pass match
                boolean valid = true;
                StringBuffer message = new StringBuffer("Please ");

                if(username.getText()==null)
                {
                    valid = false;
                    message.append("fill username ");
                }
                if(pass.getText()==null)
                {
                    if(!valid)
                    {
                        message.append("and");
                    }
                    valid = false;
                    message.append("fill password  ");
                }
                message.append(".");

                if(!valid)
                {
                    Toast.makeText(Login.this, message.toString(), Toast.LENGTH_SHORT).show();
                    return;
                }

                final ProgressDialog dialog = new ProgressDialog(Login.this);
                dialog.setTitle("Please wait. We appreciate your patience.");
                dialog.setMessage("Logging in ...");
                dialog.show();

                ParseUser.logInInBackground(username.getText().toString(), pass.getText().toString(), new LogInCallback() {
                    public void done(ParseUser user, com.parse.ParseException e) {
                        dialog.dismiss();
                        if (e == null) {
                            Intent i = new Intent(Login.this, Decision.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(i);
                            finish();

                        } else {

                            Toast.makeText(getApplicationContext(),
                                    e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });

            }

        };
        login.setOnClickListener(listener1);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
