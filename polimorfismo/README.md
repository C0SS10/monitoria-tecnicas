### Descripción | Ejercicio #1 📄

Una empresa de bienes raíces necesita un sistema de gestión para sus propiedades. Cada propiedad puede ser de diferentes tipos: departamentos, casas y locales comerciales. Cada tipo de propiedad tiene características específicas, pero todas deben poder calcular su precio de alquiler mensual y mostrar una descripción detallada.

### Requerimientos 📝

- Crear una clase base llamada Propiedad con los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()`.
- Crear clases derivadas **Departamento**, **Casa** y **LocalComercial** que hereden de Propiedad.
- Cada clase derivada debe sobrescribir los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()` para proporcionar una implementación específica.
- Implementar una función que recorra la lista y muestre la descripción y el precio de alquiler de cada propiedad usando el **polimorfismo**.

---

### Descripción | Ejercicio #2 📄
Una frutería desea implementar un sistema de gestión para sus productos. Cada producto puede ser de diferentes tipos: frutas, verduras y legumbres. Cada tipo de producto tiene características específicas, pero todos deben poder calcular su tiempo de maduración y mostrar una descripción detallada.

### Requerimientos 📝
- Crear una clase base llamada Producto con los métodos `calcularTiempoMaduracion()` y `enviarProducto()`.
- Crear clases derivadas Fruta, Verdura que hereden de Producto.
- Cada clase derivada debe sobrescribir los métodos `calcularTiempoMaduracion()` y `enviarProducto()`.
- Crear una lista de productos que contenga instancias de diferentes tipos (Fruta, Verdura).
