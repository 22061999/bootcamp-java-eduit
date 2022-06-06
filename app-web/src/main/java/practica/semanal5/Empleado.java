package practica.semanal5;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int legajo;
	private String puesto;
	
	
	public Empleado(String nombre, String apellido, int legajo, String puesto  ) {
	
		this.nombre = nombre;
		this.legajo = legajo;
		this.puesto = puesto;
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	


	
	
	
	
	
	
}
