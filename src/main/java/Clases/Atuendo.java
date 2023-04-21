package Clases;
import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> lista = new ArrayList<>();

  public void agregarPrenda(Prenda prenda){
    this.lista.add(prenda);
  }

  private Prenda categoria;

}
