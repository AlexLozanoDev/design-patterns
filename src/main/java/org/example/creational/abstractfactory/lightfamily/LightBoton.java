package org.example.creational.abstractfactory.lightfamily;

import org.example.creational.abstractfactory.abstractproducts.Boton;

/**
 * PRODUCT A 2
 */

public class LightBoton implements Boton {

    @Override
    public void renderizar() {
        System.out.println("Se cre boton claro");
    }
}
