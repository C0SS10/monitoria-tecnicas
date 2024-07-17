package com.udea.interfaces;

import com.udea.classes.Propiedad;

@FunctionalInterface
public interface IFiltroPropiedad {
  boolean filtrar(Propiedad p);
}