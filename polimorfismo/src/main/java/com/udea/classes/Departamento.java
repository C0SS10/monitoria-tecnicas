package com.udea.classes;

public class Departamento extends Propiedad {
  private int numeroHabitaciones;
  private int numeroBanios;

  public Departamento(String direccion, double area, int numeroHabitaciones, int numeroBanios) {
    super(direccion, area);
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanios = numeroBanios;
  }

  public int getNumeroHabitaciones() {
    return numeroHabitaciones;
  }

  public void setNumeroHabitaciones(int numeroHabitaciones) {
    this.numeroHabitaciones = numeroHabitaciones;
  }

  public int getNumeroBanios() {
    return numeroBanios;
  }

  public void setNumeroBanios(int numeroBanios) {
    this.numeroBanios = numeroBanios;
  }

  @Override
  public int calcularPrecioAlquiler() {
    return (int) (getArea() * 10 + numeroHabitaciones * 50 + numeroBanios * 30);
  }

  @Override
  public String mostrarDescripcion() {
    return "Departamento en " + getDireccion() + " con área de " + getArea() + " m2, " + numeroHabitaciones
        + " habitaciones y " + numeroBanios + " baños.";
  }

}
