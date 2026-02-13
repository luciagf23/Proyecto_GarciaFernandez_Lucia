package com.luisdbb.tarea3AD2024base.repositorios;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisdbb.tarea3AD2024base.modelo.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	static User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	Optional<User> findByNombreUsuario(String username);
}
