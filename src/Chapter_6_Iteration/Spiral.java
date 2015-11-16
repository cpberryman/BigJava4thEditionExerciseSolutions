package Chapter_6_Iteration;

import java.awt.Graphics2D;

/**
 * Solution to exercise P6.19
 *
 * @author ChrisBerryman
 */
public class Spiral {

    private int x, y, toX, toY,
            lines;
    private final static int RIGHT = 1;
    private final static int UP = 2;
    private final static int LEFT = 3;
    private final static int DOWN = 0;

    public Spiral(int startX, int startY, int lines) {
        x = startX;
        y = startY;
        this.lines = lines;
    }

    /**
     * Draws the spiral.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        int length = 0;
        int direction = 0;
        for (int i = 0; i < 5; i++) {
           
            
            if (i % 2 == 0) {
                length += 20;
                //System.out.println("length:" + length);
            }
            //System.out.println("direction:" + direction);
             direction = (direction + 1) % 4;
             System.out.println("direction:" + direction);
            if (direction == RIGHT) {
                System.out.println("----RIGHT-----");
                //System.out.println(length);
                toX = x + length;
                toY = y;
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                System.out.println("ToX: " + toX);
                System.out.println("ToY: " + toY);
                g2.drawLine(x, y, toX, toY);
            } 
            
            if (direction == UP) {
                System.out.println("-----UP----");
                //System.out.println(length);
                x = toX;
                y = toY;
                toY = y - length;
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                System.out.println("ToX: " + toX);
                System.out.println("ToY: " + toY);
                g2.drawLine(x, y, toX, toY);

            } 
            
            if (direction == LEFT) {
                System.out.println("-----LEFT----");
                //System.out.println(length);
                x = toX;
                y = toY;
                toX = x - length;
                toY = y;
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                System.out.println("ToX: " + toX);
                System.out.println("ToY: " + toY);
                g2.drawLine(x, y, toX, toY);
            } 
            
            if (direction == DOWN) {
                System.out.println("-----DOWN----");
                //System.out.println(length);
                x = toX;
                y = toY;
                toX = x;
                toY = y + length;
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                System.out.println("ToX: " + toX);
                System.out.println("ToY: " + toY);
                g2.drawLine(x, y, toX, toY);
            }
            
        }
    }
    
    public void drawNextLine() {
        
    }
    /* public void draw(Graphics2D g2) {
     System.out.println("X: " + x);
     System.out.println("Y: " + y);
     toX = x + 20;
     toY = y;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toY = y - 20;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toX = x - 40;
     toY = y;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toX = x;
     toY = y + 40;
     g2.drawLine(x, y, toX, toY);
        
     y = toY;
     toX = x + 60;
     toY = y;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toY = y - 60;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toX = x - 80;
     toY = y;
     g2.drawLine(x, y, toX, toY);
     x = toX;
     y = toY;
     toX = x;
     toY = y + 80;
     g2.drawLine(x, y, toX, toY);
        
        
     }*/

}
