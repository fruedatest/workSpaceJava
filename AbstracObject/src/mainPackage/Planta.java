package mainPackage;

public class Planta extends SerVivo{
	private String especie;
	
	public Planta(String edad, String planeta, String especie) {
		super(edad, planeta);
		this.especie = especie;
		
	}
	
	public String mostarSerVivo() {
		return "La planta es de la especie: "+especie+", tiene una edad de: "+edad+" y es del planta: "+planeta;
	}
	

}
