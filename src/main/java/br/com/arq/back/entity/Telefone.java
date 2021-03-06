package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name ="telefone")
public class Telefone  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("idTelefone")
	@Column(name = "idTelefone")
	private Integer idTelefone;
	
	
	@Column(name="numero")
	private String numero;
	
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "id_cliente", referencedColumnName = "idCliente")
	@JsonBackReference(value="telefones")
	private Cliente cliente;
	
	
	public Telefone() {
	}
	
	
	public Telefone(Integer idTelefone, String numero) {
		super();
		this.idTelefone = idTelefone;
		this.numero = numero;
	}
	 
 

	public Telefone(Integer idTelefone, String numero, Cliente cliente) {
		super();
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numero=" + numero + ", cliente=" + cliente + "]";
	}


	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
  
}
