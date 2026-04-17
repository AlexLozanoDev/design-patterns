# Factory Method

El patrón **Factory Method** es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán.

## Caso de uso

Este patrón se utiliza cuando se requiere crear clases y no se sabe con exactitud que clase se creará, o, se usa en tiempo de ejecución cuando se requiere inicializar una clase con configuraciones en producción

## Diagrama UML (Mermaid)

Este diagrama muestra cómo la clase creadora delega la instanciación a sus subclases:

```mermaid
classDiagram
    %% Definición de la jerarquía de Productos
    class Transporte {
        <<interface>>
        +entrega()
    }
    class Camion {
        +entrega()
    }
    class Barco {
        +entrega()
    }

    %% Definición de la jerarquía de Creadores
    class Logistica {
        <<abstract>>
        +planificarEntrega()
        +crearTransporte()* Transporte
    }
    class LogisticaTerrestre {
        +crearTransporte() Transporte
    }
    class LogisticaMaritima {
        +crearTransporte() Transporte
    }

    %% Relaciones
    Transporte <|.. Camion
    Transporte <|.. Barco
    Logistica <|-- LogisticaTerrestre
    Logistica <|-- LogisticaMaritima
    
    LogisticaTerrestre ..> Camion : "instancia"
    LogisticaMaritima ..> Barco : "instancia"