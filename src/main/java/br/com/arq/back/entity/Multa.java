package br.com.arq.back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "multa")
public class Multa {

	@Id
	private  String codigo;
	@Column
	private String descricao;
	@Column
	private String artigo;
	@Column
	private String responsavel;
	@Column
	private String nivel;
	@Column
	private Integer multa;
	@Column
	private String orgao;
	@Column
 	private Double custo;
	@Column
    private Double 	valor;
    
	public Multa() {
	}
	
	
    
	public Multa(String codigo, String descricao, String artigo, String responsavel, String nivel, Integer multa,
			String orgao, Double custo, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.artigo = artigo;
		this.responsavel = responsavel;
		this.nivel = nivel;
		this.multa = multa;
		this.orgao = orgao;
		this.custo = custo;
		this.valor = valor;
	}

  

	@Override
	public String toString() {
		return "Multa [codigo=" + codigo + ", descricao=" + descricao + ", artigo=" + artigo + ", responsavel="
				+ responsavel + ", nivel=" + nivel + ", mult=" + multa + ", orgao=" + orgao + ", custo=" + custo
				+ ", valor=" + valor + "]";
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getArtigo() {
		return artigo;
	}
	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
 
	public Integer getMulta() {
		return multa;
	}



	public void setMulta(Integer multa) {
		this.multa = multa;
	}



	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
    
    
 	
}
