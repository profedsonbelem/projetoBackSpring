package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cnhinfracao")
public class CNHInfracao implements Serializable {

 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInfracao;
	@Column(length=50)
	private String idAtuacao;
	@Column(length=50)
	private String reaninf;
	@Column(length=50)
	private String enquadramento;
	private String cnhEndereco;
    private String placa;
    private Double valor;
    private String orgaoEmissao;
    private String agenteEmissao;
    private String sicop;
    private String inkSikope;
    private String reciboArch;
    
    public CNHInfracao() {
	 
	}
    
    
   


	public CNHInfracao(Long idInfracao, String idAtuacao, String reaninf, String enquadramento, String cnhEndereco,
			String placa, Double valor, String orgaoEmissao, String agenteEmissao, String sicop, String inkSikope,
			String reciboArch) {
		super();
		this.idInfracao = idInfracao;
		this.idAtuacao = idAtuacao;
		this.reaninf = reaninf;
		this.enquadramento = enquadramento;
		this.cnhEndereco = cnhEndereco;
		this.placa = placa;
		this.valor = valor;
		this.orgaoEmissao = orgaoEmissao;
		this.agenteEmissao = agenteEmissao;
		this.sicop = sicop;
		this.inkSikope = inkSikope;
		this.reciboArch = reciboArch;
	}



	@Override
	public String toString() {
		return "CNHInfracao [idInfracao=" + idInfracao + ", idAtuacao=" + idAtuacao + ", reaninf=" + reaninf
				+ ", enquadramento=" + enquadramento + ", cnhEndereco=" + cnhEndereco + ", placa=" + placa + ", valor="
				+ valor + ", orgaoEmissao=" + orgaoEmissao + ", agenteEmissao=" + agenteEmissao + ", sicop=" + sicop
				+ ", inkSikope=" + inkSikope + ", reciboArch=" + reciboArch + "]";
	}



	public Long getIdInfracao() {
		return idInfracao;
	}
	public void setIdInfracao(Long idInfracao) {
		this.idInfracao = idInfracao;
	}
	public String getIdAtuacao() {
		return idAtuacao;
	}
	public void setIdAtuacao(String idAtuacao) {
		this.idAtuacao = idAtuacao;
	}
	public String getReaninf() {
		return reaninf;
	}
	public void setReaninf(String reaninf) {
		this.reaninf = reaninf;
	}
	public String getEnquadramento() {
		return enquadramento;
	}
	public void setEnquadramento(String enquadramento) {
		this.enquadramento = enquadramento;
	}
 
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOrgaoEmissao() {
		return orgaoEmissao;
	}
	public void setOrgaoEmissao(String orgaoEmissao) {
		this.orgaoEmissao = orgaoEmissao;
	}
	public String getAgenteEmissao() {
		return agenteEmissao;
	}
	public void setAgenteEmissao(String agenteEmissao) {
		this.agenteEmissao = agenteEmissao;
	}
	public String getSicop() {
		return sicop;
	}
	public void setSicop(String sicop) {
		this.sicop = sicop;
	}
	public String getInkSikope() {
		return inkSikope;
	}
	public void setInkSikope(String inkSikope) {
		this.inkSikope = inkSikope;
	}
	public String getReciboArch() {
		return reciboArch;
	}
	public void setReciboArch(String reciboArch) {
		this.reciboArch = reciboArch;
	}
    
    
    
	
}
