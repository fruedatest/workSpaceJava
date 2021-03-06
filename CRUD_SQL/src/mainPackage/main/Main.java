package mainPackage.main;

import java.util.Scanner;

import mainPackage.controller.UsuarioController;
import mainPackage.model.Usuario;

public class Main {
	public static void main(String[] args) {

		int opcion;
		System.out.println("Elige una opcion para continuar: ");
		System.out.println("1. Añadir usuario a la base de datos.");
		System.out.println("2. Mostrar usuarios de la base de datos.");
		System.out.println("3. Editar usuarios a la base de datos.");
		System.out.println("4. Eliminar usuarios de la base de datos.");
		System.out.println("5. Salir");
		
		Scanner scanner = new Scanner(System.in);
		opcion = scanner.nextInt();
		UsuarioController usuarioController = new UsuarioController();
		
		switch (opcion) {
		case 1:
			System.out.println("######## AÑADE UN NUEVO USUARIO ########");
			Usuario usuario = new Usuario();
			
			System.out.print("Introduce el nombre de usuario: ");
			String username = scanner.next();
			
			System.out.print("Introduce la contraseña: ");
			String password = scanner.next();
			
			System.out.print("Introduce el email: ");
			String email = scanner.next();
			
			usuario.setUsername(username);
			usuario.setPassword(password);
			usuario.setEmail(email);
			
			usuarioController.registrar(usuario);
			
			break;

		case 2:
			System.out.println("######## LISTADO DE USUARIOS ########");
			usuarioController.verUsuarios();
			
			break;
			
		case 3:
			System.out.println("######## ACTUALIZAR USUARIO ########");
			usuarioController.verUsuarios();
			System.out.print("Selecciona el id del usuario que quieres editar: ");
			
			Usuario usuarioUpdate = new Usuario();
			int idUsuarioUpdate = scanner.nextInt();
			
			usuarioUpdate.setIdUusario(idUsuarioUpdate);
			
			System.out.print("Nuevo nombre del id: "+usuarioUpdate.getIdUusario());
			String usernameUpdate = scanner.next();
			usuarioUpdate.setUsername(usernameUpdate);
			
			System.out.print("Nueva password del id: "+usuarioUpdate.getIdUusario());
			String passwordUpdate = scanner.next();
			usuarioUpdate.setPassword(passwordUpdate);
			
			System.out.print("Nuevo email del id: "+usuarioUpdate.getIdUusario());
			String emailUpdate = scanner.next();
			usuarioUpdate.setEmail(emailUpdate);
			
			usuarioController.actualizar(usuarioUpdate);
			
			break;
			
		case 4:
			System.out.println("######## ELIMINAR USUARIO ########");
			usuarioController.verUsuarios();
			
			System.out.print("\nSelecciona el id del usuario que quieres eliminar: ");
			int idUsuario = scanner.nextInt();
			Usuario usuarioDelete = new Usuario();
			usuarioDelete.setIdUusario(idUsuario);
			usuarioController.eliminarUsuario(usuarioDelete);
			
			break;
		
		case 5:
			System.out.println("######## Saliendo... ########");
			break;

		default:
			System.out.println("######## Opción no válida ########");
			break;
		}

		
		
	}

}
