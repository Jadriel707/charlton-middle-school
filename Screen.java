import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import java.awt.event.MouseEvent;



public abstract class Screen {
    protected String title;
    public ArrayList<GameObject> objects;
    public BufferedImage bg_image;
    public static int WIDTH = 1700;
    public static int HEIGHT = 900;
    
    public Screen(String title, String bg_image) {
        this.title=title;
        objects=new ArrayList<GameObject>();
        try {
            this.bg_image = ImageIO.read(new File(bg_image));
        } catch (IOException e) {}
    }

    public void update() {}

    public void draw(Graphics pen) {}

    public void mousePressed(MouseEvent me) {}
    

    
}
