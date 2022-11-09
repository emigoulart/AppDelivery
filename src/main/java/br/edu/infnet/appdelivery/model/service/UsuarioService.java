package br.edu.infnet.appdelivery.model.service;

import br.edu.infnet.appdelivery.model.domain.Usuario;
import br.edu.infnet.appdelivery.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) {

		Usuario usuario = usuarioRepository.findByEmail(email);

		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}
}