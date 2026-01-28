package com.luciagf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciagf.modelo.Usuario;
import com.luciagf.repositorios.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	// Guardar o actualizar
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	// Eliminar por ID
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	// Buscar todos
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public boolean authenticate(String nombre, String contrasenia) {
		Usuario usuario = this.findByEmail(nombre);
		if (usuario == null) {
			return false;
		} else {
			if (contrasenia.equals(usuario.getPassword()))
				return true;
			else
				return false;
		}
	}

	public Usuario findByEmail(String email) {
		return UsuarioRepository.findByEmail(email);
	}

	// Buscar por ID
	public Optional<Usuario> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	// Buscar por nombre de usuario
	public Optional<Usuario> findByNombreUsuario(String username) {
		return usuarioRepository.findByNombreUsuario(username);
	}

	public Usuario find(long long1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario update(Usuario user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInBatch(List<Usuario> users) {
		// TODO Auto-generated method stub
	}
}
