package com.udea;

class CalculadoraBits {

  private String mostrarBits(int numero) {
    // Convierte el número a una cadena de 32 bits
    // Reemplaza los espacios en blanco con ceros
    return String.format("%32s", Integer.toBinaryString(numero)).replace(' ', '0');
  }

  public int and(int a, int b) {
    System.out.println("Operación: AND (" + a + " & " + b + ")");
    System.out.println(
        "Explicación: Compara cada bit de los números. Si ambos bits son 1, el resultado es 1, de lo contrario es 0.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    System.out.println("Bits de " + b + ": " + mostrarBits(b));
    int resultado = a & b;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int or(int a, int b) {
    System.out.println("Operación: OR (" + a + " | " + b + ")");
    System.out.println(
        "Explicación: Compara cada bit de los números. Si al menos uno de los bits es 1, el resultado es 1, de lo contrario es 0.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    System.out.println("Bits de " + b + ": " + mostrarBits(b));
    int resultado = a | b;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int xor(int a, int b) {
    System.out.println("Operación: XOR (" + a + " ^ " + b + ")");
    System.out.println(
        "Explicación: Compara cada bit de los números. El resultado es 1 si los bits son diferentes, de lo contrario es 0.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    System.out.println("Bits de " + b + ": " + mostrarBits(b));
    int resultado = a ^ b;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int not(int a) {
    System.out.println("Operación: NOT (~" + a + ")");
    System.out.println(
        "Explicación: Invierte todos los bits del número. Los bits que son 1 se convierten en 0 y los que son 0 se convierten en 1.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    int resultado = ~a;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int leftShift(int a, int posiciones) {
    System.out.println("Operación: LEFT SHIFT (" + a + " << " + posiciones + ")");
    System.out.println("Explicación: Desplaza los bits de " + a + " hacia la izquierda " + posiciones
        + " posiciones. Cada desplazamiento multiplica el número por 2.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    int resultado = a << posiciones;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int rightShift(int a, int posiciones) {
    System.out.println("Operación: RIGHT SHIFT (" + a + " >> " + posiciones + ")");
    System.out.println("Explicación: Desplaza los bits de " + a + " hacia la derecha " + posiciones
        + " posiciones. Cada desplazamiento divide el número por 2. Los bits vacíos se llenan con el bit de signo.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    int resultado = a >> posiciones;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }

  public int unsignedRightShift(int a, int posiciones) {
    System.out.println("Operación: UNSIGNED RIGHT SHIFT (" + a + " >>> " + posiciones + ")");
    System.out.println("Explicación: Desplaza los bits de " + a + " hacia la derecha " + posiciones
        + " posiciones sin tener en cuenta el signo. Los bits vacíos se llenan con ceros.");
    System.out.println("Bits de " + a + ": " + mostrarBits(a));
    int resultado = a >>> posiciones;
    System.out.println("Resultado en bits: " + mostrarBits(resultado));
    return resultado;
  }
}
