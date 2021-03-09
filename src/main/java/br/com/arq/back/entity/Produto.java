package br.com.arq.back.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUTO")
 public class Produto {
	@Id
	@Column(name = "ID_PRODUTO")
	private Long idProduto;
	
	@Column(name = "DESCRICAO_PRODUTO", length = 80)
	private String productDescription;
 
	@Column(name = "VALOR_PRODUTO", precision = 18, scale = 2)
	private BigDecimal productValue;


	@Column(name = "DESCRICAO_PRODUTO_Comercializar")
	private String  ecommerceProductDescription;
	
	@OneToMany(cascade = {}, mappedBy = "produto", fetch = FetchType.LAZY)
	private Set<Promocao> promocoes;
	
	@OneToMany(cascade = {}, mappedBy = "produto", fetch = FetchType.LAZY)
	private Set<Campanha> campanhas;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = true)
//	private Usuario usuario;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_MODIFICACAO")
	private Date modificationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_Create")
	private Date dataCriacao;
	
	public Produto() {
	}
	
	 
	
 

	public Produto(Long idProduto, String productDescription, BigDecimal productValue,
			String ecommerceProductDescription, Set<Promocao> promocoes, Set<Campanha> campanhas,
			Date modificationDate) {
		super();
		this.idProduto = idProduto;
		this.productDescription = productDescription;
		this.productValue = productValue;
		this.ecommerceProductDescription = ecommerceProductDescription;
		this.promocoes = promocoes;
		this.campanhas = campanhas;
		this.modificationDate = modificationDate;
	}





	@Override
	public String toString() {
		return "Product [idProduto=" + idProduto + ", productDescription=" + productDescription + ", productValue="
				+ productValue + ", ecommerceProductDescription=" + ecommerceProductDescription + ", promocoes="
				+ promocoes + ", campanhas=" + campanhas + ", modificationDate=" + modificationDate + "]";
	}





	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getProductValue() {
		return productValue;
	}

	public void setProductValue(BigDecimal productValue) {
		this.productValue = productValue;
	}

	public String getEcommerceProductDescription() {
		return ecommerceProductDescription;
	}

	public void setEcommerceProductDescription(String ecommerceProductDescription) {
		this.ecommerceProductDescription = ecommerceProductDescription;
	}

 
	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

 

 

}
