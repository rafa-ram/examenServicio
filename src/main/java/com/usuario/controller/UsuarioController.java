package com.usuario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.usuario.modelo.Usuario;
import com.usuario.service.IUsuarioService;



@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	
	@GetMapping(value = "/listar")
	public String listarUsuarios(Model model) {
		List<Usuario> usuarios = service.listUsusarios();
		model.addAttribute("usuarios", usuarios);
		return "index";
	}
	
	@GetMapping(value = "/new")
	public String guardarUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "modal";
		
	}
	
	@PostMapping(value = "/save")
	public String saveUsuario(Usuario usuario) {
		service.save(usuario);
		return "redirect:/listar";
	}
	
	@GetMapping(value = "/editar/{id}")
	public String editarUsuario(@PathVariable int id, Model model) {
		Optional<Usuario> usuario = service.getUsuarioById(id);
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@GetMapping(value = "/eliminar/{id}")
	public String eliminarUsuario(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
