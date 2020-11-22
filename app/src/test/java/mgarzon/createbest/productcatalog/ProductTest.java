package mgarzon.createbest.productcatalog;

import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testGetId() {
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", product.getId());

    }

    public void testGetProductName() {
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", product.getProductName());
    }

    public void testGetPrice() {
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the price of the product", 180.0, product.getPrice()); // <-- Changed to make it expect the right value!
    }
}