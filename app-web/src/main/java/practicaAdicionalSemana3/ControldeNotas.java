package practicaAdicionalSemana3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControldeNotas {
	
	
	public static void main(String[] args) {
		int opcionUsuario = 1;
		Scanner teclado = new Scanner(System.in); 
		List<Alumno> arrayAlumnos = new ArrayList<Alumno>();
		List<Alumno> arrayRecursantes = new ArrayList<Alumno>();
		List<Alumno> arrayPromocionados = new ArrayList<Alumno>();
		
		while (opcionUsuario == 1){	
			
			System.out.println("Ingrese Nombre del Alumno: ");
			String nombre = teclado.next();
			System.out.println("Ingrese Apellido del Alumno: ");
			String apellido = teclado.next();
			System.out.println("Ingrese Cantidad de Examenes: ");
			Integer cantidadExamenes = teclado.nextInt();
		
			Alumno alumnoNuevo = new Alumno(nombre, apellido, cantidadExamenes);
				
			
			if (cantidadExamenes != 0) {
				alumnoNuevo.digitarNotas();
				alumnoNuevo.promedios();
			}	
			arrayAlumnos.add(alumnoNuevo);	
			System.out.println("Queres cargar otro Alumno (0 = NO) o (1 = SI)");
			opcionUsuario = teclado.nextInt();

			if (opcionUsuario == 0){					
				System.out.println("Salida exitosa.");
				break;
			} else if(opcionUsuario != 1) {
				System.out.println("Opción inválida.");
			}
			
		}
	
		Alumno mejorCalificacionAlumno = arrayAlumnos.get(0);
		Alumno peorCalificacionAlumno = arrayAlumnos.get(0);
		for(Alumno alumNuevo : arrayAlumnos) {
			if(alumNuevo.getPromedio() > mejorCalificacionAlumno.getPromedio()) {
				mejorCalificacionAlumno = alumNuevo;
			}
			
			if(alumNuevo.getPromedio() < peorCalificacionAlumno.getPromedio()) {
				peorCalificacionAlumno = alumNuevo;
			} 
			if(alumNuevo.getPromedio()>=7) {
				arrayPromocionados.addAll(arrayAlumnos);
			}else {
				arrayRecursantes.addAll(arrayAlumnos);
				
			}
		}
		
		System.out.println("El mayor promedio es:" + mejorCalificacionAlumno.toString());
		System.out.println("El menor proemdio es:" + peorCalificacionAlumno.toString());
		System.out.println("Promocionados: "+ arrayPromocionados.toString());
		System.out.println("Recursantes: " + arrayRecursantes.toString());
		
		teclado.close();
	}
}
