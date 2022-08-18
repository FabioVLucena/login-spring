package com.treedevs.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treedevs.login.entities.Usuario;
import com.treedevs.login.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuRepo;
	
	@Transactional(readOnly = false)
	public void save(Usuario usuario) {
		usuRepo.save(usuario);
	}
	
	@Transactional(readOnly = false)
	public void update(Usuario usuario) {
		usuRepo.save(usuario);
	}
	
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		usuRepo.deleteById(id);
	}
	
	@Transactional(readOnly = true)
	public Usuario login(String login, String senha) {
		Usuario usuario = usuRepo.login(login, senha);
		return usuario;
	}
}
