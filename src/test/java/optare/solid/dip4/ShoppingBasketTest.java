package optare.solid.dip4;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingBasketTest {

    @Test
    public void should_save_shopping_and_paid() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Shopping shopping = new Shopping();
        Boolean result = shoppingBasket.buy(shopping);

        Assert.assertEquals(true, result);
    }
}