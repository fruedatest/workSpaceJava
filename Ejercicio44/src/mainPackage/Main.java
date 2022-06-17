package mainPackage;

public class Main {

	public static void main(String[] args) {
		
		Developer developer1 = new Developer(Profesiones.BACK_END_DEVELOPER,"Nombre1", "Apellido1", "34", "12345678X");
		Developer developer2 = new Developer(Profesiones.FULL_STACK_DEVELOPER,"Nombre2", "Apellido2", "44", "12345678X");
		Developer developer3 = new Developer(Profesiones.FRONT_END_DEVELOPER,"Nombre3", "Apellido3", "24", "12345678X");

		checkDeveloper(developer1);
		checkDeveloper(developer2);
		checkDeveloper(developer3);
	
		
	
	}
	
	public static void checkDeveloper(Developer developer) {
		if (developer.getProfesiones() == Profesiones.BACK_END_DEVELOPER || developer.getProfesiones() == Profesiones.FULL_STACK_DEVELOPER) {
			System.out.println("Viva el back!");
			
		}else {
			System.out.println("JS es una caca, es mejor utilizar TypeScript");
		}
	}
}
