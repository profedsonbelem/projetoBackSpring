package br.com.arq.back.mg;

import java.util.Arrays;
import java.util.List;

public class WooCommerceMG {

	
	 private Integer id;
	 private String typePayament;
	 private String pluginPagamento;
	 
	 public static List<WooCommerceMG> LISTAWOOCOMMERCE=   Arrays.asList(
			  new WooCommerceMG(1, "Credit Card", "woocommerce-pagseguro"),
			  new WooCommerceMG(2, "Billet", "woocommerce-pagseguro"),       
			  new WooCommerceMG(3, "PagSeguro credit", "woocommerce-pagseguro") ) ;


		public WooCommerceMG(Integer id, String typePayament, String pluginPagamento) {
			super();
			this.id = id;
			this.typePayament = typePayament;
			this.pluginPagamento = pluginPagamento;
		}



		public void setTypePayament(String typePayament) {
			this.typePayament = typePayament;
		}
		
		public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTypePayament() {
		return typePayament;
	}

	public WooCommerceMG() {
		// TODO Auto-generated constructor stub
	}
	
	





	public String getPluginPagamento() {
		return pluginPagamento;
	}



	public void setPluginPagamento(String pluginPagamento) {
		this.pluginPagamento = pluginPagamento;
	}



}
