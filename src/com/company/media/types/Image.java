package com.company.media.types;

import com.company.Media;

public abstract class Image extends Media {
    protected String name;
    public Image(String name){
        this.name = name;
    }
    public abstract void getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
