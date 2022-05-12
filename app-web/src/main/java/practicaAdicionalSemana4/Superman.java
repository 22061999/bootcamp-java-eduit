package practicaAdicionalSemana4;

public class Superman extends Voladores implements NoAterrizable {
	private String nacionalidad;
	private Integer edad;

	
	public Superman(String nombre, String nacionalidad, Integer edad) {
		super(nombre);
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	
	public void NoAterriza () {
		System.out.println("Superman No habilitado para aterrizar.");
	}
	 
	
	
	
}
