## Funciones Lambda en Java 📖

Este proyecto muestra un ejemplo simple de cómo usar funciones lambda en Java para filtrar propiedades en una inmobiliaria, además de puntos claves para entender como funcionan estas expresiones.

### Descripción 📃

#### **¿Qué es una función lambda?** ☝️🤓

Una función lambda es una manera concisa de representar una función anónima (una función sin nombre). Las lambdas permiten pasar comportamientos como parámetros a métodos de una forma compacta y legible. Por ejemplo, en lugar de escribir una clase que implemente una interfaz con un solo método, puedes usar una lambda para lograr lo mismo en una línea.

#### **¿Por qué utilizamos interfaces con una sola función?** 📗

- En Java, una interfaz es una referencia que se utiliza para especificar un comportamiento que las clases **deben implementar**. Una interfaz puede tener métodos abstractos (sin cuerpo) **que las clases deben definir**.
- Utilizamos interfaces funcionales para representar funciones lambda. **Una interfaz funcional** es una interfaz que contiene un único método abstracto. Se denotan utilizando `@FunctionalInterface` al principio del nombre de la interfaz

**Ejemplo de interfaz funcional:**

```java
// Ejemplo: Una interfaz funcional
@FunctionalInterface
public interface IFiltroPropiedad {
  boolean filtrar(Propiedad p);
}
```

#### **¿Qué es el método toString() y @Override?** 📗

- **`toString`**: Este método se usa para obtener una representación en cadena de un objeto. Es útil para imprimir información sobre el objeto de una manera legible.
- **`@Override`**: Esta anotación indica que el método está sobrescribiendo un método de una superclase. En este caso, toString sobrescribe el método toString de la clase Object.

#### **El proyecto incluye** 📦

- Una clase `Propiedad` que representa una propiedad inmobiliaria.
- Una interfaz funcional `FiltroPropiedad` para filtrar propiedades según criterios específicos.

### Sintaxis de una función lambda ✏️

```java
(parametros) -> {expresión}
```

**Un ejemplo de una función lambda es el siguiente:**

```java
// Ejemplo: Expresión lambda para comprobar si una propiedad es de color Blanca
FiltroPropiedad esBlanca = (p) -> {p.getColor().equals("Blanca")};

// Mostrar y utilizar la lambda creada
System.out.println("Propiedades con color Blanca: \n");
propiedades.stream().filter(p -> esBlanca.test(p)).forEach(p -> System.out.println(p));
```

#### **Métodos utilizados**

- `getTipo()`: Método en la clase Propiedad que devuelve el tipo de la propiedad (por ejemplo, "Apartamento" o "Casa").
- `equals()`: Método de la clase String que compara dos cadenas y devuelve true si son iguales.
- `stream()`: Método de la clase List que convierte la lista en un flujo de datos, permitiendo operaciones de alto nivel como filter y forEach.
- `filter()`: Método del Stream que toma un predicado (una función que devuelve boolean) y devuelve un nuevo stream con los elementos que cumplen el predicado.
- `forEach()`: Método del Stream que aplica una acción a cada elemento del stream.

### Ventajas de usar funciones lambda 👌

- **`Concisión`**: Reducción de código boilerplate.
- **`Legibilidad`**: Expresan claramente la intención del código.
- **`Facilidad de uso`**: Se integran bien con las interfaces funcionales.

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

### Tarea para los Estudiantes 📝

> [!IMPORTANT]
> Implementar un nuevo filtro para propiedades que su precio de alquiler sea mayor a 600000 y mostrar los resultados.
