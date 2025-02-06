package model;

public class BagOfChips extends Product {
    private final String flavor;
    private final int weightInGrams;

    public BagOfChips(String productName, double price, String flavor, int weightInGrams) {
        super(productName, price);
        this.flavor = flavor;
        this.weightInGrams = weightInGrams;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    @Override
    String use() {
        return String.format("%dg bag of %s - %.2f¤", this.weightInGrams, this.getProductName(), this.getPrice());
    }

    @Override
    String examine() {
        return String.format("""
                        %s
                        | Product ID: %d
                        | Price: %.2f
                        | Flavor: %s
                        | Weight: %dg""",
                getProductName(), getId(), getPrice(), flavor, weightInGrams);
    }
}