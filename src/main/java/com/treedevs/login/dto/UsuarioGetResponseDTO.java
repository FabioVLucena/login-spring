package com.treedevs.login.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.treedevs.login.entities.Usuario;

import lombok.Data;

@Data
public class UsuarioGetResponseDTO {

	private Long id;
	private String login;
	private String senha;
	
	public static UsuarioGetResponseDTO convert(Usuario usuario) {
		UsuarioGetResponseDTO usuDTO = new UsuarioGetResponseDTO();
		usuDTO.setId(usuario.getId());
		usuDTO.setLogin(usuario.getLogin());
		usuDTO.setSenha(usuario.getSenha());
		
		return usuDTO; 
	}
	
	public static List<UsuarioGetResponseDTO> convertList(List<Usuario> usuarioList){
		return usuarioList.stream().map(UsuarioGetResponseDTO::convert).collect(Collectors.toList());
	}
}
