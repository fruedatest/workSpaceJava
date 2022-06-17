package mainPackage;

public abstract class Animal extends SerVivo {
	private String especie;
	private String peso;

	public Animal(String edad, String planeta, String especie, String peso) {
		super(edad, planeta);
		this.especie = especie;
		this.peso = peso;
		
	}

	/*
	 public String mostarSerVivo() {
		return "El ser vivo es de la especie: " + especie + ", tiene una edad de: " + edad + " y es del planta: "
				+ planeta+". Su peso es de :"+peso;
	}
	 */
	
	public abstract String mostrarSerVivo();
	
}
