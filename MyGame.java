import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MyGame extends Game  {
    public static final String TITLE = "Farm Merge Valley 2";
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 800;

    public static GameScreen gameScreen;
    public static Screen activeScreen;

    // declare variables here
    Grid testGrid;
    Spot testObject;


    public MyGame() {
        // initialize variables here
        gameScreen=new GameScreen();
        gameScreen.objects.add(new Grid(100, 100, 14, 12, 50));

        activeScreen=gameScreen;
    }
    
    public void update() {
        // updating logic
        activeScreen.update();
    }
    
    public void draw(Graphics pen) {
        activeScreen.draw(pen);
    }
        
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void mouseClicked(MouseEvent ke) {}

    @Override
    public void mousePressed(MouseEvent me) {}
    
    @Override
    public void mouseMoved(MouseEvent me) {
        Cursor.uptadePos(me.getX(), me.getY());    
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        Cursor.uptadePos(me.getX(), me.getY());
    }
    
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}