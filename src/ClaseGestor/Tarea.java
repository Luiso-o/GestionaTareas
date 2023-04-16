package ClaseGestor;

import java.time.LocalDate;

public class Tarea {
	//atributos
  private String nombre;
  private String descripcion;
  private int prioridad;
  private boolean completada;
  private LocalDate fechaLimite;
  
  //constructor
  public Tarea(String nombre, String descripcion, int prioridad, LocalDate fechaLimite) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.prioridad = prioridad;
    this.fechaLimite = fechaLimite;
    this.completada = false;
  }
  
  //Metodos
  public String getNombre() {
    return nombre;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public int getPrioridad() {
    return prioridad;
  }
  
  public boolean getCompletada() {
    return completada;
  }
  
  public void setCompletada(boolean completada) {
    this.completada = completada;
  }
  
  public LocalDate getFechaLimite() {
    return fechaLimite;
  }
}
