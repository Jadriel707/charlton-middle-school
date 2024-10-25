import java.awt.Graphics;
public class GameScreen extends Screen {

    public GameScreen() {
        super("Game Screen", "assets/grassBg1.png");
        
    }

    public void draw(Graphics pen) {
        pen.drawImage(bg_image, 0, 0, null);
        for(int i=0;i<objects.size();i++) {
            objects.get(i).draw(pen);
        }
    }

    public void update() {
        for(int i=0;i<objects.size();i++) {
            objects.get(i).update();
        }
    }



    
}