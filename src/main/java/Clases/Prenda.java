package Clases;

import java.awt.*;
import java.util.Objects;
import java.util.Optional;

public class Prenda {
  private String nombrePrenda;
  private TipoPrenda tipo;
  private String material;
  private Color color;
  private Color colorSecundario;
  private Trama tramaTela;

  public Prenda(TipoPrenda tipo, String material, Color color, Color colorSecundario, Trama tramaTela)  {
    this.setTipo(tipo);
    this.setMaterial(material);
    this.setColor(color);
    this.setColorSecundario(colorSecundario);
    this.setTramaTela(tramaTela);
  }

  //getters
  public TipoPrenda getTipo() {return tipo;}

  //setters
  public void setTipo(TipoPrenda tipo) {this.tipo = tipo;}
  public void setMaterial(String material) {this.material = material;}
  public void setColor(Color color) {this.color = color;}
  public void setColorSecundario(Color colorSecundario) {this.colorSecundario = colorSecundario;}
  public void setTramaTela(Trama tramaTela) {this.tramaTela = tramaTela;}

  //Funciones necesarias
  public boolean esSuperior(){
    return getTipo().getCategoria() == Categoria.SUPERIOR;
  }
  public boolean esInferior(){
    return getTipo().getCategoria() == Categoria.INFERIOR;
  }
  public boolean esCalzado(){
    return getTipo().getCategoria() == Categoria.CALZADO;
  }
  public boolean esAbrigo(){
    return getTipo().getCategoria() == Categoria.ABRIGO;
  }
  public boolean esAccesorio(){
    return getTipo().getCategoria() == Categoria.ACCESORIO;
  }
}
