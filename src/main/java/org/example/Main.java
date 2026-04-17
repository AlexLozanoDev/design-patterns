package org.example;

import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.GUIFactory;
import org.example.creational.abstractfactory.darkfamily.DarkModeFactory;
import org.example.creational.abstractfactory.lightfamily.LightModeFactory;
import org.example.creational.factorymethod.Payment;
import org.example.creational.factorymethod.PaymentFactory;
import org.example.creational.factorymethod.TypesPayment;

public class Main {
    public static void main(String[] args) {
//        factoryMethod();
        abstractFactory();
    }

    private static void factoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypesPayment.GOOGLEPAY);
        payment.doPayment();
    }

    private static void abstractFactory(){
        GUIFactory factory;

        String theme = "DARK";

        if ("DARK".equals(theme)){
            factory = new DarkModeFactory();
        }else {
            factory = new LightModeFactory();
        }

        Application application = new Application(factory);
        application.renderUI();

    }
}