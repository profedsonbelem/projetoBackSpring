package br.com.arq.back.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.arq.back.dto.CartaoCreditoDTO;
import br.com.uol.pagseguro.api.common.domain.builder.CreditCardBuilder;

@Component
public class CartaoCreditoComponent {
	
	@Autowired
	private EnderecoComponent enderecoComponent;
	
	@Autowired
	private TitularComponent titularComponent;
	
	@Autowired
	private PrestacaoComponent prestacaoComponent;

	public CreditCardBuilder toCreditCardBuilder(CartaoCreditoDTO cartaoCredito) {
		return new CreditCardBuilder()
				.withBillingAddress(
						enderecoComponent.toAddressBuilder(cartaoCredito.getEnderecoCobranca()))
				.withInstallment(
						prestacaoComponent.toInstallmentBuilder(cartaoCredito.getPrestacao()))
				.withHolder(
						titularComponent.toHolderBuilder(cartaoCredito.getTitular()))
				.withToken("token");
	}
}
