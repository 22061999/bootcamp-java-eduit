package clase7;

public class Buscador {
	
	//Clase Buscador.
	
	//Atributos.
	String claveDeBusqueda;
	Articulo[] articulos;
	Integer cantidad;
	
	
	//Constructor.

		Buscador() {
		this.claveDeBusqueda = "";
		this.articulos =  new Articulo[0];
		this.cantidad = 0;
	}
	
	 Buscador(String claveDeBusqueda) {
		
		this.claveDeBusqueda = claveDeBusqueda; 
	}
	
	//metodos
	
	//metodo buscar ingresa a objeto Articulo y invoca datos cargados.
	void buscar(){ 
			
	
	Articulo[] resultados = new Articulo[3];
	
		resultados[0] = new Articulo("Batman (1970) un caballe...","dc",2950d ,"url", 195l);
		resultados[1] = new Articulo("Batman (2010) un caballe.","dc",2000d,"url", 196l);
		resultados[2] = new Articulo("Batman (2022) un caballe", "dc",2300d,"url", 197l);
		 
		this.articulos = resultados;
		cantidad = resultados.length;
		
	}
	void mostrarCantidad () {
		System.out.println("La cantidad encontrada, "+ this.cantidad + "  resultados para batman.");
	}
	public boolean hayResultados() {
		return this.cantidad > 0;
	}

	 void detalle() {
		for(int i=0;i<this.cantidad;i++) {
			//me quedo con el articulo en la posicion i.
			Articulo unArticulo = this.articulos[i];
			
			System.out.println(unArticulo.nombre);
			System.out.println(unArticulo.autor);
			System.out.println(unArticulo.precio);
			
			//solo mostrar si tiene imagen, 
			if (unArticulo.tieneImagen()) {
				System.out.println(unArticulo.urlImagen);
			} else {
				System.out.println("no tiene imagen");
			}
			
		}
	}

}
