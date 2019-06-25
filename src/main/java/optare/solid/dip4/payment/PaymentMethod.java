package optare.solid.dip4.payment;

import optare.solid.dip4.Shopping;

public interface PaymentMethod {
    boolean pay(Shopping shopping);
}