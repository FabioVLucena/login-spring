package com.treedevs.login.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private Long id;
	
	@Column(name = "usu_login", nullable = false, length = 6, unique = true)
	private String login;

	@Column(name = "usu_senha", nullable = false, length = 30, unique = false)
	private String senha;
}


