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

- Factura: Las facturas pueden tener diferentes tipos, como facturas con impuestos o facturas con descuento. Todas deben poder calcular su monto total.
- Métodos de pago: El sistema debe soportar varios métodos de pago. Cada uno debe tener su propia implementación para realizar pagos.
- Polimorfismo: El sistema debe ser lo suficientemente flexible para manejar los diferentes tipos de pago, utilizando polimorfismo para seleccionar el método de pago adecuado según el contexto.
- Extensibilidad: Debe ser fácil agregar nuevos tipos de facturas o métodos de pago sin modificar la lógica existente.

---

### Descripción | Ejercicio #2 📄

Una frutería desea implementar un sistema de gestión para sus productos. Cada producto puede ser de diferentes tipos: frutas, verduras y legumbres. Cada tipo de producto tiene características específicas, pero todos deben poder calcular su tiempo de maduración y enviar una caja del producto.

### Requerimientos 📝

- Crear una clase base llamada Producto con los métodos `calcularTiempoMaduracion()` y `enviarProducto()`.
- Crear clases derivadas Fruta, Verdura que hereden de Producto.
- Cada clase derivada debe sobrescribir los métodos `calcularTiempoMaduracion()` y `enviarProducto()`.
- Crear una lista de productos que contenga instancias de diferentes tipos (Fruta, Verdura).
