package com.udea;

import java.util.ArrayList;
import java.util.List;

import com.udea.classes.Propiedad;
import com.udea.interfaces.IFiltroPropiedad;

public class Main {
    public static void main(String[] args) {
        // Se crea una lista para guardar las propiedades
        List<Propiedad> propiedades = new ArrayList<>();

        // Se agregan propiedades a la lista
        propiedades.add(new Propiedad("Blanca", "Niquia", 600000));
        propiedades.add(new Propiedad("Blanca", "Copacabana", 400000));
        propiedades.add(new Propiedad("Roja", "Girardota", 800000));
        propiedades.add(new Propiedad("Amarilla", "Copacabana", 1000000));
        propiedades.add(new Propiedad("Azul", "Niquia", 600000));

        // Creamos una lambda para implementar la interfaz FiltroPropiedad para color
        // Blanca
        IFiltroPropiedad esBlanca = (p) -> p.getColor().equals("Blanca");

        // Mostrar y utilizar la lambda creada
        System.out.println("Propiedades con color Blanca: \n");
        propiedades.stream().filter(p -> esBlanca.filtrar(p)).forEach(p -> System.out.println(p));

    }
}