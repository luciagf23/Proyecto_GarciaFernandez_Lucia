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

	public User save(User usuario) {
		return usuarioRepository.save(usuario);
	}

	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	public List<User> findAll() {
		return usuarioRepository.findAll();
	}

	public boolean authenticate(String username,String contrasenia) {
		Optional<User> usuarioOpt = usuarioRepository.findByUsername(username);

		if (usuarioOpt.isEmpty()) {
			return false;
		}

		User usuario = usuarioOpt.get();
		return contrasenia.equals(usuarioOpt.get().getPassword());
	}

	public Optional<User> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	public Optional<User> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	public Optional<User> findByUsername(String username) {
	    return usuarioRepository.findByUsername(username);
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
