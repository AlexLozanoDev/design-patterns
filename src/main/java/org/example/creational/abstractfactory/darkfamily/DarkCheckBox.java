package org.example.creational.abstractfactory.darkfamily;

import org.example.creational.abstractfactory.abstractproducts.Checkbox;

/**
 * PRODUCT B 1
 */

public class DarkCheckBox implements Checkbox {
    @Override
    public void renderizar() {
        System.out.println("Se crea checkbox oscuro");
    }
}
