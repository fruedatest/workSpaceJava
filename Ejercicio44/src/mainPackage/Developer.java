package mainPackage;

public class Developer {
	
	Profesiones profesiones;
	String nombre;
	String apellidos;
	String edad;
	String dni;
	
	public Developer() {
		
	}

	public Developer(Profesiones profesiones, String nombre, String apellidos, String edad, String dni) {
		super();
		this.profesiones = profesiones;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	public Profesiones getProfesiones() {
		return profesiones;
	}

	public void setProfesiones(Profesiones profesiones) {
		this.profesiones = profesiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Developer [Rol tecnológico=" + profesiones + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad="
				+ edad + ", dni=" + dni + "]";
	}
	
	
	

}
