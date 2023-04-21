package Clases;

import static Clases.Categoria.*;

public class TipoPrenda {
  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
  }

  public Categoria getCategoria() {return categoria;}
  public void setCategoria(Categoria categoria) {this.categoria = categoria;}


  TipoPrenda ZAPATO = new TipoPrenda(CALZADO);
  TipoPrenda CAMISA = new TipoPrenda(SUPERIOR);
  TipoPrenda REMERA = new TipoPrenda(SUPERIOR);
  TipoPrenda BUZO = new TipoPrenda(ABRIGO);
  TipoPrenda CAMPERA = new TipoPrenda(ABRIGO);
  TipoPrenda PANTALON = new TipoPrenda(INFERIOR);
  TipoPrenda SHORT = new TipoPrenda(INFERIOR);
  TipoPrenda POLLERA = new TipoPrenda(INFERIOR);

  TipoPrenda ANTEOJO = new TipoPrenda(ACCESORIO);
  TipoPrenda GORRO = new TipoPrenda(ACCESORIO);

}