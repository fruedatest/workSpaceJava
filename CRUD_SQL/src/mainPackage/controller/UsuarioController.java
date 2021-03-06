package mainPackage.controller;

import java.util.ArrayList;
import java.util.List;

import mainPackage.dao.IUsuarioDao;
import mainPackage.dao.UsuarioDaoImpl;
import mainPackage.model.Usuario;
import mainPackage.view.ViewUsuario;

public class UsuarioController {

	public UsuarioController() {

	}

	private ViewUsuario viewUsuario = new ViewUsuario();

	public void registrar(Usuario usuario) {
		IUsuarioDao usuarioDao = new UsuarioDaoImpl();
		usuarioDao.registrar(usuario);

	}

	public void verUsuarios() {
		List<Usuario> usuario = new ArrayList<Usuario>();
		IUsuarioDao usuarioDao = new UsuarioDaoImpl();
		usuario = usuarioDao.obtener();
		viewUsuario.verUsuarios(usuario);
		
	}
	
	public void eliminarUsuario(Usuario usuario) {
		IUsuarioDao usuarioDao = new UsuarioDaoImpl();
		usuarioDao.eliminar(usuario);
		
	}
	
	public void actualizar(Usuario usuario) {
		IUsuarioDao usuarioDao = new UsuarioDaoImpl();
		usuarioDao.actualizar(usuario);
	}
	
	
	
	
	
}
