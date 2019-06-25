package optare.solid.dip4;

import optare.solid.dip4.database.MongoPersistence;
import optare.solid.dip4.database.Persistence;
import optare.solid.dip4.database.SQLPersistence;
import optare.solid.dip4.payment.CreditCardPaymentMethod;
import optare.solid.dip4.payment.PaymentMethod;
import optare.solid.dip4.payment.PaypalPaymentMethod;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingBasketTest {

    private Persistence sqlPersistence = new SQLPersistence();
    private Persistence mongoPersistence = new MongoPersistence();

    private PaymentMethod creditCardPaymentMethod = new CreditCardPaymentMethod();
    private PaymentMethod paypalPaymentMethod = new PaypalPaymentMethod();

    @Test
    public void should_buy_when_use_sql_persistence_and_creditCard_payment() {

        ShoppingBasket shoppingBasket = new ShoppingBasket(sqlPersistence, creditCardPaymentMethod);
        Shopping shopping = new Shopping();
        Boolean result = shoppingBasket.buy(shopping);

        Assert.assertEquals(true, result);
    }

    @Test
    public void should_buy_when_use_mongo_persistence_and_paypal_payment() {

        ShoppingBasket shoppingBasket = new ShoppingBasket(mongoPersistence, paypalPaymentMethod);
        Shopping shopping = new Shopping();
        Boolean result = shoppingBasket.buy(shopping);

        Assert.assertEquals(true, result);
    }
}