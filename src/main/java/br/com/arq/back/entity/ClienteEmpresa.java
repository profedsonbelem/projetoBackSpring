package br.com.arq.back.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name = "clienteempresa")
public class ClienteEmpresa implements Serializable{

	private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("idClienteEmpresa")
	@Column(name = "idClienteEmpresa")
	private Long idClienteEmpresa;
	
	@JsonProperty("username")
	@Column(name = "username")
	private String username;

	@JsonProperty("emailcliente-empresa")
	@Column(name = "emailcliente_empresa")
	@Email(message="Email fora do Padrao !!!")
	private String emailClienteEmpresa;
  
	@JsonProperty("uuidcliente-empresa")
	@Column(name="uuidcliente_empresa",unique=true)
	private String uuidClienteEmpresa;

	@JsonProperty("cnpj")
	@Column(name="cnpj",unique=true)
	 private String cnpj;
	 
	public ClienteEmpresa(Long id, String nome, @Email(message = "Email fora do Padrao !!!") 
	         String email,
			String uuidChave ) {
	
		this.idClienteEmpresa = id;
		this.username = nome;
		this.emailClienteEmpresa = email;
		this.uuidClienteEmpresa = uuidChave;
 	}



 


	@Override
	public String toString() {
		return "ClienteEmpresa [idClienteEmpresa=" + idClienteEmpresa + ", username=" + username
				+ ", emailClienteEmpresa=" + emailClienteEmpresa + ", uuidClienteEmpresa=" + uuidClienteEmpresa
				+ ", cnpj=" + cnpj + "]";
	}






	public Long getIdClienteEmpresa() {
		return idClienteEmpresa;
	}

	public void setIdClienteEmpresa(Long idClienteEmpresa) {
		this.idClienteEmpresa = idClienteEmpresa;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailClienteEmpresa() {
		return emailClienteEmpresa;
	}

	public void setEmailClienteEmpresa(String emailClienteEmpresa) {
		this.emailClienteEmpresa = emailClienteEmpresa;
	}

	public String getUuidClienteEmpresa() {
		return uuidClienteEmpresa;
	}

	public void setUuidClienteEmpresa(String uuidClienteEmpresa) {
		this.uuidClienteEmpresa = uuidClienteEmpresa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
