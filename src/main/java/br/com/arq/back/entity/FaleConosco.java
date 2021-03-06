package br.com.arq.back.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="faleconosco")
public class FaleConosco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("nome")
	@Column(name="nome")
	private String nome;
	
	@JsonProperty("email")
	@Column(name="email")
	@Email(message="Email fora do Padrao !!!")
	private String email;
	
	@JsonProperty("assunto")
	@Column(name = "assunto")
	private String assunto;
	
	@JsonProperty("comoPodemosAjudar")
	@Column(name = "comoPodemosAjudar")
	private String comoPodemosAjudar;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("datapedido")
	@Column(name = "datapedido")
	private Date dataPedido;

	private String status;

	private String nomeResponsavelResposta;

	{
		this.status = "aberto";
		this.dataPedido = new Date();
	}

	public FaleConosco() {
		// TODO Auto-generated constructor stub
	}

	public FaleConosco(Long id, String nome, String email, String assunto, String comoPodemosAjudar) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.assunto = assunto;
		this.comoPodemosAjudar = comoPodemosAjudar;
	}

	@Override
	public String toString() {
		return "FaleConosco [id=" + id + ", nome=" + nome + ", email=" + email + ", assunto=" + assunto
				+ ", comoPodemosAjudar=" + comoPodemosAjudar + ", dataPedido=" + dataPedido + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getComoPodemosAjudar() {
		return comoPodemosAjudar;
	}

	public void setComoPodemosAjudar(String comoPodemosAjudar) {
		this.comoPodemosAjudar = comoPodemosAjudar;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeResponsavelResposta() {
		return nomeResponsavelResposta;
	}

	public void setNomeResponsavelResposta(String nomeResponsavelResposta) {
		this.nomeResponsavelResposta = nomeResponsavelResposta;
	}

	 
}
