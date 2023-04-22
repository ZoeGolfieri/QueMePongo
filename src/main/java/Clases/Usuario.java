package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Usuario {

  Atuendo atuendo;
  public void agregarPrendaAlAtuendo(Prenda prenda, Prenda prenda2, Prenda prenda3,Prenda prenda4, Set<Prenda> Conjunto){
    Atuendo MiAtuendo = new Atuendo(prenda, prenda2, prenda3, prenda4, Conjunto );
  }
  public void nuevaPrenda(TipoPrenda tipo, String material, String color, String colorSecundario)  {
    Prenda MiPrenda = new Prenda(tipo, material, color, colorSecundario);
  }
}

