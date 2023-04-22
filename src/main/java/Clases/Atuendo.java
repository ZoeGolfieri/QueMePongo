package Clases;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Atuendo {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;
  private Prenda abrigo;
  Set<Prenda> accesorios = new HashSet<>();

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado,Prenda abrigo, Set accesorios)  {
    Objects.requireNonNull(superior, "La prenda superior es obligatoria");
    Objects.requireNonNull(inferior, "La prenda inferior es obligatoria");
    Objects.requireNonNull(calzado, "El calzado superior es obligatoria");
    if(!superior.esSuperior()){ throw new IllegalArgumentException("No es una prenda superior");}
    if(!inferior.esInferior()){ throw new IllegalArgumentException("No es una prenda inferior");}
    if(!calzado.esCalzado()){ throw new IllegalArgumentException("No es un calzado");}
    if(!abrigo.esAbrigo()){ throw new IllegalArgumentException("No es un abrigo");}
  }
  public void agregarAccesorios(Prenda prenda){
    if(!prenda.esAccesorio()){
      throw new IllegalArgumentException("No es una un accesorio");
    }
    this.accesorios.add(prenda);
  }

}
