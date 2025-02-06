package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp() {
        // Create concrete instances for testing
        product1 = new TestProduct("Product A", 29.99);
        product2 = new TestProduct("Product B", 49.99);
    }

    @Test
    void testProductIdIncrements() {
        assertNotEquals(product1.getId(), product2.getId(), "Product IDs should be unique and increment sequentially.");
    }

    @Test
    void testProductName() {
        assertEquals("Product A", product1.getProductName(), "Product name should match the provided value.");
        assertEquals("Product B", product2.getProductName(), "Product name should match the provided value.");
    }

    @Test
    void testProductPrice() {
        assertEquals(29.99, product1.getPrice(), "Product price should match the provided value.");
        assertEquals(49.99, product2.getPrice(), "Product price should match the provided value.");
    }

    @Test
    void testUseMethod() {
        assertEquals("Using Product A", product1.use(), "use() method should return the expected value.");
    }

    @Test
    void testExamineMethod() {
        assertEquals("Examining Product A", product1.examine(), "examine() method should return the expected value.");
    }

    // Concrete subclass for testing purposes
    private static class TestProduct extends Product {
        public TestProduct(String productName, double price) {
            super(productName, price);
        }

        @Override
        String use() {
            return "Using " + getProductName();
        }

        @Override
        String examine() {
            return "Examining " + getProductName();
        }
    }
}
