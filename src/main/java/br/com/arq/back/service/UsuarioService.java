package br.com.arq.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("profedsonbelem@gmail.com");
		msg.setSubject("Testing from Spring Boot");
		msg.setText("Hello World \n Spring Boot Email");
		javaMailSender.send(msg);

	}

}