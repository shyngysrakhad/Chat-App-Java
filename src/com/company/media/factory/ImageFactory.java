package com.company.media.factory;

import com.company.media.types.*;

public class ImageFactory implements IImage{
    @Override
    public Image selectImage(String imageName, String imageEx){
        switch (imageEx){
            case "gif":
                return new GIF(imageName);
            case "jpeg":
                return new JPEG(imageName);
            case "png":
                return new PNG(imageName);
            case "svg":
                return new Vector(imageName);
            default:
                throw new IllegalArgumentException("Error extension. Please choose from: gif, jpeg, png, svg");
        }
    }
}
