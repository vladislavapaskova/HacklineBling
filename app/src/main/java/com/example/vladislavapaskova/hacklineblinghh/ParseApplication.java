package com.example.vladislavapaskova.hacklineblinghh;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by vladislavapaskova on 11/10/15.
 */
public class ParseApplication extends Application{
    public void onCreate() {
        super.onCreate();

        //initialize parse
        // Enable Local Datastore.
        //Parse.enableLocalDatastore(this);
        //ParseObject.registerSubclass(MainActivity.class);
        System.out.println("inside the application");
        Parse.initialize(this, "nF8YvmVSBj70IRzECKvGhnseBm7G44WjajcuOmVq", "JChdx6mxtBSrTd7rFHaN4xRMPDqVrgVvQVYcuE1V");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
