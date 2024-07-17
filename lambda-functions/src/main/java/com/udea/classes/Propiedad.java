package com.udea.classes;

public class Propiedad {
  private String color;
  private String barrio;
  private int precioAlquiler;

  public Propiedad(String color, String barrio, int precioAlquiler) {
    this.color = color;
    this.barrio = barrio;
    this.precioAlquiler = precioAlquiler;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBarrio() {
    return barrio;
  }

  public void setBarrio(String barrio) {
    this.barrio = barrio;
  }

  public int getPrecioAlquiler() {
    return precioAlquiler;
  }

  public void setPrecioAlquiler(int precioAlquiler) {
    this.precioAlquiler = precioAlquiler;
  }

  @Override
  public String toString() {
    return "Propiedad{" + "color:'" + color + '\'' + ", barrio:'" + barrio + '\'' + ", precioAlquiler:" + precioAlquiler
        + '}';
  }
}
