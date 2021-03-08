package br.com.arq.back.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.back.entity.Cliente;
import br.com.arq.back.repository.ClienteRepository;

@ResponseBody
@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
	
	
	@Autowired
	ClienteRepository cdao;

	@PostMapping("/create")
	public ResponseEntity<?> createCliente(@RequestBody Cliente cliente) {
		 
			try {
				Cliente  resp =  cdao.save(cliente);

				if (resp == null) {
					throw new IllegalArgumentException("Dados Invalidos do Cliente");
				}

				return ResponseEntity.status(200).body(resp);
			} catch (Exception ex) {
				Map<String, Object> mapa = new HashMap<String, Object>();

				mapa.put("usuario-error", ex.getMessage());
				mapa.put("status", "nao gravado");

				return ResponseEntity.status(500).body(mapa);
			}
		}


	
	  }

 
