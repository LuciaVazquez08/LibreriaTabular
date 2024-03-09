package com;

public abstract class Celda implements Comparable<Celda>, Cloneable {
  /**
   * Clase abstracta para la Celda
   **/
  public abstract Object getContenido();

  public abstract void setContenido(Object objeto);

  public abstract void removeContenido();

  public abstract boolean isNA();

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
