package ClaseGestor;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

  public class ListaTareas {
	//atributos
	private List<Tarea> tareas;//interfaz List, lista de objetos de tipo tarea.
  
	  //constructor
	  public ListaTareas() {
	    tareas = new ArrayList<>();
	  }
  
  	//Metodos
	  public void agregarTarea(Tarea tarea) {
	    tareas.add(tarea);
	  }
	  
	  public void eliminarTarea(Tarea tarea) {
	    tareas.remove(tarea);
	  }
	  
	  //devuelve las tareas con la prioridad que decida el usuario
	  public List<Tarea> filtrarTareasPorPrioridad(int prioridad) {
	    List<Tarea> tareasFiltradas = new ArrayList<>();
	    for (Tarea tarea : tareas) {
	      if (tarea.getPrioridad() == prioridad) {
	        tareasFiltradas.add(tarea);
	      }
	    }
	    return tareasFiltradas;
	  }
	  
	  //devuelve las listas completadas
	  public List<Tarea> filtrarTareasPorCompletado(boolean completada) {
	    List<Tarea> tareasFiltradas = new ArrayList<>();
	    for (Tarea tarea : tareas) {
	      if (tarea.getCompletada() == completada) {
	        tareasFiltradas.add(tarea);
	      }
	    }
	    return tareasFiltradas;
	  }
  
	  //devuelve las tareas con fecha limite
	  public List<Tarea> filtrarTareasPorFechaLimite(LocalDate fechaLimite) {
	    List<Tarea> tareasFiltradas = new ArrayList<>();
	    for (Tarea tarea : tareas) {
	      if (tarea.getFechaLimite().equals(fechaLimite)) {
	        tareasFiltradas.add(tarea);
	      }
	    }
	    return tareasFiltradas;
	  }
  
	  //devuelve el numero de tareas completadas
	  public int getNumeroTareasCompletadas(ChronoLocalDate fechaInicio, ChronoLocalDate fechaFin) {
	    int contador = 0;
	    for (Tarea tarea : tareas) {
	      if (tarea.getCompletada() && tarea.getFechaLimite().isAfter(fechaInicio) && tarea.getFechaLimite().isBefore(fechaFin)) {
	        contador++;
	      }
	    }
	    return contador;
	  }
}
