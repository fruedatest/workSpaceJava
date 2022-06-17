
public class Empleado extends Persona {

	private String tipoContrato;
	private int sueldo;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String apellido, String documento, String tipo) {
		super(nombre, apellido, documento, tipo);
		// TODO Auto-generated constructor stub
	}

	public Empleado(String tipoContrato, int sueldo) {
		super();
		this.tipoContrato = tipoContrato;
		this.sueldo = sueldo;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [tipoContrato=" + tipoContrato + ", sueldo=" + sueldo + "]";
	}

}
