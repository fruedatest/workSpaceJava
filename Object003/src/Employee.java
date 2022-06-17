public class Employee {
	
	private float salary;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Employee() {
		super();
	}

	public Employee(float salary, String nombre, String apellido, int edad) {
		super();
		this.salary = salary;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
	
}
