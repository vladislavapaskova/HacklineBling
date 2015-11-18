package com.example.vladislavapaskova.hacklineblinghh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class Decision extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //check if the user has already been logged in or not
        //if the current user is existent

        if(ParseUser.getCurrentUser() !=null )
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }
        else
        {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
            finish();
        }


    }
}
