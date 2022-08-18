package com.treedevs.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.treedevs.login.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("SELECT usu FROM Usuario usu WHERE usu.login = :login AND usu.senha = :senha")
	Usuario login(@Param("login") String login, @Param("senha") String senha);
	
}
