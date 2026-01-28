package com.luciagf.repositorios;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luciagf.modelo.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	static Usuario findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	Optional<Usuario> findByNombreUsuario(String username);
}
