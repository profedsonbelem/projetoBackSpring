package br.com.arq.back.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.arq.back.entity.Usuario;
 
 

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private JavaMailSender senderEmail;


	@Override
	public Map<String, Object> gerarUuid(Usuario u) {
//		Map<String, Object> mapa = new HashMap<String, Object>() {
//			{
//				u.setUuidmain(UUID.randomUUID().toString());
//				put("uuid-user", u.getUuidmain());
//			}
//		};
		return null;
	}

//	@Override
//	public Map<String, Object> criptografia(Usuario u) throws Exception {
//		MessageDigest md = MessageDigest.getInstance("MD5");
//		String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//		md.update((u.getPassword() + chave).getBytes());
//		BigInteger hash = new BigInteger(1, md.digest());
//		String resposta = hash.toString(16);
//		Map<String, Object> mapa = new HashMap<String, Object>() {
//			{
//				put("user-password", resposta);
//			}
//		};
//		return mapa;
//	}
	
 
	@Override
	public Map<String, Object> enviarEmail(Usuario u) {
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(u.getEmail());
			msg.setSubject("Recuperacao java dia 25 de dezembro hohoho...");
			msg.setText("Seja Bem vindo a minha loja Virtual SR :" + u.getUsername());
			senderEmail.send(msg);
			Map<String, Object> mapa = new HashMap<String, Object>() {
				{
					put("email", "email enviado para :" + u.getEmail());
				}
			};
			return mapa;
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>() {
				{
					put("error-email", "deu ruim no envio, " + u.getEmail());
				}
			};
			return mapa;
		}
	}

}