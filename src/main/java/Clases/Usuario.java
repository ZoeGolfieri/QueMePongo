package Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  Atuendo atuendo;
  public void agregarPrendaAlAtuendo(Prenda prenda){
    this.atuendo.agregarPrenda(prenda);
  }
  public void nuevaPrenda(TipoPrenda tipo, String material, String color){
    Prenda MiPrenda = new Prenda(tipo, material, color);
  }

  public void agregarColorSecundario(Prenda prenda, String color){
    prenda.setColorSecundario(color);
  }
}
