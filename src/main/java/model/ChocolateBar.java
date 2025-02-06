package model;

public class ChocolateBar extends Product {
    private final int CocoaPercentage;

    public ChocolateBar(String productName, double price, int cocoaPercentage) {
        super(productName, price);
        this.CocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return CocoaPercentage;
    }

    @Override
    String use() {
        return String.format("%s Chocolate Bar - %.2f¤", this.getProductName(), this.getPrice());
    }

    @Override
    String examine() {
        return String.format("""
                        %s
                        | Product ID: %d
                        | Price: %.2f
                        | Cocoa content: %d%%""",
                this.getProductName(), this.getId(), this.getPrice(), this.CocoaPercentage);
    }
}
