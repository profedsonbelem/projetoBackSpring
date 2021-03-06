package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="negociacao")
public class Negociacao implements Serializable {

 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long idNegociacao;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name="datahora")
	private java.util.Date dataHora;
	@Column
	private Double  valorFinal=0.;
    
	@Column
	private String uuidNegociacao;
	
	 @Column
     private Integer quantidadeParcelas;
    
	@Column
    private Double valorParcelado;
	
    @Column
    private Double valorEntrada;
    
    @Column
    private java.util.Date dataPagamentoParcela;
    
    
	@OneToOne()
	@JoinColumn(name="id_cliente", referencedColumnName = "idcliente")
	private Cliente cliente;
	 
	public Negociacao() {
	}


	 

	public Negociacao(Long idNegociacao, String uuidNegociacao ) {
		super();
		this.idNegociacao = idNegociacao;
		this.uuidNegociacao = uuidNegociacao;
	}


   



	@Override
	public String toString() {
		return "Negociacao [idNegociacao=" + idNegociacao + ", dataHora=" + dataHora + ", valorFinal=" + valorFinal
				+ ", uuidNegociacao=" + uuidNegociacao + ", quantidadeParcelas=" + quantidadeParcelas
				+ ", valorParcelado=" + valorParcelado + ", valorEntrada=" + valorEntrada + ", dataPagamentoParcela="
				+ dataPagamentoParcela + ", cliente=" + cliente + "]";
	}




	public java.util.Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(java.util.Date dataHora) {
		this.dataHora = dataHora;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

 

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Long getIdNegociacao() {
		return idNegociacao;
	}



	public void setIdNegociacao(Long idNegociacao) {
		this.idNegociacao = idNegociacao;
	}



	public String getUuidNegociacao() {
		return uuidNegociacao;
	}



	public void setUuidNegociacao(String uuidNegociacao) {
		this.uuidNegociacao = uuidNegociacao;
	}




	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}




	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}




	public Double getValorParcelado() {
		return valorParcelado;
	}




	public void setValorParcelado(Double valorParcelado) {
		this.valorParcelado = valorParcelado;
	}




	public Double getValorEntrada() {
		return valorEntrada;
	}




	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}




	public java.util.Date getDataPagamentoParcela() {
		return dataPagamentoParcela;
	}




	public void setDataPagamentoParcela(java.util.Date dataPagamentoParcela) {
		this.dataPagamentoParcela = dataPagamentoParcela;
	}



	
	
	
}
