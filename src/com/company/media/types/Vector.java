package com.company.media.types;

public class Vector extends Image{
    public Vector(String name) {
        super(name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + name + ".svg");
    }
}
