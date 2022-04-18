package clase3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int cont = 0;
		int numeros;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese valor:");
		
		numeros = teclado.nextInt(); 
		
		while (numeros != 0) {
			if(cont<5) {
				cont ++;
				System.out.println("Ingrese valor:");
				numeros = teclado.nextInt(); 
			}else {System.out.println("el programa ha terminado.");
						break;
			}
		}
		teclado.close();
	}

}
