package model;

public class SoftDrink extends Product {
    private final String flavor;
    private final int bottleSizeInMl;

    public SoftDrink(String productName, double price, String flavor, int bottleSizeInMl) {
        super(productName, price);
        this.flavor = flavor;
        this.bottleSizeInMl = bottleSizeInMl;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getBottleSizeInMl() {
        return bottleSizeInMl;
    }

    @Override
    String use() {
        return String.format("%dml bottle of %s - %.2f¤",
                bottleSizeInMl,
                getProductName(),
                getPrice());
    }

    @Override
    String examine() {
        return String.format("""
                        %s
                        | Product ID: %d
                        | Price: %.2f
                        | Flavor: %s
                        | Size: %dml""",
                getProductName(), getId(), getPrice(), flavor, bottleSizeInMl);
    }
}
