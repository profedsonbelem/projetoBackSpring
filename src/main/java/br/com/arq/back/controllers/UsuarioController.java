package br.com.arq.back.controllers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.back.entity.Usuario;
import br.com.arq.back.repository.ClienteRepository;
import br.com.arq.back.repository.UploadImagemRepository;
import br.com.arq.back.repository.UsuarioRepository;
import br.com.arq.back.service.UsuarioService;

@ResponseBody
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UploadImagemRepository imageRepository;

	@Autowired
	ClienteRepository cdao;

	@Autowired
	UsuarioRepository dao;

	@Autowired
	UsuarioService emailservice;
	
	@PostMapping("/gerar")
	public ResponseEntity<?> generateToken(@RequestBody Usuario respusuario) throws NoSuchAlgorithmException {
			Usuario usuario = new Usuario();
			usuario.setUsername(respusuario.getUsername());
			String token = UUID.randomUUID().toString();
			usuario.setToken(token);
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta = hash.toString(16);
			usuario.setToken(resposta + token);
			  dao.save(usuario);
			return  ResponseEntity.status(200).body("token:" + usuario.getToken());
		}


 	@RequestMapping(value = "/create/{token}", produces = "application/json", method = RequestMethod.POST)
 	public ResponseEntity<?> create(@PathVariable("token") String token, @RequestBody Usuario usuario) {
 		try {
 			Usuario u =dao.findByToken(token);
 			if (u.getUsername().equals(null)) {
 				throw new IllegalArgumentException("Token Invalido");
 			}
 			MessageDigest md = MessageDigest.getInstance("MD5");
 			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
 			md.update((usuario.getPassword() + chave).getBytes());
 			BigInteger hash = new BigInteger(1, md.digest());
 			  String resposta = hash.toString(16);
 			   usuario.setPassword(resposta);
 			   Usuario resp = dao.save(usuario);
 			if (resp == null) {
				throw new IllegalArgumentException("Erro  dado do usuario");
			}
			Map<String, Object> mapa = new HashMap<String, Object>();
				 	mapa.put("password", usuario.getPassword());
					mapa.put("email", resp.getEmail());
					mapa.put("username", resp.getUsername());
					mapa.put("perfil", resp.getPerfil());
	                mapa.put("token",resp.getToken());
	                mapa.put("nivel",resp.getPerfil());
					mapa.put("status", "gravado com sucesso");
			return ResponseEntity.status(200).body(mapa);
		} catch (Exception ex2) {
			Map<String, Object> mapa = new HashMap<String, Object>();
				
					mapa.put("usuario-error", ex2.getMessage());
					mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

	@RequestMapping(value = "/createminPassw", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> createMinPassw(@RequestBody Usuario usuario) {
		try {

			MessageDigest md = MessageDigest.getInstance("MD5");
 			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
 			md.update((usuario.getPassword() + chave).getBytes());
 			BigInteger hash = new BigInteger(1, md.digest());
 			String resposta1 = hash.toString(16);
 			Usuario resposta = dao.save(usuario);
 
 			return ResponseEntity.status(200).body(resposta);
 		} catch (Exception ex2) {
 			ex2.printStackTrace();
 			Map<String, Object> mapa = new HashMap<String, Object>();
 			mapa.put("usuario-error", ex2.getMessage());
 			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
 		}
 	}
	

 	@RequestMapping(value = "/login/{token}", produces = "application/json", method = RequestMethod.POST)
 	public ResponseEntity<?> login( @PathVariable("token") String token,@RequestBody Usuario usuario) {
 		try {
 
 		
 			MessageDigest md = MessageDigest.getInstance("MD5");
 			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
 		    md.update((usuario.getPassword() + chave).getBytes());
 			BigInteger hash = new BigInteger(1, md.digest());
 			String resposta = hash.toString(16);
 			usuario.setPassword(resposta);
 			System.out.println(usuario.getPassword());
 
 		Usuario u = dao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
 			if (u == null) {
 			throw new IllegalArgumentException("Erro no no dado do usuario");
 		  }
 			if (!u.getToken().equals(token)) {
 				throw new IllegalArgumentException("Token Invalido");
 		 }
 			
 			Map<String, Object> mapa = new HashMap<String, Object>();
 				mapa.put("usuario-email-saved", u.getEmail());
 				mapa.put("usuario-username-saved", u.getUsername());
 				mapa.put("status", "logado");
 				mapa.put("token", u.getToken() );
			return ResponseEntity.status(200).body(mapa);
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
				mapa.put("usuario-error", ex.getMessage());
				 mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@RequestMapping(value = "/createmin", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> createMin(@RequestBody Usuario usuario) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);

			usuario.setPassword(resposta1);
			Usuario resposta = dao.save(usuario);

			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

 
	@PostMapping("/gravar")
	public ResponseEntity<?> gravar(@RequestBody Usuario usu) {
		try {
			Usuario usuario = dao.save(usu);
			if (usuario == null) {
				throw new Exception("usuario nao gravado");
			}
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

	@PostMapping("/esqueci")
	public ResponseEntity<?> buscarPorEmail(@RequestBody Usuario usu) {
		try {
			Usuario usuario = usu;
			Usuario resposta = dao.findByEmailAndPassword(usu.getEmail(), usu.getPassword());
			if (resposta == null) {
				throw new Exception("Email não encontrado");
			}
			usuario.setId(resposta.getId());
			usuario.setUsername(resposta.getUsername());
			usuario.setEmail(resposta.getEmail());
			usuario.setPassword("-1");
			dao.save(usuario);
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

	@PutMapping("/alterar/{id}/token/{token}")
	public ResponseEntity<?> alterarSenha(@PathVariable Long id,@PathVariable String token,
			                               @RequestBody Usuario usu) {
		try {
			Usuario resp1 = dao.findByToken(token);
			Usuario resp = dao.findById(id).get();
			if ((resp1.equals(resp)) && (resp.getPassword().equals("-1"))) {
				usu.setId(resp.getId());
				usu.setUsername(resp.getUsername());
				usu.setEmail(resp.getEmail());
				usu.setPerfil(resp.getPerfil());
				usu.setNivel(resp.getNivel());
				dao.saveAndFlush(usu);
			} else {
				throw new Exception("Email ou senha nao alterado");
			}
			return ResponseEntity.status(200).body(usu);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

	
	@PostMapping("/loginmin")
	public ResponseEntity<?> logar(@PathVariable String token,@RequestBody Usuario usu) {
		try {
			Usuario resp = usu;
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((resp.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);

			resp.setPassword(resposta1);
			Usuario resposta = dao.findByEmailAndPassword(usu.getEmail(), usu.getPassword());
			if (resposta == null) {
				throw new Exception("Email ou senha invalido");
			}
			return ResponseEntity.status(200).body("Logado: " + resposta);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());

		}
	}
	
	
	@GetMapping("/buscarId/{id}")
	public ResponseEntity<?> buscarId(@PathVariable Long id) {
		Usuario resp=null; 
		try {
			resp = dao.findById(id).get();
		 
			 if (resp==null) {
				throw new Exception("Email ou senha nao alterado");
		 	}
		
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}
	


    @GetMapping(value="/sendmail")
    public String sendmail() {
    	emailservice.sendEmail();
        return "emailsent";
    }

 
	@RequestMapping(value = "/loginmin", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> loginMin(@RequestBody Usuario usuario) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);

			usuario.setPassword(resposta1);
			Usuario resposta = dao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
			if (resposta == null) {
				throw new Exception("Login Invalido");
			}
			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@RequestMapping(value = "/listar/{token}", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity <?> findListar(@PathVariable("token") String token, @RequestBody Usuario usuario) {
		Map<String, Object> mapa = new HashMap<String, Object>();
		try {
			String token2 =token;
			Usuario u = dao.findByToken(token);
			 if (token2.equals(usuario.getToken())) {
			return ResponseEntity.status(200).body(dao.findAll());
			 }else {
	    	 return ResponseEntity.status(500).body("usuario acesso negado");
			 }
		} catch (Exception ex) {
					mapa.put("usuario-error", ex.getMessage());
					mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

	@RequestMapping(value = "/usuario/{token}", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> findAll(@RequestBody Usuario usuario, @PathVariable("token") String token) {
		try {
			if (!usuario.getToken().equals(token)) {
				throw new IllegalArgumentException("Token Invalido");
			}
			return ResponseEntity.status(200).body(dao.findAll());
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>(); 
					mapa.put("usuario-error", ex.getMessage());
					mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

	@RequestMapping(value = "/usuario/{id}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable("id")Long id) {
		try {
			Usuario usuario = dao.findById(id).get();
			if (usuario == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

	@RequestMapping(value = "/usuario/{id}/token/{token}", produces = "application/json", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable("id") Long id,
			      @RequestBody Usuario usuario,
			      @PathVariable("token") String token) {
		try {
			if (!usuario.getToken().equals(token)) {
				throw new IllegalArgumentException("Token Invalido");
			}

			Usuario u = dao.findById(id).get();
			if (u == null) {
				throw new IllegalAccessException("nao encontrado");
			}

			u.setUsername(usuario.getUsername());
			u.setPassword(usuario.getPassword());
			u.setEmail(usuario.getEmail());
			Usuario resp = dao.save(u);
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

	@RequestMapping(value = "/usuario/{id}/token/{token}", produces = "application/json", 
			      method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable("id") Long id, @RequestBody Usuario usuario,
			@PathVariable("token") String token) {
		try {
			if (!usuario.getToken().equals(token)) {
				throw new IllegalArgumentException("Token Invalido");
			}

			Usuario u = dao.findById(id).get();
			if (u == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			dao.delete(u);
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("msg-exclusao", "Dados Excluidos com sucesso");
			return ResponseEntity.status(200).body(mapa);
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}
 
}
