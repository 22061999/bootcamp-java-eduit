package practicaAdicionalSemana4;

public class Helicoptero extends Voladores implements Aterrizable{
	
	private String color;
	private String Modelo;
	private String Utilidad;
	
	
	public Helicoptero(String nombre, String color, String modelo, String utilidad) {
		super(nombre);
		this.color = color;
		this.Modelo = modelo;
		this.Utilidad = utilidad; 
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getUtilidad() {
		return Utilidad;
	}


	public void setUtilidad(String utilidad) {
		Utilidad = utilidad;
	}


	public void Aterriza() {
		System.out.println("Helicoptero habilitado para Aterrizar.");
	}
		


	
	
	
	
}
