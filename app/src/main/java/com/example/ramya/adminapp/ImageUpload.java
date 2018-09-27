package com.example.ramya.adminapp;

/**
 * Created by ramya on 27/9/18.
 */

public class ImageUpload {
    public String name;
    public String uri;

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public ImageUpload(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }
}
