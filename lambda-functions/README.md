## Funciones Lambda en Java 📖

Este proyecto muestra un ejemplo simple de cómo usar funciones lambda en Java para filtrar propiedades en una inmobiliaria, además de puntos claves para entender como funcionan estas expresiones.

### Descripción 📃

#### **¿Qué es una función lambda?** ☝️🤓

Una función lambda es una manera concisa de representar una función anónima (una función sin nombre). Las lambdas permiten pasar comportamientos como parámetros a métodos de una forma compacta y legible.

**El proyecto incluye** 📦

- Una clase Propiedad que representa una propiedad inmobiliaria.
- Una interfaz funcional FiltroPropiedad para filtrar propiedades según criterios específicos.
- Funciones Lambda en Java

### Sintaxis de una función lambda ✏️

```java
(parameters) -> expression
```

### Ventajas de usar funciones lambda 👌

- Concisión: Reducción de código boilerplate.
- Legibilidad: Expresan claramente la intención del código.
- Facilidad de uso: Se integran bien con las interfaces funcionales.

**Boilerplate:** se refiere a las secciones de código que se repiten en múltiples lugares con poca o ninguna modificación

```java
// Código boilerplate para filtrar una lista antes de las lambdas
List<Propiedad> apartamentos = new ArrayList<>();
for (Propiedad propiedad : propiedades) {
    if (propiedad.getTipo().equals("Apartamento")) {
        apartamentos.add(propiedad);
    }
}
```
