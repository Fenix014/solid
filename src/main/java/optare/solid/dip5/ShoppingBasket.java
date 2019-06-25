package optare.solid.dip5;

import optare.solid.dip5.database.SqlDatabase;
import optare.solid.dip5.payment.CreditCard;

public class ShoppingBasket {

    public boolean buy(Shopping shopping) {

        SqlDatabase db = new SqlDatabase();
        CreditCard creditCard = new CreditCard();

        Shopping shoppingSaved = db.save(shopping);
        Boolean isPaid = creditCard.pay(shopping);

        return shoppingSaved != null && isPaid;
    }
}


