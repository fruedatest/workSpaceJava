public class Main {
	
	public static void main(String[] args) {

		/*
		 * Apartado 1
		 */
		recorrerArray();

		/*
		 * Apartado 2
		 */
		limitArray();

		/*
		 * Apartado 4
		 */
		reverseString();
		
		sumaNumeros();
		
	}

	public static void recorrerArray() {
		String[] technologies = { "Markdown", "Regex", "HTML", "CSS", "JS", "SQL", "Java" };
		for (int i = 0; i < technologies.length; i++) {
			System.out.println(technologies[i]);
		}
	}

	public static void limitArray() {
		String[] technologies = { "Markdown", "Regex", "HTML", "CSS", "JS", "SQL", "Java" };
		for (int i = 0; i < technologies.length; i++) {
			if (technologies[i] == "HTML") {
				System.out.println(technologies[i]);
			} else {
				break;
			}
		}
	}

	public static void reverseString() {
		String palabra = "supercalifragilisticoespialidoso";
		System.out.println(palabra);
		StringBuilder strb = new StringBuilder(palabra);
		palabra = strb.reverse().toString();
		System.out.println(palabra);
	}
	
	public static void sumaNumeros() {
		int number1 = 12223;
	      
        String number = String.valueOf(number1);

        char[] digits1 = number.toCharArray();

        for(int i = 0; i < digits1.length; i++) {
        	System.out.println(digits1[i]);
        	int total = digits1[i] + digits1[i+1];
        	System.out.println(total);
        }
	}

}
