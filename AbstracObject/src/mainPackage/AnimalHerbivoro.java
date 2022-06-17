package mainPackage;

public class AnimalHerbivoro extends Animal {
	private String hierba;
	
	public AnimalHerbivoro(String edad, String planeta, String especie, String peso, String hierba) {
		super(edad, planeta, especie, peso);
		this.hierba = hierba;
	}
	
	public String mostrarSerVivo() {
		return "El ser vivo es de la especie: " + especie + ", tiene una edad de: " + edad + " y es del planta: "
				+ planeta+". Su peso es de :"+peso;
	}

	@Override
	public String mostarSerVivo() {
		return "El ser vivo es de la especie: " + especie + ", tiene una edad de: " + edad + " y es del planta: "
				+ planeta+". Su peso es de :"+peso;

	}
	
}
