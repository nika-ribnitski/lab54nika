package mgarzon.createbest.productcatalog;

/**
 * Created by Miguel Garzón on 2017-05-07.
 */

public class Product {
    private String id;
    private String productName;
    private double price;

    public Product(String id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }


    public void setId(String id) {

        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getProductName() {

        return this.productName;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {

        return this.price;
    }

}


