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

@Entity()
@Table(name = "pagamento")
public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPagamento;

	@Column(length = 255)
	private String multa;

	@Column
	private Double ValorMulta;

	@Column(length = 255)
	private String formaPagamento;

	@Column
	private Double valorPago;

	@Column(length = 255)
	private String informacaoPagamento;

	@Column
	private Boolean pendente;

//	@ManyToOne(cascade = { CascadeType.PERSIST })
//	@JoinColumn(name = "id_aluno", referencedColumnName = "idAluno")
//	@JsonBackReference(value = "alu")
//	private Aluno aluno;

	public Pagamento() {

	}

 
	public Pagamento(Integer idPagamento, String multa, Double valorMulta, String formaPagamento, Double valorPago,
			String informacaoPagamento, Boolean pendente) {
		super();
		this.idPagamento = idPagamento;
		this.multa = multa;
		ValorMulta = valorMulta;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
		this.informacaoPagamento = informacaoPagamento;
		this.pendente = pendente;
	}

	
	

	@Override
	public String toString() {
		return "Pagamento [idPagamento=" + idPagamento + ", multa=" + multa + ", ValorMulta=" + ValorMulta
				+ ", formaPagamento=" + formaPagamento + ", valorPago=" + valorPago + ", informacaoPagamento="
				+ informacaoPagamento + ", pendente=" + pendente + "]";
	}


	public Integer getIdPagamento() {
		return idPagamento;
	}


	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}


	public String getMulta() {
		return multa;
	}


	public void setMulta(String multa) {
		this.multa = multa;
	}


	public Double getValorMulta() {
		return ValorMulta;
	}


	public void setValorMulta(Double valorMulta) {
		ValorMulta = valorMulta;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public Double getValorPago() {
		return valorPago;
	}


	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}


	public String getInformacaoPagamento() {
		return informacaoPagamento;
	}


	public void setInformacaoPagamento(String informacaoPagamento) {
		this.informacaoPagamento = informacaoPagamento;
	}


	public Boolean getPendente() {
		return pendente;
	}


	public void setPendente(Boolean pendente) {
		this.pendente = pendente;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

 
 
}
