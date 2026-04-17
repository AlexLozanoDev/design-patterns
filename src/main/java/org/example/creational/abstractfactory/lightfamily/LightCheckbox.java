package org.example.creational.abstractfactory.lightfamily;

import org.example.creational.abstractfactory.abstractproducts.Checkbox;

/**
 * PRODUCT B 2
 */

public class LightCheckbox implements Checkbox {
    @Override
    public void renderizar() {
        System.out.println("Se crea checkbox claro");
    }
}
