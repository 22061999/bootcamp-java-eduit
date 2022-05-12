package practicaAdicionalSemana4;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControl {

	public static void main(String[] args) {
		
		
			List<Voladores> Operadores = new ArrayList<Voladores>(); 
			//List<Voladores> Aterriza = new ArrayList<Voladores>(); //
			
			
			Voladores Helicopetero1  = new Helicoptero ("Puma", "verde", "1999", "Guerra");
			Voladores Avion1	= new Avion ("pointer", 25, "Neberland");
			Voladores Superman1  = new Superman ("Clar Ken", "Martes", 150 );
			Voladores Ovni1  = new Ovni ("ET", 5, "Peugeot", "2000km");
			
			Operadores.add(Helicopetero1);
			Operadores.add(Avion1);
			Operadores.add(Superman1);
			Operadores.add(Ovni1);
		
			for(Voladores a: Operadores) {
					if(a instanceof Aterrizable) {
						Aterrizable b = (Aterrizable)a;
					b.Aterriza();
					
					} else if (a instanceof NoAterrizable) {
						NoAterrizable c = (NoAterrizable)a;
						c.NoAterriza();
					}
			}
		
		}
	}
