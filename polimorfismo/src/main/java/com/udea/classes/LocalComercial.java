package com.udea.classes;

public class LocalComercial extends Propiedad {
  private boolean tieneEstacionamiento;

  public LocalComercial(String direccion, double area, boolean tieneEstacionamiento) {
    super(direccion, area);
    this.tieneEstacionamiento = tieneEstacionamiento;
  }

  public boolean tieneEstacionamiento() {
    return tieneEstacionamiento;
  }

  @Override
  public int calcularPrecioAlquiler() {
    return (int) (getArea() * 10 + (tieneEstacionamiento ? 100 : 0));
  }

  @Override
  public String mostrarDescripcion() {
    return "Local comercial en " + getDireccion() + " con área de " + getArea() + " m2 y "
        + (tieneEstacionamiento ? "tiene" : "no tiene") + " estacionamiento.";
  }
}
