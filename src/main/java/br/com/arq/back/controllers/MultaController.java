package br.com.arq.back.controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.back.entity.Multa;
import br.com.arq.back.repository.MultaRepository;

@ResponseBody
@RestController
@RequestMapping("/multa")
@CrossOrigin("*")
public class MultaController {

	@Autowired
	private MultaRepository mdao;
 
    public static	List<Multa> multas = new ArrayList<Multa>();
  
	@GetMapping("/findall")
	public List<Multa> findAll() {
		return mdao.findAll();
	}

	@GetMapping("/findbycode/{codigo}")
	public ResponseEntity<?> findByCodigo(@PathVariable("codigo") String codigo) {
		try {
			Multa multa = mdao.findById(codigo).get();

			if (multa == null) {
				throw new Exception("nao Encontrado");
			}
			return ResponseEntity.status(200).body(multa);
		} catch (Exception ex) {
			Map<String, String> multaer = new HashMap<String, String>();
			multaer.put("error", ex.getMessage());
			return ResponseEntity.status(500).body(multaer);
		}
	}
	
	
	
	private void loadGrave() {
		try {

		  BufferedReader bf = new BufferedReader(new InputStreamReader(
				  new FileInputStream("c:\\cnh\\Grave.csv"), "utf8"));
		  String s="";
		  int i=0;
	  
		  while((s=bf.readLine())!=null) {
			  if( i++==0) {
				  System.out.println("nao le a rimeira linha");
			  }else {
				   String pos[]= s.split(";");
				   multas.add(new Multa(pos[0], pos[1], pos[2], pos[3], pos[4],
                     new Integer(pos[5]), pos[6], 
						   new Double( pos[7].replace(',', '.') ), new Double( pos[8].replace(',', '.'))));
				   
			  }
			
		  }
	bf.close();
		}	
	  catch(Exception ex) {
		   ex.printStackTrace();
	  }
	}
	private void loadGravissima() {
		try {

		  BufferedReader bf = new BufferedReader(new InputStreamReader(
				  new FileInputStream("c:\\cnh\\Gravissima.csv"), "utf8"));
		  String s="";
		  int i=0;
	  
		  while((s=bf.readLine())!=null) {
			  if( i++==0) {
				  System.out.println("nao le a rimeira linha");
			  }else {
				   String pos[]= s.split(";");
				   multas.add(new Multa(pos[0], pos[1], pos[2], pos[3], pos[4],
                     new Integer(pos[5]), pos[6], 
						   new Double( pos[7].replace(',', '.') ), new Double( pos[8].replace(',', '.') )));
				   
			  }
			
		  }
	bf.close();
		}	
	  catch(Exception ex) {
		   ex.printStackTrace();
	  }
	}
	private void loadMedia() {
		try {
		  BufferedReader bf = new BufferedReader(new InputStreamReader(
				  new FileInputStream("c:\\cnh\\Media.csv"), "utf8"));
		  String s="";
		  int i=0;
	  
		  while((s=bf.readLine())!=null) {
			  if( i++==0) {
				  System.out.println("nao le a rimeira linha");
			  }else {
				   String pos[]= s.split(";");
				   multas.add(new Multa(pos[0], pos[1], pos[2], pos[3], pos[4],
                     new Integer(pos[5]), pos[6], 
						   new Double( pos[7].replace(',', '.') ), new Double( pos[8].replace(',', '.') )));
				   
			  }
			
		  }
	bf.close();
		}	
	  catch(Exception ex) {
		   ex.printStackTrace();
	  }
	}
	
	private List<Multa> loadLeve() {
		loadGrave();
		loadMedia();
		loadGravissima();
		try {
 
 		  BufferedReader bf = new BufferedReader(new InputStreamReader(
				  new FileInputStream("c:\\cnh\\Leve.csv"), "utf8"));
		  String s="";
		  int i=0;
	  
		  while((s=bf.readLine())!=null) {
			  if( i++==0) {
				  System.out.println("nao le a rimeira linha");
			  }else {
				   String pos[]= s.split(";");
				   multas.add(new Multa(pos[0], pos[1], pos[2], pos[3], pos[4],
                     new Integer(pos[5]), pos[6], 
						   new Double( pos[7].replace(',', '.') ), new Double( pos[8].replace(',', '.') )));
				   
			  }
			
		  }
	bf.close();
		}	
	  catch(Exception ex) {
		   ex.printStackTrace();
	  }
		return multas;
	}
	
	@PostMapping("/gravar")
	public ResponseEntity<?> gravar() {
	         List<Multa> multas=	 mdao.saveAll(loadLeve());
		 return ResponseEntity.status(200).body(multas);
	}

}
