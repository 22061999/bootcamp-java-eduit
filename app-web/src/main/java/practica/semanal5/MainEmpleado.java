package practica.semanal5;

public class MainEmpleado {

	public static void main(String[] args) {
		
		Empleado empl1 = new Empleado("Matias", "Vaelrio", 9167, "Operario");
		
		Empleado empl2 = new Empleado("Juan", "Genta", 5487, "Operario");
		
		Empleado empl3= new Empleado("Carlos", "Barbosa" ,3521 ,"Team Lider"); 

		
		CollectionCustom<Empleado> ArchivoPersonal = new CollectionCustom <Empleado>();
		
		ArchivoPersonal.addLast(empl3);
		ArchivoPersonal.addLast(empl1);
		ArchivoPersonal.addLast(empl2);
		
		
		
		Empleado empl5 = new Empleado("Adrian","Perez", 3589,"Grup Lider"); 
	
		ArchivoPersonal.addLast(empl5);
		
		System.out.println(ArchivoPersonal.toString());
	}
	

}
