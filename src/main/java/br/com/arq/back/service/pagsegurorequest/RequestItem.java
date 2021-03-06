package br.com.arq.back.service.pagsegurorequest;

public class RequestItem {
 
        private Long idRequestItem=1L;
        private String id="0001";
        private String description="Notebook Prata";
        private Integer quantity=1;
        private Double amount=10300.00;
        
       	public RequestItem() {
			super();
		}

 
		public RequestItem(Long idRequestItem, String id, String description, Integer quantity, Double amount) {
			super();
			this.idRequestItem = idRequestItem;
			this.id = id;
			this.description = description;
			this.quantity = quantity;
			this.amount = amount;
		}


	 

	 
		@Override
		public String toString() {
			return "RequestItem [idRequestItem=" + idRequestItem + ", id=" + id + ", description=" + description
					+ ", quantity=" + quantity + ", amount=" + amount + "]";
		}


		public Long getIdRequestItem() {
			return idRequestItem;
		}


		public void setIdRequestItem(Long idRequestItem) {
			this.idRequestItem = idRequestItem;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
         
        
        
}
