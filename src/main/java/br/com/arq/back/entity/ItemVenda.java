package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

 

@Entity
@Table(name="itemvenda")
public class ItemVenda implements Serializable {
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItemVenda;
	
	@Column(name="quantidade")
	private Integer quantidade;
	@Transient
	@JsonIgnore 
	private transient Double subTotal=0.;
    
	@OneToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO")
	@JsonBackReference(value="product")
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



 



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	} 


}
