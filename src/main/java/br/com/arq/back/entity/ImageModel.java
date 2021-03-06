package br.com.arq.back.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "image_table")
public class ImageModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonProperty(value = "nomeDocumento")
	@Column(name = "nome_documento")
	private String nomeDocumento;
	@JsonProperty(value = "tipo")
	@Column(name = "tipo")
	private String tipo;
	@Lob
	@Column(name = "imagem")
	private byte[] figuraByte;
	
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "id_cliente", referencedColumnName = "idCliente")
	@JsonBackReference(value="imagem")
	private Cliente cliente;

	public ImageModel() {
	}

	public ImageModel(Long id, String nomeDocumento, String tipo, byte[] figuraByte) {
		super();
		this.id = id;
		this.nomeDocumento = nomeDocumento;
		this.tipo = tipo;
		this.figuraByte = figuraByte;
	}

	@Override
	public String toString() {
		return "ImageModel [id=" + id + ", nomeDocumento=" + nomeDocumento + ", tipo=" + tipo + ", figuraByte="
				+ Arrays.toString(figuraByte) + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDocumento() {
		return nomeDocumento;
	}

	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public byte[] getFiguraByte() {
		return figuraByte;
	}

	public void setFiguraByte(byte[] figuraByte) {
		this.figuraByte = figuraByte;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
