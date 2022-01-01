package com.threecubed.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class SprinteSheet {
    
    private BufferedImage spritesheet;

    public SprinteSheet(String path){
        try {
            spritesheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getSprite(){
        return spritesheet;
        
    }
}
