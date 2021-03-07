package br.com.arq.back.servicepayapis;

public class ApiException  extends Exception{
	
	 
	private static final long serialVersionUID = 1L;
	private Object mensagem;
	private Integer numero;
	
	
	ApiException(Integer numero, Object msg){  
		 this.numero = numero;
		 this.mensagem = msg;
	}
	
	public String toString(){
		return this.numero  +","+  this.mensagem;
	}

}
