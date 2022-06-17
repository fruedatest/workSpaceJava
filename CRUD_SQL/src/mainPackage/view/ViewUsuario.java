package mainPackage.view;

import java.util.List;

import mainPackage.model.Usuario;

public class ViewUsuario {
	public void verUsuario(Usuario usuario) {
		System.out.println("Datos del usuario: "+usuario);
		
	}
	
	public void verUsuarios(List<Usuario> usuarios) {
		for (Usuario usuario : usuarios) {
			System.out.println("Datos del usuario: "+usuario);
		}
	}
}
