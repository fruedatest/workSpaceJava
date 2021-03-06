package object001;

public class Coche {

	private int fuel;
	private int maxSpeed;

	public Coche() {
		super();
	}

	public Coche(int fuel, int maxSpeed) {
		super();
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/*
	 * 
	 */

	public void refuel(int cantidad) {

		this.fuel = fuel + cantidad;
	}

	public void driveCar() {
		System.out.println("El coche esta siendo conducido");
	}

	@Override
	public String toString() {
		return "Coche [fuel=" + fuel + ", maxSpeed=" + maxSpeed + "]";
	}

}
