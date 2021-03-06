package br.com.arq.back.mg;

public class VendasMG {
 
	    public int idcliente;
	    public String key;
	    public int active;
	    public String forma_pagto;
	    public String forma_envio;
	    public String valor_envio;
	    public double valor_total;
	    public String status_venda;
	    
	    public VendasMG() {
		}
	    
		public VendasMG(int idcliente, String key, int active, String forma_pagto, String forma_envio,
				String valor_envio, double valor_total, String status_venda) {
			super();
			this.idcliente = idcliente;
			this.key = key;
			this.active = active;
			this.forma_pagto = forma_pagto;
			this.forma_envio = forma_envio;
			this.valor_envio = valor_envio;
			this.valor_total = valor_total;
			this.status_venda = status_venda;
		}





		@Override
		public String toString() {
			return "VendasMG [idcliente=" + idcliente + ", key=" + key + ", active=" + active + ", forma_pagto="
					+ forma_pagto + ", forma_envio=" + forma_envio + ", valor_envio=" + valor_envio + ", valor_total="
					+ valor_total + ", status_venda=" + status_venda + "]";
		}





		public int getIdcliente() {
			return idcliente;
		}
		public void setIdcliente(int idcliente) {
			this.idcliente = idcliente;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public int getActive() {
			return active;
		}
		public void setActive(int active) {
			this.active = active;
		}
		public String getForma_pagto() {
			return forma_pagto;
		}
		public void setForma_pagto(String forma_pagto) {
			this.forma_pagto = forma_pagto;
		}
		public String getForma_envio() {
			return forma_envio;
		}
		public void setForma_envio(String forma_envio) {
			this.forma_envio = forma_envio;
		}
		public String getValor_envio() {
			return valor_envio;
		}
		public void setValor_envio(String valor_envio) {
			this.valor_envio = valor_envio;
		}
		public double getValor_total() {
			return valor_total;
		}
		public void setValor_total(double valor_total) {
			this.valor_total = valor_total;
		}
		public String getStatus_venda() {
			return status_venda;
		}
		public void setStatus_venda(String status_venda) {
			this.status_venda = status_venda;
		}
 
	    
	    
	    
}
