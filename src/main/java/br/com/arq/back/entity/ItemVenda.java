package br.com.arq.back.entity;

import java.io.Serializable;

 

//@Entity
//@Table(name="itemvenda")
public class ItemVenda implements Serializable {
 
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItemVenda;
	
	//@Column(name="quantidade")
	private Integer quantidade;
	
//	@Transient
//	@JsonIgnore 
	private transient Double subTotal=0.;
    
	//@OneToOne(cascade = { CascadeType.PERSIST })
	////@JoinColumn(name = "id_produto", referencedColumnName = "idProduto")
	//@JsonBackReference(value="produto")
 	private Produto produto;
	
	
	public ItemVenda() {
	}
	
 

	public ItemVenda(Long idItemVenda, Integer quantidade) {
		this.idItemVenda = idItemVenda;
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		return "ItemVenda [idItemVenda=" + idItemVenda + ", quantidade=" + quantidade + ", subTotal=" + subTotal + "]";
	}



	public Long getIdItemVenda() {
		return idItemVenda;
	}

	public void setIdItemVenda(Long idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	} 
	
	public void gerarSubTotal(Produto prod) {
		this.subTotal = prod.gerarNegocio() * this.quantidade;
	}
	
	
	
	
	
	

}
