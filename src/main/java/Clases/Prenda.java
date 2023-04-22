package Clases;

import java.awt.*;
import java.util.Objects;

public class Prenda {
  private String nombrePrenda;
  private TipoPrenda tipo;
  private String material;
  private Color color;//cambiarlo a clase
  private Color colorSecundario;//cambiarlo a clase

  public Prenda(TipoPrenda tipo, String material, String color, String colorSecundario)  {
    Objects.requireNonNull(tipo, "El tipo es obligatorio");
    //if(tipo == null){ throw new IllegalArgumentException("El tipo es obligatorio");}
    if(material == null){ throw new IllegalArgumentException("El material es obligatorio");}
    if(color == null){ throw new IllegalArgumentException("El color es obligatorio");}
    this.setTipo(tipo);
    this.setMaterial(material);
    this.setColor(Color.decode(color));
    this.setColorSecundario(Color.decode(colorSecundario));
  }
  //getters
  public String getNombrePrenda(){return nombrePrenda;}
  public TipoPrenda getTipo() {return tipo;}
  public String getMaterial() {return material;}
  public Color getColor() {return color;}
  public Color getColorSecundario() {return colorSecundario;}

  //setters
  public void setNombrePrenda(String nombrePrenda) {this.nombrePrenda = nombrePrenda;}
  public void setTipo(TipoPrenda tipo) {this.tipo = tipo;}
  public void setMaterial(String material) {this.material = material;}
  public void setColor(Color color) {this.color = color;}
  public void setColorSecundario(Color colorSecundario) {this.colorSecundario = colorSecundario;}

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
