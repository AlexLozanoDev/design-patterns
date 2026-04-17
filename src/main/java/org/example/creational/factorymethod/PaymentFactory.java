package org.example.creational.factorymethod;

/**
 * FACTORY METHOD
 * CONCRETE CREATOR
 * Se usa cuando necesitamos crear una instancia de un objeto cuando
 * no se sabe que objeto sera, o porque dependemos de la configuracion
 * que se hace en tiempo de despliegue de la aplicacion.
 *
 */
public class PaymentFactory {

    public static Payment buildPayment(TypesPayment payment){
        return switch (payment){
            case GOOGLEPAY -> new GooglePayment();
            case CARD -> new CardPayment();
            case null, default -> new CardPayment();
        };
    }

}
