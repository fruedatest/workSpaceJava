package mainPackage;
import secondPackage.HastaNunqui;
import secondPackage.HolaMundo;

public class Main {
	public static void main(String[] args) {
		
		HastaNunqui hastaNunqui = new HastaNunqui();
		String despido = hastaNunqui.getDespido();
		System.out.println(despido);
		
		
		HolaMundo holaMundo = new HolaMundo();
		String saludo = holaMundo.getSaludo();
		System.out.println(saludo);
		
		
	}

}
