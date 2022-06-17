package object002;

public class Main {
	public static void main(String[] args) {
		
		TarjetaBancaria tarjetaBancaria = new TarjetaBancaria();
		tarjetaBancaria.setActive(false);
		tarjetaBancaria.setCantidadInicial();
		tarjetaBancaria.setTitular("Nombre Apellido1 Apellido2");
		tarjetaBancaria.setEntidadEmisora("EntidadEmisora");
		tarjetaBancaria.setExpirationDate(10102025);
		
		tarjetaBancaria.pagar(100);
		
		System.out.println(tarjetaBancaria);
		
		
	}

}
