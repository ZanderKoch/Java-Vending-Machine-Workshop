package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BagOfChipsTest {
    private BagOfChips bagOfChips;

    @BeforeEach
    void setUp() {
        bagOfChips = new BagOfChips("Crunchy Chips", 1.99, "Sour Cream & Onion", 150);
    }

    @Test
    void testConstructorInitialization() {
        assertEquals("Crunchy Chips", bagOfChips.getProductName(), "Product name should match");
        assertEquals(1.99, bagOfChips.getPrice(), "Price should match");
        assertEquals("Sour Cream & Onion", bagOfChips.getFlavor(), "Flavor should match");
        assertEquals(150, bagOfChips.getWeightInGrams(), "Weight should match");
    }

    @Test
    void testGetFlavor() {
        assertEquals("Sour Cream & Onion", bagOfChips.getFlavor(), "Flavor getter should return correct value");
    }

    @Test
    void testGetWeightInGrams() {
        assertEquals(150, bagOfChips.getWeightInGrams(), "Weight getter should return correct value");
    }

    @Test
    void testUse() {
        String expectedUseMessage = "150g bag of Crunchy Chips - 1,99¤";
        assertEquals(expectedUseMessage, bagOfChips.use(), "Use message should match the expected format");
    }

    @Test
    void testExamine() {
        int expectedId = bagOfChips.getId(); // Capture dynamic ID
        String expectedMessage = String.format("""
                Crunchy Chips
                | Product ID: %d
                | Price: 1,99
                | Flavor: Sour Cream & Onion
                | Weight: 150g""", expectedId);

        assertEquals(expectedMessage, bagOfChips.examine(), "Examine message should match the expected format");
    }
}
