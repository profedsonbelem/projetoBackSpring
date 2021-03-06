package br.com.arq.back.service;

import java.util.Map;

import br.com.arq.back.entity.Usuario;

 

 

public interface IUsuarioService {

	public abstract Map<String,Object> gerarUuid(Usuario u);
	public abstract Map<String,Object> enviarEmail(Usuario u);
	
}
