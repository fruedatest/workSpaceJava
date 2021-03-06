
public class Cliente extends Persona {

	private String categoria;
	private String codigo;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String apellido, String documento, String tipo) {
		super(nombre, apellido, documento, tipo);
		// TODO Auto-generated constructor stub
	}

	public Cliente(String categoria, String codigo) {
		super();
		this.categoria = categoria;
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String generarCodigo() {
		int codigo = (int) (Math.random() * 99999999);
		String codigoParse = String.valueOf(codigo);
		String codigoFinal = "COD" + codigoParse;

		return codigoFinal;
	}

	@Override
	public String toString() {
		return "Cliente [categoria=" + categoria + ", codigo=" + codigo + "]";
	}

}
