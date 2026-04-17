package org.example;

import org.example.creational.factorymethod.Payment;
import org.example.creational.factorymethod.PaymentFactory;
import org.example.creational.factorymethod.TypesPayment;

public class Main {
    public static void main(String[] args) {
        factoryMethod();
    }

    private static void factoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypesPayment.GOOGLEPAY);
        payment.doPayment();
    }
}