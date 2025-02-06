package model;


abstract class Product {
    private static int idCounter = 0;
    private final int id;
    private final double price;
    private final String productName;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    abstract String use();

    abstract String examine();
}
