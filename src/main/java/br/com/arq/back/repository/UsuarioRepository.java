package br.com.arq.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.back.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	  public Usuario findByEmailAndPassword(String email, String password);
	  public List<Usuario>  findByUsername(String username);
      public Usuario findByEmail(String email);
      public Usuario findByToken(String token);
}
