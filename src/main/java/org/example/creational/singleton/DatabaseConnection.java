package org.example.creational.singleton;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private String url;

    private DatabaseConnection() {
        this.url = "jdbc:postgresql://localhost:5432/mi_repo_patrones";
        System.out.println("--- Conectando a la base de datos por ÚNICA vez ---");
    }

    // Método estático global para obtener la instancia
    public static DatabaseConnection getInstance() {
        // Primer chequeo (sin bloqueo para rendimiento)
        if (instance == null) {
            // Bloqueo para evitar que dos hilos creen dos instancias
            synchronized (DatabaseConnection.class) {
                // Segundo chequeo dentro del bloque sincronizado
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Ejecutando en " + url + ": " + sql);
    }

}
