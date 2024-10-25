import java.awt.Color;
import java.awt.Graphics;

public class Grid extends GameObject {
    private Spot[][] gridArray;
    private int spotSize;
    
    

    public Grid(int offX, int offY,  int amountX, int amountY, int boxSize) {
        super(amountX, offY, amountX*boxSize, amountY*boxSize);
        gridArray = new Spot[amountY][amountX];
        for(int row=0;row<amountY;row++) {
            for(int col=0;col<amountX;col++) {
                gridArray[row][col]=new Spot(offX+(col*boxSize), offY+(row*boxSize), boxSize);
            }
        }
        
        spotSize=boxSize;
           
    }

    public void draw(Graphics pen) {
        for(Spot[] row : gridArray) {
            for(Spot col : row) {
                col.draw(pen);
            }
        }
    }

    public Spot[][] getGrid() {
        return gridArray;
    }
    
    public void update() {
        for(Spot[] row : gridArray) {
            for(Spot col : row) {
                col.update();
            }
        }
    }
    
}
