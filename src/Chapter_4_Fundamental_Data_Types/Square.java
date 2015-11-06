package Chapter_4_Fundamental_Data_Types;

/** 
 * Solution to exercise P4.8
 *
 * Computes the area, perimeter and diagonal of a square.
 * 
 * @author ChrisBerryman.
 */
public class Square {
    
    private final double sideLength;
    
    /**
     * Constructs a square
     * @param sideLength the length of the sides of the square
     */
    public Square(double sideLength) {        
        this.sideLength = sideLength;        
    }
    
    /**
     * Returns the area of the square.
     * @return the area
     */
    public double getArea() {        
        return sideLength * sideLength;        
    }
    
    /**
     * Returns the perimeter of the square.
     * @return the perimeter
     */
    public double getPerimeter() {        
        return 4 * sideLength;        
    }
    
    
    /**
     * Returns the diagonal of the square.
     * @return the diagonal
     */
    public double getDiagonal() {        
        return Math.sqrt(2 * sideLength);        
    }
    
}
