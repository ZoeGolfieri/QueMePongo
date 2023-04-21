package Clases;

public class Prenda {
  private String nombrePrenda;
  private TipoPrenda tipo;
  private String material;
  private String color;
  private String colorSecundario;

  public Prenda(TipoPrenda tipo, String material, String color) {
    this.setTipo(tipo);
    this.setMaterial(material);
    this.setColor(color);
  }
  //getters
  public String getNombrePrenda(){return nombrePrenda;}
  public TipoPrenda getTipo() {return tipo;}
  public String getMaterial() {return material;}
  public String getColor() {return color;}
  public String getColorSecundario() {return colorSecundario;}

  //setters
  public void setNombrePrenda(String nombrePrenda) {this.nombrePrenda = nombrePrenda;}
  public void setTipo(TipoPrenda tipo) {this.tipo = tipo;}
  public void setMaterial(String material) {this.material = material;}
  public void setColor(String color) {this.color = color;}
  public void setColorSecundario(String colorSecundario) {this.colorSecundario = colorSecundario;}
}
