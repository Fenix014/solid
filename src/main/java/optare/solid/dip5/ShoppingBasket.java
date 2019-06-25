package optare.solid.dip5;

import optare.solid.dip5.database.Persistence;
import optare.solid.dip5.payment.PaymentMethod;

public class ShoppingBasket {

    private Persistence persistence;
    private PaymentMethod paymentMethod;

    public ShoppingBasket(Persistence persistence, PaymentMethod paymentMethod) {
        this.persistence = persistence;
        this.paymentMethod = paymentMethod;
    }

    public boolean buy(Shopping shopping) {

        Shopping shoppingSaved = persistence.save(shopping);
        boolean isPaid = paymentMethod.pay(shopping);

        return shoppingSaved != null && isPaid;
    }
}


