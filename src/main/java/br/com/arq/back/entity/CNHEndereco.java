package br.com.arq.back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CNHEndereco {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;

	@Column(length = 255)
	private String logradouro;

	@Column(length = 255)
	private String complemento;

	@Column(length = 255)
	private String bairro;

	@Column(length = 255)
	private String cidade;

	@Column(length = 255)
	private String estado;

	@Column(length = 10)
	private String cep;
 
	@OneToOne
	@JoinColumn(name="idCondutor", referencedColumnName = "idCondutor")
    private CNHPessoaFisica pessoaFisica;
	
	@OneToOne
	@JoinColumn()
	private CNHInfracao infracao;
	
	
	public CNHEndereco(Long idEndereco, String logradouro, String complemento, String bairro, String cidade,
			String estado, String cep, CNHPessoaFisica pessoaFisica) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.pessoaFisica = pessoaFisica;
	}

	public CNHEndereco() {
	}
	
	
	@Override
	public String toString() {
		return "CNHEndereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", pessoaFisica=" + pessoaFisica + "]";
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public CNHPessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(CNHPessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}


	
	
}
