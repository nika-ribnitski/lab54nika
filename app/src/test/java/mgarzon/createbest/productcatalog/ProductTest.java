package mgarzon.createbest.productcatalog;

import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void checkProductName(){
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", product.getProductName());
    }

    public void checkProductID(){
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", product.getId());
    }

    public void checkProductPrice(){
        //won't work :P
        Product product = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the price of the product", 0, product.getPrice());
    }

}