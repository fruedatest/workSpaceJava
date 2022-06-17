package main;

public class Profesor implements IPersona{
	private String nombre;
	private int salario;
	
	public Profesor() {
		
	}

	public Profesor(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
	
}
