package mainPackage.dao;
import java.util.List;

import mainPackage.model.Usuario;

public interface IUsuarioDao{
	
	public boolean registrar(Usuario usuario);
	public List<Usuario> obtener();
	public boolean actualizar(Usuario usuario);
	public boolean eliminar(Usuario usuario);
	
}
