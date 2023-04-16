package ClaseGestor;

import java.time.LocalDate;

public class EjecutaTareas {
	
  public static void main(String[] args) {
			
	  // Creamos algunas tareas de ejemplo 
	  Tarea tarea1 = new Tarea("Comprar leche", "Ir al supermercado y comprar leche desnatada", 2, LocalDate.of(2023, 4, 20));
	  Tarea tarea4 = new Tarea("Sacar impresion", "Imprimir el documento adjunto para archivarlo", 2, LocalDate.of(2023, 4, 21));
	  Tarea tarea3 = new Tarea("Hacer ejercicio", "Ir al gimnasio y hacer una sesión de pesas", 3, LocalDate.of(2023, 4, 22));
	  Tarea tarea6 = new Tarea("Barrer el suelo de la sala", "Limpieza del hogar", 3, LocalDate.of(2023, 4, 23));
	  Tarea tarea5 = new Tarea("Inscribirse a clases de baile", "Fecha para la inscripcion del curso de danza", 3, LocalDate.of(2023, 4, 24));
	  Tarea tarea2 = new Tarea("Enviar correo electrónico", "Responder al correo de Juan sobre el proyecto de la semana que viene", 1, LocalDate.of(2023, 4, 25));
	      
	  // Creamos una lista de tareas y agregamos las tareas de ejemplo
	  ListaTareas listaTareas = new ListaTareas();
	  listaTareas.agregarTarea(tarea1);
	  listaTareas.agregarTarea(tarea2);
	  listaTareas.agregarTarea(tarea3);
	  listaTareas.agregarTarea(tarea4);
	  listaTareas.agregarTarea(tarea5);
	  listaTareas.agregarTarea(tarea6);
	    
	    // Filtramos las tareas por prioridad y las imprimimos
	    System.out.println("Tareas con prioridad 2:");
	    for (Tarea tarea : listaTareas.filtrarTareasPorPrioridad(2)) {
	      System.out.println("- " + tarea.getNombre());
	    }
	    
	    // Filtramos las tareas por fecha límite y las imprimimos
	    System.out.println("Tareas con fecha límite el 22/04/2023:");
	    for (Tarea tarea : listaTareas.filtrarTareasPorFechaLimite(LocalDate.of(2023, 4, 22))) {
	      System.out.println("- " + tarea.getNombre());
	    }
	    
	    // Marcamos una tarea como completada y actualizamos la lista
	    tarea1.setCompletada(true);
	    listaTareas.eliminarTarea(tarea1);
	    listaTareas.agregarTarea(tarea1);
	    
	    // Filtramos las tareas por completado y las imprimimos
	    System.out.println("Tareas completadas:");
	    for (Tarea tarea : listaTareas.filtrarTareasPorCompletado(true)) {
	      System.out.println("- " + tarea.getNombre());
	    }
	    
	    // Obtenemos el número de tareas completadas en un rango de fechas y lo imprimimos
	    System.out.println("Número de tareas completadas entre el 20/04/2023 y el 25/04/2023:");
	    System.out.println(listaTareas.getNumeroTareasCompletadas(LocalDate.of(2023, 4, 20), LocalDate.of(2023, 4, 25)));
	  }				
				 

	 
	 
}

