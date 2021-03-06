package br.com.arq.back.payclients;

public class ApiException extends Exception {
 
	private static final long serialVersionUID = 1L;
	private Object[]dados;
	 
	public ApiException(Object ...dados) {
		this.dados= dados;
	}

	public Object[] getDados() {
		return dados;
	}
 
	
}
