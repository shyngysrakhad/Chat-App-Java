package com.company.media.types;

public class JPEG extends Image {

    public JPEG(String name) {
        super(name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + name + ".jpeg");
    }
}
