package object001;

public class Main {
	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		coche1.refuel(100);
		coche1.setMaxSpeed(200);
		coche1.driveCar();
		System.out.println(coche1);
		
		
		Coche coche2 = new Coche(1000, 110);
		coche2.driveCar();
		System.out.println(coche2);
		
		
		Coche coche3 = new Coche(230, 100);
		coche3.driveCar();
		coche3.refuel(200);
		coche3.setMaxSpeed(110);
		System.out.println(coche3);
		
		
		
	}

}
