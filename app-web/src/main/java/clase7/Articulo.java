package clase7;

public class Articulo {
	
	//Esto es una clase.
	
	
	//Atributos (Instancia de clase).
	Long id;
	String nombre;
	String autor;
	Double precio; 
	String urlImagen;
	
	
	//Constructor. alt+shift+s (opcion rapida).
	
	public Articulo(String nombre, String autor, Double precio, String urlImagen, Long numeroID ) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
		this.id = numeroID;
	}
	
	//Metodos.
	
	boolean tieneImagen() {
		//logica?
		return this.urlImagen !=null && this.urlImagen != "";	
	
	}
	
	
}
