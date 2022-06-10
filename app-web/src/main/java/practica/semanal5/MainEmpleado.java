package practica.semanal5;



public class MainEmpleado {

	public static void main(String[] args) {
		
		Empleado empl1 = new Empleado("Ariel", "Genius", 9167, "Administrativo");
		
		Empleado empl2 = new Empleado("Juan", "Diaz", 5487, "Recepcionista");
		
		Empleado empl3= new Empleado("Carlos", "Barbosa" ,3521 ,"Auditor"); 

		Empleado empl5 = new Empleado("Adrian","Perez", 3589,"Lider de Grupo"); 
		
		CollectionCustom<Empleado> ArchivoPersonal = new CollectionCustom<Empleado>(25);
		
		ArchivoPersonal.addLast(empl3);
		ArchivoPersonal.addLast(empl1);
		ArchivoPersonal.addLast(empl2);
		
		
		ArchivoPersonal.addFirst(empl5);
	
		ArchivoPersonal.size();
		
		
		
		System.out.println("Primer elemento: " + ArchivoPersonal.removefirstElement().getNombre());
		System.out.println(ArchivoPersonal.removefirstElement().getApellido());
		System.out.println(ArchivoPersonal.removefirstElement().getLegajo());
		
		ArchivoPersonal.removeAll();
		
		ArchivoPersonal.booleanEmpty();
	}
	

}
