package org.example.creational.builder;

import com.google.gson.Gson;

public class Usuario {

    private final String nombre;
    private final String correo;
    private final Integer numero;
    private final String pais;
    private final String ciudad;
    private final String genero;
    private final Integer edad;

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public Usuario(UsuarioBuilder builder){
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.numero = builder.numero;
        this.pais = builder.pais;
        this.ciudad = builder.ciudad;
        this.genero = builder.genero;
        this.edad = builder.edad;
    }

    public static class UsuarioBuilder{
        private String nombre;
        private String correo;
        private Integer numero;
        private String pais;
        private String ciudad;
        private String genero;
        private Integer edad;

        public UsuarioBuilder(String nombre, String correo) {
            this.nombre = nombre;
            this.correo = correo;
        }

        public UsuarioBuilder numero(Integer numero){
            this.numero = numero;
            return this;
        }

        public UsuarioBuilder pais(String pais){
            this.pais = pais;
            return this;
        }

        public UsuarioBuilder ciudad(String ciudad){
            this.ciudad = ciudad;
            return this;
        }

        public UsuarioBuilder genero(String genero){
            this.genero = genero;
            return this;
        }

        public UsuarioBuilder edad(Integer edad){
            this.edad = edad;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }


    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
