public class Main {
	
	public static void main(String[] args) {
		
		Programmer programmer = new Programmer();
		programmer.setSalary(1000);
		programmer.setNombre("Nombre");
		programmer.setApellido("Apellido");
		programmer.setEdad(25);
		programmer.setBonus(140);
		programmer.setDepartamento("Android");
		
		System.out.println(programmer);
	}
}
