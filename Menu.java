import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Menu extends GameObject {
    private Button[] buttons;



    public Menu(int w, int h, int amount) {
        super(500-w/2, 400-h/2, w, h);
        buttons = new Button[amount];
        for(int k=0;k<buttons.length;k++) {
            buttons[k]=new Button(x,y,w,h,buttons.length,k); 
        }
        
        
    }

    public Menu() {
        super(500-200, 400-200, 400, 400);
        buttons = new Button[3];
        for(int k=0;k<buttons.length;k++) {
            buttons[k]=new Button(x,y,w,h,buttons.length,k);
        }
    }

    public void update() {
        
    }

    public void draw(Graphics pen) {
        pen.setColor(Color.gray);
        pen.fillRect(x, y, w, h);
        pen.setColor(Color.BLACK);
        pen.drawRect(x, y, w, h);

        for(Button b: buttons) {
            b.draw(pen);
        }
    }
        
}
