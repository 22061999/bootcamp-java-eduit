package clase4;



public class FuncionReturn {
	public static void main(String[] args) {
		
		int resultado = suma (10, 20);
		System.out.println(resultado);
	}

	public static int suma(int a, int b) {
		
		int c = a + b;
		
		return c;
	}
}
