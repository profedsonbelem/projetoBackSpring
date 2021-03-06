package br.com.arq.back.controllers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	UsuarioService service;

	@PostMapping("/gerar")
	public Usuario logon(@RequestBody Usuario respusuario) {
		
			Usuario usuario = new Usuario();
			usuario.setUsername(respusuario.getUsername());
            
			String token = UUID.randomUUID().toString();
			usuario.setToken(token);
		    usuario.setUuidmain(token);
			return usuario;
		}


//	@RequestMapping(value = "/create/{token}", produces = "application/json", method = RequestMethod.POST)
//	public ResponseEntity<?> create(@RequestBody Usuario usuario, @PathVariable("token") String token) {
//		try {
//			if (!usuario.getToken().equals(token)) {
//				throw new IllegalArgumentException("Token Invalido");
//			}
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//			md.update((usuario.getPassword() + chave).getBytes());
//			BigInteger hash = new BigInteger(1, md.digest());
//			String resposta = hash.toString(16);
//			usuario.setPassword(resposta);
//			Usuario u = dao.save(usuario);
//			if (u == null) {
//				throw new IllegalArgumentException("Erro no no dado do usuario");
//			}
//			Map<String, Object> mapa = new HashMap<String, Object>() {
//				{
//					put("uuidmain", u.getUuidmain());
//					put("password", usuario.getPassword());
//					put("email", u.getEmail());
//					put("username", u.getUsername());
//					put("status", "gravado com sucesso");
//				}
//			};
//			return ResponseEntity.status(200).body(mapa);
//		} catch (Exception ex2) {
//			Map<String, Object> mapa = new HashMap<String, Object>() {
//				{
//					put("usuario-error", ex2.getMessage());
//					put("status", "nao gravado");
//				}
//			};
//			return ResponseEntity.status(500).body(mapa);
//		}
//	}

//	@RequestMapping(value = "/createmin", produces = "application/json", method = RequestMethod.POST)
//	public ResponseEntity<?> createMin(@RequestBody Usuario usuario) {
//		try {
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//			md.update((usuario.getPassword() + chave).getBytes());
//			BigInteger hash = new BigInteger(1, md.digest());
//			String resposta1 = hash.toString(16);
//			Usuario resposta = dao.save(usuario);
//
//			return ResponseEntity.status(200).body(resposta);
//		} catch (Exception ex2) {
//			ex2.printStackTrace();
//			Map<String, Object> mapa = new HashMap<String, Object>();
//			mapa.put("usuario-error", ex2.getMessage());
//			mapa.put("status", "nao gravado");
//			return ResponseEntity.status(500).body(mapa);
//		}
//
//	}

//	@RequestMapping(value = "/login/{token}", produces = "application/json", method = RequestMethod.POST)
//	public ResponseEntity<?> login(@RequestBody Usuario usuario, @PathVariable("token") String token) {
//		try {
//
//			if (!usuario.getToken().equals(token)) {
//				throw new IllegalArgumentException("Token Invalido");
//			}
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//			md.update((usuario.getPassword() + chave).getBytes());
//			BigInteger hash = new BigInteger(1, md.digest());
//			String resposta = hash.toString(16);
//			usuario.setPassword(resposta);
//			System.out.println(usuario.getPassword());
//
//			Usuario u = dao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
//			if (u == null) {
//				throw new IllegalArgumentException("Erro no no dado do usuario");
//			}
//			Map<String, Object> mapa = new HashMap<String, Object>() {
//				{
//					put("password", usuario.getPassword());
//					put("usuario-email-saved", u.getEmail());
//					put("usuario-username-saved", u.getUsername());
//					put("usuario-uuid", u.getUuidmain());
//					put("status", "logado");
//				}
//			};
//			return ResponseEntity.status(200).body(mapa);
//		} catch (Exception ex) {
//			Map<String, Object> mapa = new HashMap<String, Object>() {
//				{
//					put("usuario-error", ex.getMessage());
//					put("status", "nao gravado");
//				}
//			};
//			return ResponseEntity.status(500).body(mapa);
//		}
//
//	}

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

 
//	gravar
//	buscarPorEmail 
//	alterarSenha 
//	logar 

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

	@PutMapping("/alterar/{id}")
	public ResponseEntity<?> alterarSenha(@PathVariable Long id, @RequestBody Usuario usu) {
		try {
			Usuario resp = dao.findById(id).get();
			if (resp.getPassword().equals("-1")) {
				usu.setId(resp.getId());
				usu.setUsername(resp.getUsername());
				usu.setEmail(resp.getEmail());
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

	
	@PostMapping("/logon")
	public ResponseEntity<?> logar(@RequestBody Usuario usu) {
		try {
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
	
//	@PostMapping("/login")
//	public ResponseEntity<?> findByLogin(@RequestBody Usuario usuario) {
//		try {
//			usuario.setPassword(service.criptografia(usuario));
//			usuario.setEmail(usuario.getEmail());
//			Usuario resp = dao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
//			System.out.println(resp);
//			System.out.println(usuario.getPassword());
//			Map<String, Object> mapa = new HashMap<String, Object>();
//			mapa.put("send-email", usuario.getEmail());
//			mapa.put("password-crypto", usuario.getPassword());
//			mapa.put("data-usuario-created", usuario);
//			// String resposta = new Gson().toJson(mapa);
//			return ResponseEntity.status(200).body(resp);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			Map<String, Object> mapa = new HashMap<String, Object>();
//			mapa.put("error-generated", "Erro gerado ..." + ex.getMessage());
//			String resposta = new Gson().toJson(mapa);
//			return ResponseEntity.status(500).body(resposta);
//		}
//	}

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

	@RequestMapping(value = "/listar", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<?> findListar(@RequestBody Usuario usuario) {
		try {
			return ResponseEntity.status(200).body(dao.findAll());
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>() {
				{
					put("usuario-error", ex.getMessage());
					put("status", "nao gravado");
				}
			};
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
			Map<String, Object> mapa = new HashMap<String, Object>() {
				{
					put("usuario-error", ex.getMessage());
					put("status", "nao gravado");
				}
			};
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
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Usuario usuario,
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

	@RequestMapping(value = "/usuario/{id}/token/{token}", produces = "application/json", method = RequestMethod.DELETE)
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

//	@PostMapping("/upload")
//	public ImageModel uploadImage(@RequestParam("myFile") MultipartFile file) throws IOException {
//		ImageModel img = new ImageModel(null, file.getOriginalFilename(), file.getContentType(), file.getBytes());
//		final ImageModel savedImage = imageRepository.save(img);
//		System.out.println("Image saved");
//		return savedImage;
//	}
//	

}
