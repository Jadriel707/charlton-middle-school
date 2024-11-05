import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Button extends GameObject{
    private ClickBehaviour c;
    private boolean hover;

    public Button(int menuX, int menuY, int menuW, int menuH, int menuA, int k) {
        super(0, 0, 0, 0);
        w=(menuW*3)/4;
        h=(menuH-20-20*menuA)/menuA;
        x=menuX+menuW/2-w/2;
        y=menuY+20+k*(h+20);
        c=new MenuButton();

    }

    public Button(int x, int y, int w, int h) {
        super(x, y, w, h);
    }


    public void update() {
        
    }

    public void setClickBehaviour(ClickBehaviour newC) {
        c=newC;
    }

    public void draw(Graphics pen) {
        pen.setColor(Color.lightGray);
        pen.fillRect(x, y, w, h);
        pen.setColor(Color.red);
        pen.drawRect(x,y,w,h);
    }

    public void setHover(boolean b) {
        hover = b;
    }

    public boolean isHovered() {
        return hover;
    }

    public void action() {
        c.click();
    }

    // Mouse Inputs

    public void mousePressed(MouseEvent me) {
       if(Cursor.insideRect(this)) {
        action();
       }
    }


    
}
