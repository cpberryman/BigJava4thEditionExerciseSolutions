package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.9
 *
 * @author ChrisBerryman
 */
public class Product {

    private String name;
    private double price;

    /**
     * Constructs a product object
     *
     * @param name the name of the product
     * @param price price of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the product
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the product
     *
     * @return the unit price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Reduces the price of the product
     *
     * @param amount the amount to reduce the price.
     */
    public void reducePrice(double amount) {
        price -= amount;
    }

}
