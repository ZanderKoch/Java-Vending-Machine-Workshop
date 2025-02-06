package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SoftDrinkTest {
    private SoftDrink softDrink;

    @BeforeEach
    void setUp() {
        softDrink = new SoftDrink("Fizzy Delight", 2.49, "Cola", 500);
    }

    @Test
    void testConstructorInitialization() {
        assertEquals("Fizzy Delight", softDrink.getProductName(), "Product name should match");
        assertEquals(2.49, softDrink.getPrice(), "Price should match");
        assertEquals("Cola", softDrink.getFlavor(), "Flavor should match");
        assertEquals(500, softDrink.getBottleSizeInMl(), "Bottle size should match");
    }

    @Test
    void testGetFlavor() {
        assertEquals("Cola", softDrink.getFlavor(), "Flavor getter should return correct value");
    }

    @Test
    void testGetBottleSizeInMl() {
        assertEquals(500, softDrink.getBottleSizeInMl(), "Bottle size getter should return correct value");
    }

    @Test
    void testUse() {
        String expectedUseMessage = "500ml bottle of Fizzy Delight - 2,49¤";
        assertEquals(expectedUseMessage, softDrink.use(), "Use message should match the expected format");
    }

    @Test
    void testExamine() {
        int expectedId = softDrink.getId(); // Capture dynamic ID
        String expectedMessage = String.format("""
                Fizzy Delight
                | Product ID: %d
                | Price: 2,49
                | Flavor: Cola
                | Size: 500ml""", expectedId);

        assertEquals(expectedMessage, softDrink.examine(), "Examine message should match the expected format");
    }
}