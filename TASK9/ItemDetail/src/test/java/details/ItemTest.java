package details;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        item1 = new Item("ona", 75, 2448, "14/5/2025");


    }

    @org.junit.jupiter.api.Test
    void getItemCost() {
        double expected = 244800;
        assertEquals(expected, item1.GetItemCost(100));
    }

    @org.junit.jupiter.api.Test
    void exchangeRates() {
        double expected = 68;
        assertEquals(expected, item1.exchangeRates("UGX","USD",100));

    }
}