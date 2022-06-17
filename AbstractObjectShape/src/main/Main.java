package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String color;
		double lado;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el color de la figura: ");
		color = scanner.nextLine();
		
		System.out.println("Introduce el lado de la figura: ");
		lado = scanner.nextDouble();
		
		Cuadrado cuadrado = new Cuadrado(color, lado);
		System.out.println(cuadrado.calcularArea());
		
	}
}
