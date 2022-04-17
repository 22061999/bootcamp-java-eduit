package practicaAdicionalSemana3;


import java.util.Scanner;

public class Alumno {
	
	
	//Atributos
	private String nombre;
	private String apellido;
	private Integer cantidadDeExamenes;
	private Float[] notas;
	private Float promedio;


	
	Scanner teclado = new Scanner(System.in);
	
	
	//Constructor
	public Alumno(String nombre, String apellido, Integer cantidadDeExamenes) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cantidadDeExamenes = cantidadDeExamenes;
		
	}
	
	public Alumno(String nombre, String apellido, Float promedio) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.promedio = promedio;
	}

	
	
	
	//Metodos
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public Integer getCantidadDeExamenes() {
		return cantidadDeExamenes;
	}




	public void setCantidadDeExamenes(Integer cantidadDeExamenes) {
		this.cantidadDeExamenes = cantidadDeExamenes;
	}




	public Float[] getNotas() {
		return notas;
	}




	public void setNotas(Float[] notas) {
		this.notas = notas;
	}




	public Float getPromedio() {
		return promedio;
	}




	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}




	public void digitarNotas() {
		this.notas = new Float[this.getCantidadDeExamenes()];
	
		for(int i=0; i<this.getCantidadDeExamenes(); i++) {
			System.out.print("Digite una nota: ");
			notas[i] = teclado.nextFloat(); 
			if(notas[i]>=0f && notas[i]<=10f) {
				continue;
			} else {
				System.out.println("la nota es incorrecta");
				break;
			}
		}
		System.out.print("Notas del alumno son:\n ");      
	for (int i=0; i<this.getCantidadDeExamenes(); i++) {
		System.out.print(notas[i]+"\n ");
	}
	  
	}

	public Float promedios() {
		Float sumaDeNotas = 0f;
		for(int i=0; i < notas.length;i++) {
			 sumaDeNotas += notas[i];
			 this.promedio = sumaDeNotas / notas.length;
		}
	System.out.println("el promedios es: "+ promedio);
		return promedio;
	}




	@Override
	public String toString() {
		return "\n nombre=" + nombre + "\n apellido=" + apellido + "\n promedio=" + promedio;
	}

		
}
	
	
	
	
	

