
public class Car {
	private String company;
	private String speed;
	
	public Car() {

	}

	public Car(String company, String speed) {

		this.company = company;
		this.speed = speed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}



	@Override
	public String toString() {
		
		return "Company: "+company+"\nSpeed: "+speed+"\n"+company+" car's speed is "+speed+"Km/h";
	}
	
	
	
	
	
}
