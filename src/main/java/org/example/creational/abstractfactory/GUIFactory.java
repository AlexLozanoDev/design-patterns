package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.abstractproducts.Boton;
import org.example.creational.abstractfactory.abstractproducts.Checkbox;

/**
 * ABSTRACT FACTORY
 */

public interface GUIFactory {

    Boton crearBoton();
    Checkbox crearCheckbox();

}
