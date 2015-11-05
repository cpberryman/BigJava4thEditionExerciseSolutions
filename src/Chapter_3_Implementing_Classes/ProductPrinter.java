package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.9.
 *
 * @author ChrisBerryman
 */
public class ProductPrinter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Product firstProduct = new Product("Android Phone", 400);
        Product secondProduct = new Product("iPhone", 500);        
        System.out.println("First product name: " + firstProduct.getName());
        System.out.println("First product price: " + firstProduct.getPrice());
        System.out.println("Second product name: " + secondProduct.getName());
        System.out.println("Second product price: " + secondProduct.getPrice());
        firstProduct.reducePrice(5);
        secondProduct.reducePrice(5);
        System.out.println("First product reduced price: " + firstProduct.getPrice());
        System.out.println("Second product reduced price: " + secondProduct.getPrice());        
    }
    
}
