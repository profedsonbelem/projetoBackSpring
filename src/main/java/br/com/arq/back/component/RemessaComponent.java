package br.com.arq.back.component;

import org.springframework.beans.factory.annotation.Autowired;
 
public class RemessaComponent {
	
	@Autowired 	private EnderecoComponent enderecoComponent;
	
//	public ShippingBuilder toShippingBuilder(RemessaDTO remessa) {
//		return new ShippingBuilder()
//				.withType(remessa.getTipo())
//				.withCost(remessa.getCusto())
//				.withAddress(
//						enderecoComponent.toAddressBuilder(remessa.getEndereco()));
//	}
}
