package br.com.arq.back.mg;

public class EnderecoMG {
     
	    private Long id;
	    public String endereco;
	    public String numero;
	    public String bairro;
	    public String cidade;
	    public String estado;
	    public String cep;
	    public String referencia;
	    

		
		
		public EnderecoMG(Long id, String endereco, String numero, String bairro, String cidade, String estado,
				String cep, String referencia) {
			super();
			this.id = id;
			this.endereco = endereco;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.estado = estado;
			this.cep = cep;
			this.referencia = referencia;
		}
		
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getReferencia() {
			return referencia;
		}
		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}
 
	    
	    
}
