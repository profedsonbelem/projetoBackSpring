package br.com.arq.back.entity;


 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "enderecocliente")
public class EnderecoCliente  implements java.io.Serializable{

 
	private static final long serialVersionUID = 1L;

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

//	@OneToOne(cascade = { CascadeType.PERSIST })
//	@JoinColumn(name = "id_cliente", referencedColumnName = "idCliente")
//	@JsonBackReference(value="endereco")
//	private Cliente cliente;


	public EnderecoCliente() {
	}

	public EnderecoCliente(Long idEndereco, 	String cep, String logradouro, String complemento,
			   String bairro, String cidade, String estado) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
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

	 
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

 

}
