package object002;

public class TarjetaBancaria {
	private int numero;
	private int expirationDate;
	private String titular;
	private String entidadEmisora;
	private int cantidad;
	private boolean isActive;
	private int cantidadInicial;

	public TarjetaBancaria() {
		super();
	}
	
	
	public TarjetaBancaria(int numero, int expirationDate, String titular, String entidadEmisora, int cantidad,
	boolean isActive, int cantidadInicial) {
		super();
		this.numero = numero;
		this.expirationDate = expirationDate;
		this.titular = titular;
		this.entidadEmisora = entidadEmisora;
		this.cantidad = cantidad;
		this.isActive = isActive;
		this.cantidadInicial = cantidadInicial;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEntidadEmisora() {
		return entidadEmisora;
	}

	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getCantidadInicial() {
		return cantidadInicial;
	}

	public void setCantidadInicial() {
		this.cantidadInicial = 1000;
	}

	public void activarCuenta() {
		this.isActive = true;
		
	}

	public void desactivarCuenta() {
		this.isActive = false;

	}
	
	public void pagar(int cantidadPagar) {
		if (isActive == true) {
			this.cantidadInicial = cantidadInicial - cantidadPagar;
			System.out.println("Has pagado: "+cantidadPagar+" €");
			
		}else if (isActive == false){
			System.out.println("Activa la tarjeta para poder pagar");
		}
	}


	@Override
	public String toString() {
		return "TarjetaBancaria [numero=" + numero + ", expirationDate=" + expirationDate + ", titular=" + titular
				+ ", entidadEmisora=" + entidadEmisora + ", cantidad=" + cantidad + ", isActive=" + isActive
				+ ", saldo=" + cantidadInicial + "]";
	}
	
	

}
