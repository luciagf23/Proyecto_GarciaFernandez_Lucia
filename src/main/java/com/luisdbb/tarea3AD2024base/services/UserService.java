package com.luisdbb.tarea3AD2024base.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisdbb.tarea3AD2024base.modelo.User;
import com.luisdbb.tarea3AD2024base.repositorios.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	private final UserRepository usuarioRepository;

	@Autowired
	public UserService(UserRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	// Guardar o actualizar
	public User save(User usuario) {
		return usuarioRepository.save(usuario);
	}

	// Eliminar por ID
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	// Buscar todos
	public List<User> findAll() {
		return usuarioRepository.findAll();
	}

	public boolean authenticate(String nombre, String contrasenia) {
		User usuario = this.findByEmail(nombre);
		if (usuario == null) {
			return false;
		} else {
			if (contrasenia.equals(usuario.getPassword()))
				return true;
			else
				return false;
		}
	}

	public User findByEmail(String email) {
		return UserRepository.findByEmail(email);
	}

	// Buscar por ID
	public Optional<User> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	// Buscar por nombre de usuario
	public Optional<User> findByNombreUsuario(String username) {
		return usuarioRepository.findByNombreUsuario(username);
	}

	public User find(long long1) {
		// TODO Auto-generated method stub
		return null;
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInBatch(List<User> users) {
		// TODO Auto-generated method stub
	}
}
