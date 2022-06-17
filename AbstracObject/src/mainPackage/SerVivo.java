package mainPackage;

public abstract class SerVivo {

	public String edad;
	public String planeta;

	public SerVivo(String edad, String planeta) {
		this.edad = edad;
		this.planeta = planeta;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public abstract String mostarSerVivo();
	

}
