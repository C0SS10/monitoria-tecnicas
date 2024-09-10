package com.udea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    Lectura lectura = new Lectura();
    CalculadoraBits calculadora = new CalculadoraBits();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean continuar = true;

    try {
      while (continuar) {
        // Menú de opciones
        System.out.println("\n=== MENÚ DE OPERACIONES ===");
        System.out.println("1. AND");
        System.out.println("2. OR");
        System.out.println("3. XOR");
        System.out.println("4. NOT");
        System.out.println("5. LEFT SHIFT");
        System.out.println("6. RIGHT SHIFT");
        System.out.println("7. UNSIGNED RIGHT SHIFT");
        System.out.println("8. Salir");
        System.out.print("Elija una operación: ");
        String opcion = br.readLine();

        int a, b, posiciones;

        switch (opcion) {
          case "1": // AND
            a = lectura.leerEntero("Ingrese el primer número:");
            b = lectura.leerEntero("Ingrese el segundo número:");
            System.out.println("Resultado AND: " + calculadora.and(a, b));
            break;

          case "2": // OR
            a = lectura.leerEntero("Ingrese el primer número:");
            b = lectura.leerEntero("Ingrese el segundo número:");
            System.out.println("Resultado OR: " + calculadora.or(a, b));
            break;

          case "3": // XOR
            a = lectura.leerEntero("Ingrese el primer número:");
            b = lectura.leerEntero("Ingrese el segundo número:");
            System.out.println("Resultado XOR: " + calculadora.xor(a, b));
            break;

          case "4": // NOT
            a = lectura.leerEntero("Ingrese el número:");
            System.out.println("Resultado NOT: " + calculadora.not(a));
            break;

          case "5": // LEFT SHIFT
            a = lectura.leerEntero("Ingrese el número:");
            posiciones = lectura.leerEntero("Ingrese el número de posiciones para desplazar:");
            System.out.println("Resultado LEFT SHIFT: " + calculadora.leftShift(a, posiciones));
            break;

          case "6": // RIGHT SHIFT
            a = lectura.leerEntero("Ingrese el número:");
            posiciones = lectura.leerEntero("Ingrese el número de posiciones para desplazar:");
            System.out.println("Resultado RIGHT SHIFT: " + calculadora.rightShift(a, posiciones));
            break;

          case "7": // UNSIGNED RIGHT SHIFT
            a = lectura.leerEntero("Ingrese el número:");
            posiciones = lectura.leerEntero("Ingrese el número de posiciones para desplazar:");
            System.out.println(
                "Resultado UNSIGNED RIGHT SHIFT: " + calculadora.unsignedRightShift(a, posiciones));
            break;

          case "8": // Salir
            continuar = false;
            System.out.println("Saliendo...");
            break;

          default:
            System.out.println("Opción no válida, intente de nuevo.");
            break;
        }
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}