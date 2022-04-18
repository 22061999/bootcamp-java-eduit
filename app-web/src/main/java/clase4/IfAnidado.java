package clase4;

 import java.util.Scanner;
 
public class IfAnidado {

	public static void main(String[] args) {
		
	Scanner Teclado = new Scanner(System.in);
	
	int edad = Teclado.nextInt ();
	
	
		if(edad >=18) {
			if(edad >=20 || edad<=30 ) {
				
			}else {	System.out.println("Es adulto");}
		}else System.out.println("Es adolecente adulto");

		Teclado.close ();
	} 

} 
