package br.com.arq.back.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.back.entity.FaleConosco;
import br.com.arq.back.repository.FaleConoscoRepository;

@ResponseBody
@RestController
@RequestMapping("/api")
public class FaleConoscoController {

	@Autowired
	private FaleConoscoRepository dao;
	
	@PostMapping("/faleconosco")
	public ResponseEntity<?> postFalar(@RequestBody FaleConosco faleConosco) {
	   try {
		   FaleConosco  resposta= dao.save(faleConosco);
		
		   if (resposta == null) {
				 throw new IllegalArgumentException("Dados Invalidos");
			  }
	
		   return ResponseEntity.status(200).body(resposta); 
	   }catch(Exception ex) {
		   Map<String, Object> mapa = new HashMap<String, Object>(); 
						mapa.put("usuario-error", ex.getMessage());
						mapa.put("status", "nao gravado");
				 
		   return ResponseEntity.status(500).body(mapa);
	   }
	}

	
	
}
