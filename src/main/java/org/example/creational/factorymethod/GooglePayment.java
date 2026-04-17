package org.example.creational.factorymethod;

/**
 * CONCRETE PRODUCT: Card payment
 */
public class GooglePayment implements Payment{

    @Override
    public void doPayment() {
        System.out.println("Pagando con google payment");
    }
}
