package com.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.dao.IUsuarioDao;
import com.usuario.modelo.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao dao;
	
	@Override
	public List<Usuario> listUsusarios() {
		// TODO Auto-generated method stub
		return (List<Usuario>) dao.findAll();
	}

	@Override
	public Optional<Usuario> getUsuarioById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public int save(Usuario usuario) {
		// TODO Auto-generated method stub
		int result = 0;
		Usuario usu = dao.save(usuario);
		if (!usu.equals(null)) {
			result = 1;
		}
		return result;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

}
