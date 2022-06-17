package main;

public class Alumno implements IPersona{
	private String nombre;
	private int curso;
	
	public Alumno() {

	}

	public Alumno(String nombre, int curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + "]";
	}
	
}
