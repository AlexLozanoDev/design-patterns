package org.example.creational.abstractfactory.darkfamily;

import org.example.creational.abstractfactory.abstractproducts.Boton;

/**
 * PRODUCT A 1
 */

public class DarkBoton implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Se crea boton oscuro");
    }
}
