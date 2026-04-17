package org.example.creational.abstractfactory.lightfamily;

import org.example.creational.abstractfactory.*;
import org.example.creational.abstractfactory.abstractproducts.Boton;
import org.example.creational.abstractfactory.abstractproducts.Checkbox;

/**
 * CONCRETE FACTORY 2
 */

public class LightModeFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new LightBoton();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new LightCheckbox();
    }
}
