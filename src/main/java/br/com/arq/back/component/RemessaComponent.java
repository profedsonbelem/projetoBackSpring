package br.com.arq.back.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.arq.back.dto.RemessaDTO;
import br.com.uol.pagseguro.api.common.domain.builder.ShippingBuilder;

@Component
public class RemessaComponent {
	
	@Autowired
	private EnderecoComponent enderecoComponent;
	
	public ShippingBuilder toShippingBuilder(RemessaDTO remessa) {
		return new ShippingBuilder()
				.withType(remessa.getTipo())
				.withCost(remessa.getCusto())
				.withAddress(
						enderecoComponent.toAddressBuilder(remessa.getEndereco()));
	}
}
