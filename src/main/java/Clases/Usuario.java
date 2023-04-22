package Clases;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Usuario {

  Atuendo atuendo;
  public void agregarPrendaAlAtuendo(Prenda prenda, Prenda prenda2, Prenda prenda3,Prenda prenda4, Set<Prenda> Conjunto){
    Atuendo MiAtuendo = new Atuendo(prenda, prenda2, prenda3, prenda4, Conjunto );
  }
  public void nuevaPrenda(TipoPrenda tipo, String material, Color color, Color colorSecundario, Trama tramaTela)  {
    Borrador borrador = new Borrador();
    borrador.crearPrenda(tipo, material, color, colorSecundario, tramaTela);
  }

}

