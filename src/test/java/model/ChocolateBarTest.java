package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChocolateBarTest {
    private ChocolateBar chocolateBar;

    @BeforeEach
    void setUp() {
        chocolateBar = new ChocolateBar("Dark Delight", 3.50, 70);
    }

    @Test
    void testConstructorInitialization() {
        assertEquals("Dark Delight", chocolateBar.getProductName(), "Product name should match");
        assertEquals(3.50, chocolateBar.getPrice(), "Price should match");
        assertEquals(70, chocolateBar.getCocoaPercentage(), "Cocoa percentage should match");
    }

    @Test
    void testGetCocoaPercentage() {
        assertEquals(70, chocolateBar.getCocoaPercentage(), "Cocoa percentage getter should return correct value");
    }

    @Test
    void testUse() {
        String expectedUseMessage = "Dark Delight Chocolate Bar - 3,50¤";
        assertEquals(expectedUseMessage, chocolateBar.use(), "Use message should match the expected format");
    }

    @Test
    void testExamine() {
        int expectedId = chocolateBar.getId(); // Capture dynamic ID
        String expectedMessage = String.format("""
                Dark Delight
                | Product ID: %d
                | Price: 3,50
                | Cocoa content: 70%%""", expectedId);

        assertEquals(expectedMessage, chocolateBar.examine(), "Examine message should match the expected format");
    }
}