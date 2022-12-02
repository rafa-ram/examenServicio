package com.usuario.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usuario.modelo.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Serializable>{

}
