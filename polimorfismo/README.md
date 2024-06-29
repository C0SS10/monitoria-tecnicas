### Descripción 📄

Una empresa de bienes raíces necesita un sistema de gestión para sus propiedades. Cada propiedad puede ser de diferentes tipos: departamentos, casas y locales comerciales. Cada tipo de propiedad tiene características específicas, pero todas deben poder calcular su precio de alquiler mensual y mostrar una descripción detallada.

### Requerimientos 📝

- Crear una clase base llamada Propiedad con los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()`.
- Crear clases derivadas **Departamento**, **Casa** y **LocalComercial** que hereden de Propiedad.
- Cada clase derivada debe sobrescribir los métodos `calcularPrecioAlquiler()` y `mostrarDescripcion()` para proporcionar una implementación específica.
- Implementar una función que recorra la lista y muestre la descripción y el precio de alquiler de cada propiedad usando el **polimorfismo**.
