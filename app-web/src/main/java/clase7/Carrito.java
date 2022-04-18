package clase7;

public class Carrito {
	//Atributos
	Item[] item;
	
	
	//Constructor.
	Carrito () {
		this.item = new Item[0];
	} 
	
	//metodos
	
	void seguirComprando( ) {
		System.out.println("Seguir comprando:");
	}
	
	void limpiarPedido () {
		this.item = new Item[0];
	}
	
	void actualizar(Item [] ItemActualizado) {
		this.item = ItemActualizado;
	} 

	void eliminarElementos() {
	
	}
}
