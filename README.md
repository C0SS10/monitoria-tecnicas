La compilación de las clases Java, suelen compilar antes de empaquetarlas en el archivo WAR. La compilación convierte el código fuente Java en archivos de clase Java bytecode (archivos .class) que pueden ser interpretados y ejecutados por la máquina virtual Java (JVM)

-------
private: El campo es accesible solo dentro de la clase en la que se declara.
static: El campo pertenece a la clase en sí, en lugar de a instancias específicas de la clase.
final: El valor del campo no puede cambiar una vez que ha sido asignado.
long: El tipo de datos del campo es long, que es un tipo de datos primitivo en Java que representa un valor numérico de 64 bits.

Serializar: para definir un identificador de versión de la clase para controlar la compatibilidad durante el proceso de serialización y deserialización de objetos

Supongamos que tienes la clase Usuario con serialVersionUID definido como 1L:

    private static final long serialVersionUID = 1L;

    private int cedula;
    private String nombre;
    private String ciudad;
    private String email;

sí que cambias serialVersionUID a 2L:

    private static final long serialVersionUID = 2L;

    private int cedula;
    private String nombre;
    private String ciudad;
    private String email;
    private String telefono; // Nuevo campo agregado
------------

¡LAS VERSIONES SON EL DIABLO PARCE! ❗

https://stackoverflow.com/questions/4928271 how-to-install-jstl-it-fails-with-the-absolute-uri-cannot-be-resolved-or-una

// Método para verificar la contraseña
public boolean verificarContraseña(String contraseña, String hashAlmacenado) {
    return BCrypt.checkpw(contraseña, hashAlmacenado);
}

JDBC proporciona un conjunto de clases e interfaces que permiten a los desarrolladores ejecutar consultas SQL, recuperar resultados y manipular datos en una base de datos desde un programa Java.