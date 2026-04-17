package org.example.creational.prototype;

/**
 * INTERFAZ PROTOTYPE
 */

public interface Enemigo extends Cloneable{

    Enemigo clone();

    void setPosicion(int x, int y);
    void mostrarInfo();

}
