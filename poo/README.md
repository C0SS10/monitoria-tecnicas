# Programación Orientada a Objetos (POO) 🖥️

La **Programación Orientada a Objetos (POO)** es un paradigma de programación que organiza el código en torno a **objetos**. Un objeto es una representación de un "ente" del mundo real con atributos (características) y métodos (acciones). Es una excelente forma de organizar y estructurar el código para que sea más **mantenible, reutilizable** 🛠️

## 📦 Principios básicos de la POO

**Abstracción** 🏗️

- Una **clase** es como un plano o plantilla para crear objetos.
- Un **objeto** es una instancia de una clase.

## 🔐 Encapsulamiento

El **encapsulamiento** en Java se refiere a ocultar los detalles internos de una clase y controlar el acceso a sus atributos mediante métodos públicos (getters y setters). Esto permite proteger los datos sensibles de accesos no controlados.

### Como implementarlo❓

```java
class Carro {
    // Atributos privados
    private String marca;
    private String modelo;

    // Constructor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos públicos para acceder a los atributos privados (Getters)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Métodos públicos para modificar los atributos privados (Setters)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
```

En este ejemplo, los atributos marca y modelo están encapsulados (son privados) y solo se pueden acceder o modificar a través de los métodos **getMarca, setMarca**

## 👪 Herencia

La **herencia** en Java permite que una clase (clase hija) herede atributos y métodos de otra clase (clase padre). Esto permite reutilizar el código y extender las funcionalidades de las clases base.

```java
public class Factura {
    protected double montoBase;

    public abstract void mostrarDetalles();
}

class FacturaRestaurante extends Factura {
    private String nombreEncargado;

    public Deportivo(double montoBase, String nombreEncargado) {
        super(montoBase);  // Llama al constructor de la clase padre usando super()
        this.nombreEncargado = nombreEncargado;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("El encargado de la mesa fue: " + nombreEncargado );
    }
}
```

En este ejemplo, la clase `FacturaRestaurante` hereda de la clase `Factura` utilizando la palabra clave **extends**. Además, se sobrescribe el método mostrarDetalles para agregar información adicional (el nombre del mesero que atendió la mesa)

## Polimorfismo 🫘

El polimorfismo es un **principio** fundamental de la programación orientada a objetos que permite a los objetos de diferentes clases ser tratados de manera uniforme a través de una interfaz común. En otras palabras, el mismo método puede comportarse de manera diferente en distintos objetos.

### Cuando implementar Polimorfismo ❓

- Cuando diferentes clases derivadas comparten una interfaz común pero tienen implementaciones específicas para ciertos métodos.
- Para mejorar la flexibilidad y extensibilidad del código, permitiendo que nuevas clases se integren fácilmente. Por ejemplo:

```java
interface MetodoPago {
    void procesarPago(double monto);
}

class TarjetaCredito implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: " + monto);
    }
}

class PSE implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PSE: " + monto);
    }
}

```

### No siempre es la Solución ❌

- Cuando las clases no comparten una relación "es un" (is-a relationship). Por ejemplo, tenemos clases de **Vehiculo y Casa**, no tiene sentido implementar polimorfismo porque **Vehiculo no es una Casa**.
- En sistemas muy simples donde las diferencias entre las clases no justifican el uso de herencia y polimorfismo. Por ejemplo, Dónde solo hay 2 tipos de objetos **`Círculo`** y **`Cuadrado`**, y solo necesitamos calcular el área.

```java
class Circulo {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Cuadrado {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }
}
```

### Patrones interesantes para usar Polimorfismo 🤓

- [**`Patrón Estrategia`**](https://refactoring.guru/es/design-patterns/strategy): Permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables.
- [**`Patrón Estado`**](https://refactoring.guru/es/design-patterns/state): Permite a un objeto cambiar su comportamiento cuando cambia su estado interno.
- [**`Patrón Decorador`**](https://refactoring.guru/es/design-patterns/decorator): Permite añadir comportamiento a objetos de manera dinámica.

> [!IMPORTANT]
> Si quiero profundizar más en este tema de patrones de diseño [**te recomiendo esta página**](https://refactoring.guru/es/design-patterns)

### Descripción | Ejercicio #1 📄

Una empresa necesita desarrollar un sistema para procesar facturas y realizar pagos utilizando diferentes métodos. El sistema debe permitir que las facturas se calculen de manera flexible y que los pagos se realicen a través de distintos métodos como tarjeta de débito, tarjeta de crédito, PayPal, entre otros medios de pago.

### Requerimientos 📝

- **Factura**: Las facturas pueden tener diferentes tipos, como facturas con impuestos o facturas con descuento. Todas deben poder calcular su monto total.
- **Métodos de pago**: El sistema debe soportar varios métodos de pago. Cada uno debe tener su propia implementación para realizar pagos.
- **Polimorfismo**: El sistema debe ser lo suficientemente flexible para manejar los diferentes tipos de pago, utilizando polimorfismo para seleccionar el método de pago adecuado según el contexto.
- **Extensibilidad**: Debe ser fácil agregar nuevos tipos de facturas o métodos de pago sin modificar la lógica existente.

---

### Descripción | Ejercicio #2 📄

Una empresa de bienes raíces necesita un sistema de gestión para sus propiedades. Cada propiedad puede ser de diferentes tipos: departamentos, casas y locales comerciales. Cada tipo de propiedad tiene características específicas, pero todas deben poder calcular su precio de alquiler mensual y mostrar una descripción detallada.

### Requerimientos 📝

- Crear una clase base llamada Propiedad con los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()`.
- Crear clases derivadas **Departamento**, **Casa** y **LocalComercial** que hereden de Propiedad.
- Cada clase derivada debe sobrescribir los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()` para proporcionar una implementación específica.
- Implementar una función que recorra la lista y muestre la descripción y el precio de alquiler de cada propiedad usando el **polimorfismo**.
