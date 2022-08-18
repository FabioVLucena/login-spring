package com.treedevs.login.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treedevs.login.dto.UsuarioGetResponseDTO;
import com.treedevs.login.dto.UsuarioPostRequestDTO;
import com.treedevs.login.entities.Usuario;
import com.treedevs.login.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuService;
	
	@PostMapping(path = "/login")
	public ResponseEntity<UsuarioGetResponseDTO> login(@RequestBody UsuarioPostRequestDTO usuarioDTO) throws ParseException{
		Usuario usuario = UsuarioPostRequestDTO.convert(usuarioDTO);
		String login = usuario.getLogin();
		String senha = usuario.getSenha();
		
		usuario = usuService.login(login, senha);
		
		return ResponseEntity.ok(UsuarioGetResponseDTO.convert(usuario));
	}

	@PostMapping(path = "/cadastro")
	public ResponseEntity<UsuarioGetResponseDTO> cadastro(@RequestBody UsuarioPostRequestDTO usuarioDTO) throws ParseException{
		Usuario usuario = UsuarioPostRequestDTO.convert(usuarioDTO);

		usuService.save(usuario);
		
		return ResponseEntity.ok(UsuarioGetResponseDTO.convert(usuario));
	}
}
