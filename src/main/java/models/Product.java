package models;

import java.io.Serializable;

/**
 * @author Rentaian
 */
public class Product implements Serializable {

    private int id;
    private String productName;
    private int stock;
    private int version;

    public Product() {
    }

    public Product(int id, String productName, int stock, int version) {
        this.id = id;
        this.productName = productName;
        this.stock = stock;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                ", version=" + version +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
