package optare.solid.sip4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDProductTest {

    @Test
    public void should_get_name_when_is_a_DVD() {
        DVDProduct product = new DVDProduct();
        assertEquals("DVD", product.getName());
    }

    @Test
    public void should_get_stock_when_is_a_DVD() {
        DVDProduct product = new DVDProduct();
        assertEquals(30, product.getStock());
    }

}