package com.company.media.types;

public class PNG extends Image {
    public PNG(String name) {
        super(name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + name + ".png");
    }
}
