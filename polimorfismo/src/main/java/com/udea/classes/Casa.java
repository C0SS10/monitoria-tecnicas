package com.udea.classes;

public class Casa extends Propiedad {
  private double areaPiscina;

  public Casa(String direccion, double area, double areaPiscina) {
    super(direccion, area);
    this.areaPiscina = areaPiscina;
  }

  public double getAreaPiscina() {
    return areaPiscina;
  }

  public void setAreaPiscina(double areaPiscina) {
    this.areaPiscina = areaPiscina;
  }

  @Override
  public int calcularPrecioAlquiler() {
    return (int) (getArea() * 10 + areaPiscina * 20);
  }

  @Override
  public String mostrarDescripcion() {
    return "Casa en " + getDireccion() + " con área de " + getArea() + " m2 y piscina de " + areaPiscina + " m2.";
  }
}
