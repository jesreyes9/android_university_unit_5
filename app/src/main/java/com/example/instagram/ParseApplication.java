package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {








    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YHAh6ZXdqBeetrM89O3Mz0MGeC0vojMoNqYhiRy0") // should correspond to Application Id env variable
                .clientKey("ZPydq5mYPYxwyT7NvQsy67mA3b5AGa2BUt3tvkGJ")
                        .server("https://parseapi.back4app.com").build());
    }
}
