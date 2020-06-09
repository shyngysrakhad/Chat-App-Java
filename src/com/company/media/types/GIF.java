package com.company.media.types;

public class GIF extends Image{

    public GIF(String name) {
        super(name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + name + ".gif");
    }
}
