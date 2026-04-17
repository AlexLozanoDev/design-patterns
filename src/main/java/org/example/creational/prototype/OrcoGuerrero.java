package org.example.creational.prototype;

public class OrcoGuerrero implements Enemigo{

    private Integer vida;
    private String textura;
    private int x, y;

    public OrcoGuerrero(String textura, int vida) {
        this.textura = textura;
        this.vida = vida;
        System.out.println("--- Cargando textura pesada desde disco: " + textura + " ---");
    }

    // Constructor de copia (usado para el clonado)
    public OrcoGuerrero(OrcoGuerrero target) {
        if (target != null) {
            this.textura = target.textura;
            this.vida = target.vida;
        }
    }

    @Override
    public Enemigo clone() {
        return new OrcoGuerrero(this);
    }

    @Override
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Orco en [" + x + "," + y + "] con vida: " + vida);
    }
}
