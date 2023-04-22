package Clases;

import java.awt.*;
import java.util.Objects;

public class Borrador {
  private TipoPrenda tipo;
  private String material;
  private Color color;
  private Color colorSecundario;
  private Trama tramaTela;

  public void especificarTipoPrenda(TipoPrenda tipo){
    Objects.requireNonNull(tipo, "El tipo es obligatorio");
    this.tipo = tipo;
  }
  public void especificarMaterial(String material){
    Objects.requireNonNull(material,"El material es obligatorio");
    this.material = material;
  }
  public void especificarColor(Color color){
    Objects.requireNonNull(color, "El color es obligatorio");
    this.color = color;
  }

  public void crearPrenda(TipoPrenda tipo, String material, Color color, Color colorSecundario, Trama tramaTela){
    especificarTipoPrenda(tipo);
    especificarMaterial(material);
    especificarColor(color);
    if(tramaTela == null){this.tramaTela = Trama.LISA;}
    Prenda prenda = new Prenda(tipo, material, color, colorSecundario, tramaTela);
  }

}
