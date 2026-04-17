package org.example;

import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.GUIFactory;
import org.example.creational.abstractfactory.darkfamily.DarkModeFactory;
import org.example.creational.abstractfactory.lightfamily.LightModeFactory;
import org.example.creational.builder.Usuario;
import org.example.creational.factorymethod.Payment;
import org.example.creational.factorymethod.PaymentFactory;
import org.example.creational.factorymethod.TypesPayment;
import org.example.creational.prototype.Enemigo;
import org.example.creational.prototype.EnemyRegistry;
import org.example.creational.prototype.OrcoGuerrero;

public class Main {
    public static void main(String[] args) {
        prototype();
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

    private static void builder(){
        Usuario usuario = new Usuario.UsuarioBuilder("Alex Lozano", "alex@gmail.com")
                .numero(123123455)
                .pais("Mexico")
                .ciudad("CDMX")
                .genero("H")
                .edad(23)
                .build();

        System.out.println(usuario);
    }

    private static void prototype(){
        EnemyRegistry registro = new EnemyRegistry();

        // Creamos el prototipo original (Costo alto: 1 sola vez)
        OrcoGuerrero orcoBase = new OrcoGuerrero("Textura_HD_Verde.png", 100);
        registro.registrar("OrcoBasico", orcoBase);

        // Clonamos rápidamente sin volver a cargar la textura
        Enemigo orco1 = registro.buscarYClonar("OrcoBasico");
        orco1.setPosicion(10, 20);

        Enemigo orco2 = registro.buscarYClonar("OrcoBasico");
        orco2.setPosicion(50, 80);

        orco1.mostrarInfo();
        orco2.mostrarInfo();
    }
}