package br.com.arq.back.mg;

public class PagSeguroPagamentoMG {

	private String cdata;
	private String currency;
	private String mode;
	private String method;
	private String reference;
	private String email;
	private String cpf;
	private String cnpj;

	public PagSeguroPagamentoMG() {

	}

	public PagSeguroPagamentoMG(String cdata, String currency, String mode, String method, String reference, String email,
			String cpf, String cnpj) {
		super();
		this.cdata = cdata;
		this.currency = currency;
		this.mode = mode;
		this.method = method;
		this.reference = reference;
		this.email = email;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PagSeguroPagamento [cdata=" + cdata + ", currency=" + currency + ", mode=" + mode + ", method=" + method
				+ ", reference=" + reference + ", email=" + email + ", cpf=" + cpf + ", cnpj=" + cnpj + "]";
	}

	public String getCdata() {
		return cdata;
	}

	public void setCdata(String cdata) {
		this.cdata = cdata;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
