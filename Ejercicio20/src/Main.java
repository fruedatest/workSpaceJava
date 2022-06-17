public class Main {
	
	public static void javaOrNull(String palabra) {
		if (palabra == "java") {
			System.out.print("java");
		}else {
			System.out.println("null");
		}
		
	}
	
	public static void checkLogin(String username, String password) {
		if ((username == "admin") && (password == "1234")) {
			System.out.println("Login true!");
		} else {
			System.out.println("Login false!");
		}
	}
	
	public static void checkParImpar() {
		int numeroParImpar = (int) (Math.random()*123123+10);
		System.out.println(numeroParImpar);
		
		if (numeroParImpar % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
	
	public static void main(String[] args) {

		javaOrNull("java");
		System.out.println(" ");
		checkLogin("admin", "1234");
		checkParImpar();
		
		
	}
}
