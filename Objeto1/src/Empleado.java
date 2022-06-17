public class Empleado {
	private String nombre;

	public Empleado() {
		super();
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
}
