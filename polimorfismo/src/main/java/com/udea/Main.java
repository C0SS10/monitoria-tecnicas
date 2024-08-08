package com.udea;

import com.udea.classes.Casa;
import com.udea.classes.Departamento;
import com.udea.classes.LocalComercial;
import com.udea.classes.Propiedad;

public class Main {
    public static void main(String[] args) {
        Propiedad[] propiedades = new Propiedad[3];
        propiedades[0] = new LocalComercial("Calle 1 # 2-3", 100, true);
        propiedades[1] = new Departamento("Calle 2 # 3-4", 200, 3, 2);
        propiedades[2] = new Casa("Calle 3 # 4-5", 300, 50);

        for (Propiedad propiedad : propiedades) {
            System.out.println(propiedad.mostrarDescripcion());
            System.out.println("Precio de alquiler: $" + propiedad.calcularPrecioAlquiler());
            System.out.println();
        }
    }
}