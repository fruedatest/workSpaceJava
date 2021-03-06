public class Persona {
	
	private String nombre;
	private String apellido;
	private String documento;
	private String tipo;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, String documento, String tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.tipo = tipo;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", tipo=" + tipo
				+ "]";
	}
	
	
	
}
