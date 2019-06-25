package optare.solid.sip4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDProductTest {

    @Test
    public void should_get_name_when_is_a_CD() {
        Product product = new CDProduct();
        assertEquals("CD", product.getName());
    }

    @Test
    public void should_get_stock_when_is_a_CD() {
        Product product = new CDProduct();
        assertEquals(10, product.getStock());
    }

    @Test
    public void should_get_recommended_age_when_is_a_CD() {
        Product product = new CDProduct();
        assertEquals(10, product.getRecommendedAge());
    }


}