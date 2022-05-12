package practicaAdicionalSemana4;

public class Ovni extends Voladores implements Aterrizable {
	
	private Integer planetaRecorridos;
	private String emprasaDeFabricacion;
	private String velocidadMaxima;
	
	public Ovni(String nombre, Integer planetaRecorridos, String emprasaDeFabricacion, String velocidadMaxima) {
		super(nombre);
		this.planetaRecorridos = planetaRecorridos;
		this.emprasaDeFabricacion = emprasaDeFabricacion;
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getPlanetaRecorridos() {
		return planetaRecorridos;
	}

	public void setPlanetaRecorridos(Integer planetaRecorridos) {
		this.planetaRecorridos = planetaRecorridos;
	}

	public String getEmprasaDeFabricacion() {
		return emprasaDeFabricacion;
	}

	public void setEmprasaDeFabricacion(String emprasaDeFabricacion) {
		this.emprasaDeFabricacion = emprasaDeFabricacion;
	}

	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void Aterriza() {
		System.out.println("Ovni Habilitado para aterrizar.");
		
	}
	
	
	
	
}
