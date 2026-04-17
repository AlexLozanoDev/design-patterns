# Factory Method

El patrón **Factory Method** es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán.

### Caso de uso

Este patrón se utiliza cuando se requiere crear clases y no se sabe con exactitud que clase se creará, o, se usa en tiempo de ejecución cuando se requiere inicializar una clase con configuraciones en producción

### Diagrama UML

Este diagrama muestra cómo la clase creadora delega la instanciación a sus subclases:

```mermaid
classDiagram
    direction BT
    %% Definición de la interfaz del Producto
    class MetodoPago {
        <<interface>>
        +procesar(monto: float)
    }

    %% Productos Concretos
    class PayPal {
        +procesar(monto: float)
    }
    class GooglePay {
        +procesar(monto: float)
    }
    class TarjetaCredito {
        +procesar(monto: float)
    }

    %% Jerarquía de Creadores
    class ProcesadorPagos {
        <<abstract>>
        +ejecutarOperacion(monto: float)
        +crearMetodo()* MetodoPago
    }

    class ProcesadorPayPal {
        +crearMetodo() MetodoPago
    }
    class ProcesadorGooglePay {
        +crearMetodo() MetodoPago
    }
    class ProcesadorTarjeta {
        +crearMetodo() MetodoPago
    }

    %% Relaciones de Implementación y Herencia
    MetodoPago <|.. PayPal : "implementa"
    MetodoPago <|.. GooglePay : "implementa"
    MetodoPago <|.. TarjetaCredito : "implementa"

    ProcesadorPagos <|-- ProcesadorPayPal : "hereda"
    ProcesadorPagos <|-- ProcesadorGooglePay : "hereda"
    ProcesadorPagos <|-- ProcesadorTarjeta : "hereda"

    %% Relaciones de Creación (Dependencia)
    ProcesadorPayPal ..> PayPal : "instancia"
    ProcesadorGooglePay ..> GooglePay : "instancia"
    ProcesadorTarjeta ..> TarjetaCredito : "instancia"