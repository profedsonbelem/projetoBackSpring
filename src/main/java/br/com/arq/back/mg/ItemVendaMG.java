package br.com.arq.back.mg;

public class ItemVendaMG {

	public int idvenda;
	public int item_id;
	public String title;
	public String modelo;
	public String modelo_title;
	public String qtd;
	public String preco;
	public int total;
	public String peso;

	public ItemVendaMG(int idvenda, int item_id, String title, String modelo, String modelo_title, String qtd,
			String preco, int total, String peso) {
		super();
		this.idvenda = idvenda;
		this.item_id = item_id;
		this.title = title;
		this.modelo = modelo;
		this.modelo_title = modelo_title;
		this.qtd = qtd;
		this.preco = preco;
		this.total = total;
		this.peso = peso;
	}

	public ItemVendaMG() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemVendaMG [idvenda=" + idvenda + ", item_id=" + item_id + ", title=" + title + ", modelo=" + modelo
				+ ", modelo_title=" + modelo_title + ", qtd=" + qtd + ", preco=" + preco + ", total=" + total
				+ ", peso=" + peso + "]";
	}

	public int getIdvenda() {
		return idvenda;
	}

	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo_title() {
		return modelo_title;
	}

	public void setModelo_title(String modelo_title) {
		this.modelo_title = modelo_title;
	}

	public String getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}
