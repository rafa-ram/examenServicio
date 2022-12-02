package com.usuario.service;

import java.util.List;
import java.util.Optional;


import com.usuario.modelo.Usuario;


public interface IUsuarioService {
	
	public List<Usuario> listUsusarios();
	public Optional<Usuario> getUsuarioById(int id);
	public int save(Usuario usuario);
	public void delete(int id);

}
