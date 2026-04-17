package org.example.creational.factorymethod;

/**
 * CONCRETE PRODUCT: Card payment
 */
public class CardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de credito");
    }
}
