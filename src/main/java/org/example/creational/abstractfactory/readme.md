# Abstract Factory

Permite producir familias de objetos relacionados sin especificar sus clases concretas. Failmente de entender; es como una "fábrica de fábricas".

Proporciona una interfaz para crear una serie de objetos que están relacionados entre sí (por ejemplo, componentes de una interfaz gráfica que deben coincidir en estilo), asegurando que los productos que obtengas sean compatibles.

### Caso de uso

Se utiliza cuando se necesita que tu sistema sea independiente de como se crean los productos, pero esos productos deben ser consistentes entre sí.


### Diagrama UML

```mermaid
classDiagram
%% Interfaz de la Fábrica Abstracta
    class GUIFactory {
        <<interface>>
        +crearBoton() Boton
        +crearCheckbox() Checkbox
    }

%% Fábricas Concretas (Familias)
    class DarkModeFactory {
        +crearBoton() Boton
        +crearCheckbox() Checkbox
    }
    class LightModeFactory {
        +crearBoton() Boton
        +crearCheckbox() Checkbox
    }

%% Interfaces de Productos
    class Boton {
        <<interface>>
        +renderizar()
    }
    class Checkbox {
        <<interface>>
        +marcar()
    }

%% Productos Concretos: Familia Oscura
    class BotonOscuro {
        +renderizar()
    }
    class CheckboxOscuro {
        +marcar()
    }

%% Productos Concretos: Familia Clara
    class BotonClaro {
        +renderizar()
    }
    class CheckboxClaro {
        +marcar()
    }

%% Relaciones
    GUIFactory <|.. DarkModeFactory : "Implementa"
    GUIFactory <|.. LightModeFactory : "Implementa"

    Boton <|.. BotonOscuro : "Implementa"
    Boton <|.. BotonClaro : "Implementa"

    Checkbox <|.. CheckboxOscuro : "Implementa"
    Checkbox <|.. CheckboxClaro : "Implementa"

    DarkModeFactory ..> BotonOscuro : "crea"
    DarkModeFactory ..> CheckboxOscuro : "crea"

    LightModeFactory ..> BotonClaro : "crea"
    LightModeFactory ..> CheckboxClaro : "crea"
```
