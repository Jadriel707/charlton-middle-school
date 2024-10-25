import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Spot extends GameObject {
    private boolean occupied;
    private boolean hover;

    public Spot(int x, int y, int size) {
        super(x, y, size, size);
    }


    public void update() {
        setHover(Cursor.insideRect(this));
    }

    public void setHover(boolean b) {
        hover=b;
    }

    public void draw(Graphics pen) {
        if(hover) {
            pen.setColor(Color.green);
        } else {
            pen.setColor(Color.blue);
        }
        pen.fillRect(x, y, w, h);
        pen.setColor(Color.black);
        pen.drawRect(x, y, w, h);
    }



}
