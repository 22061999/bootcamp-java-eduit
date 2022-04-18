package clase7; 

public class TematikaMain {

	public static void main(String[] args) {
			String claveBuscadaPorElUsuario = "batman";
			
			Buscador miBuscador = new Buscador(claveBuscadaPorElUsuario);
			
			miBuscador.buscar();
			
			miBuscador.mostrarCantidad();
			
			//verifico si tengo los resultados.
			if(miBuscador.hayResultados()) {
				
				miBuscador.detalle();
			}
	}

}
