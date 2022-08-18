package com.treedevs.login.dto;

import com.treedevs.login.entities.Usuario;

import lombok.Data;

@Data
public class UsuarioPostRequestDTO {

	private String login;
	private String senha;

	public static Usuario convert(UsuarioPostRequestDTO usuDTO) {
		return convert(new Usuario(), usuDTO);
	}
	
	public static Usuario convert(Usuario usu, UsuarioPostRequestDTO usuDTO) {
		usu.setLogin(usuDTO.getLogin());
		usu.setSenha(usuDTO.getSenha());
		
		return usu;
	}
}
