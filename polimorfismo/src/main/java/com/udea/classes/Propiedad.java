package com.udea.classes;

import com.udea.interfaces.IMetodos;

public abstract class Propiedad implements IMetodos {
  private String direccion;
  private double area;

  public Propiedad(String direccion, double area) {
    this.direccion = direccion;
    this.area = area;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

}
