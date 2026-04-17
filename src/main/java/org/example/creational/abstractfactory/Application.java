package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.abstractproducts.Boton;
import org.example.creational.abstractfactory.abstractproducts.Checkbox;

public class Application {

    private final Boton boton;
    private final Checkbox checkbox;

    public Application(GUIFactory factory){
        this.boton = factory.crearBoton();
        this.checkbox = factory.crearCheckbox();
    }

    public void renderUI(){
        boton.renderizar();
        checkbox.renderizar();
    }

}
