import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		NotAutorized notAuthorized = new NotAutorized();
		Lorca lorca = new Lorca();
		
		String opcion = "";
		String opcion2 = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el primer parametro: ");
		opcion = scanner.next().toLowerCase();
		System.out.println("Introduce el segundo parametro: ");
		opcion2 = scanner.next().toLowerCase();
		String resultado = opcion + opcion2;

		switch (resultado) {
		case "federicogarcialorca":
			lorca.lorca();
			break;

		default:
			notAuthorized.notAutorized();
			break;
		}
	}

}
