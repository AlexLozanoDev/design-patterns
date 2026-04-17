package org.example.creational.abstractfactory.darkfamily;

import org.example.creational.abstractfactory.*;
import org.example.creational.abstractfactory.abstractproducts.Boton;
import org.example.creational.abstractfactory.abstractproducts.Checkbox;

/**
 * CONCRETE FACTORY 1
 */

public class DarkModeFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new DarkBoton();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new DarkCheckBox();
    }
}
