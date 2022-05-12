package practicaAdicionalSemana4;

public class Avion extends Voladores implements NoAterrizable{
	
	private Integer capacidadDePasajeros;
	
	private String Marca;
	
	public Avion(String nombre, Integer capacidadDePasajeros, String Marca) {
		super(nombre);
		
		this.capacidadDePasajeros = capacidadDePasajeros;
		
		this.Marca = Marca;
	}

	public Integer getCapacidadDePasajeros() {
		return capacidadDePasajeros;
	}

	public void setCapacidadDePasajeros(Integer capacidadDePasajeros) {
		this.capacidadDePasajeros = capacidadDePasajeros;
	}


	

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public void NoAterriza () {
		System.out.println("Avion  No habilitado para aterrizar.");
	}
	 
	
}
