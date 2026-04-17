package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {

    private Map<String, Enemigo> prototipos = new HashMap<>();

    public void registrar(String nombre, Enemigo enemigo){
        prototipos.put(nombre, enemigo);
    }

    public Enemigo buscarYClonar(String nombre){
        return prototipos.get(nombre).clone();
    }

}
