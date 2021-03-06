package br.com.arq.back.entity;

import java.io.Serializable;
 

//@Entity
//@Table(name="produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="idProduto")
	//@JsonProperty("idproduto")
	private Long idProduto;
	
	//@Column(name="nomeproduto")
	//@JsonProperty(value="nomeproduto")
	private String nomeProduto;
	
	
	//@Column(name="precoproduto")
	//@JsonProperty(value="precoProduto")
	private Double precoProduto;
	
	//@Column(name="nomeproduto_negociado")
	//@JsonProperty(value="precoproduto-negociado")
	private Double precoProdutoNegociado;
 
	//@Column(columnDefinition =" enum ('sim','nao')")
	//@JsonProperty(value="escolhanegocio")
	private String escolhaNegocio;
	
	//@OneToOne(mappedBy="produto",cascade= {CascadeType.ALL})
	private ItemVenda item;
	
	
	public Produto() {
	}
	
	 
	{
		this.precoProduto=0.;
		this.precoProdutoNegociado =0.;
	}
 

	public Produto(Long idProduto, String nomeProduto, Double precoProduto, Double precoProdutoNegociado,
			String escolhaNegocio) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.precoProdutoNegociado= precoProdutoNegociado;
		this.escolhaNegocio = escolhaNegocio;
	}





	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto
				+ ", precoProdutoDetalhe=" + precoProdutoNegociado + "]";
	}


	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoPRoduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Double getPrecoProdutoNegociado() {
		return precoProdutoNegociado;
	}


	public void setPrecoProdutoNegociado(Double precoProdutoNegociado) {
		this.precoProdutoNegociado = precoProdutoNegociado;
	}


	public String getEscolhaNegocio() {
		return escolhaNegocio;
	}


	public void setEscolhaNegocio(String escolhaNegocio) {
		this.escolhaNegocio = escolhaNegocio;
	}


	public ItemVenda getItem() {
		return item;
	}


	public void setItem(ItemVenda item) {
		this.item = item;
	}


	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Double gerarNegocio() {
		if (this.escolhaNegocio.equals("sim")) {
		return	this.precoProdutoNegociado;
		}else {
		return this.precoProduto;	
		}
	}
	
	
	
}
