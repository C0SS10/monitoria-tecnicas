package com.udea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {
  private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public int leerEntero(String mensaje) throws IOException {
    System.out.println(mensaje);
    String input = reader.readLine();
    return Integer.parseInt(input);
  }
}
