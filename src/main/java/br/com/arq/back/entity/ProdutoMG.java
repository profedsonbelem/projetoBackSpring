package br.com.arq.back.entity;

public class ProdutoMG {
	 
    public int id;
    public String titulo;
    public String desc;
    public String preco;
    public String img;
    public String modelo;
    public String modelo_titulo;
    public int peso;
    
    public ProdutoMG() {
		// TODO Auto-generated constructor stub
	}
    
    
	public ProdutoMG(int id, String titulo, String desc, String preco, String img, String modelo, String modelo_titulo,
			int peso) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desc = desc;
		this.preco = preco;
		this.img = img;
		this.modelo = modelo;
		this.modelo_titulo = modelo_titulo;
		this.peso = peso;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo_titulo() {
		return modelo_titulo;
	}
	public void setModelo_titulo(String modelo_titulo) {
		this.modelo_titulo = modelo_titulo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
    
    
    
    
}
