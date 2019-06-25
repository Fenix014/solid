package optare.solid.dip5.payment;

import optare.solid.dip5.Shopping;

public interface PaymentMethod {
    boolean pay(Shopping shopping);
}