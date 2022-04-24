package practicaAdcionoalSemana2;

import java.util.Scanner;

public class ValidacionFechas {
	public static void main(String[] args) {
		
			boolean comenzarNuevamente = true;
			int no = 0;
			int si = 1;
			int opcionUsuario;
			Scanner teclado = new Scanner(System.in);
			 
	do {	int dia = matrizDeValidacion (1, 31, teclado, "Ingrese el dia", "el dia no es valdio", "Ingrese el dia nuevamente:");
			int mes = matrizDeValidacion (1, 12, teclado, "Ingrese el mes", "El mes no es valido", "Ingrese el mes nuevamente:");
			int anio = matrizDeValidacion (1900, 2099, teclado, "Ingrese el año", "El año no es valido", "Ingrese el anio nuevamente:");
			boolean evDia = elDiaValido(mes, dia, anio);
			boolean evDiaDos = elDiaValidoDos(mes, dia, anio);
			boolean evDiaTres = elDiaValidoTres(mes, dia, anio);
	
		
			if (evDia == true || evDiaDos == true || evDiaTres == true) {
			
				System.out.println("La fecha "+dia+"/"+mes+"/"+anio+", es valida.");
				System.out.println("Queres validar otra fecha (0 = NO) o (1 = SI)");
				opcionUsuario = teclado.nextInt();
				if (opcionUsuario == si) {
					continue;
				} else {
					opcionUsuario = no;
					System.out.println("Salida exitosa.");
					break;
				}
			} else {
				System.out.println("la fecha no es valida.");
				System.out.println("Ingrese nuevamente los datos:");
			}
			
		} while (comenzarNuevamente);
			teclado.close();
			
	}

	static int matrizDeValidacion(int j, int y, Scanner teclado, String msj, String msj1, String msj2) {
		int opcion;
		boolean iterarDeNuevo = true;
		
					System.out.println(msj);
		 do {		opcion = teclado.nextInt();
					if (opcion >= j && opcion <= y) {
						iterarDeNuevo = false;
					}   else {
					System.out.println(mensajeDeValidacion(msj1));
					iterarDeNuevo = true;
					System.out.println(mensajeDeValidacion2(msj2)); 
				    }
					  
			 } while (iterarDeNuevo);
		return opcion;
 }
	 
	 static String mensajeDeValidacion2 (String msj2) {
		 return msj2;
	 }
	 
	 
	 static String mensajeDeValidacion (String msj1) {
		 return msj1;
	 }
 
	 static boolean elDiaValido (int mes, int dia, int anio) {
	int [] grupoUno = {1,3,5,8,10,12};
	boolean resultadoDos = true;
		for (int i = 0; i < grupoUno.length; i++ ) {
			 if(grupoUno[i] == mes && dia <= 31) {
				resultadoDos = true; 
				break;
			} else {
				resultadoDos = false;
			}
				
			}
		
		return resultadoDos;
		}
		
	 static boolean elDiaValidoDos (int mes, int dia, int anio) {
		int [] grupoDos = {4,6,7,9,11};
		boolean resultado = true;
		
		for (int i = 0; i < grupoDos.length; i++ ) {
			
			 if (grupoDos[i] == mes && dia <= 30) {
				resultado = true;
				break;
		} else { 
			resultado = false;
			 	}
		}
		return resultado;
		
	}
	 
	 static boolean elDiaValidoTres (int mes, int dia, int anio) {
	boolean resultadoTres = true; 
		if((anio % 4 == 0) && (mes == 2) && (dia>=1 && dia<=29)) {
			resultadoTres = true; 
		}else if (mes == 2 && dia <= 28){
			resultadoTres = true; 
		}else {
			resultadoTres = false;
			  }
			
	return resultadoTres;
}
	
				
}






	
 

