package br.com.arq.back.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.arq.back.dto.PagamentoDTO;
import br.com.arq.back.dto.ProdutoDTO;
import br.com.arq.back.util.ConstanteUtil;
import br.com.uol.pagseguro.api.transaction.register.DirectPaymentRegistrationBuilder;

@Component
public class PagamentoComponent {
	
	@Autowired
	private RemetenteComponent remetenteComponent;
	
	@Autowired
	private RemessaComponent remessaComponent;
	
	@Autowired
	private ProdutoComponent produtoComponent;
	
	public DirectPaymentRegistrationBuilder toDirectPaymentRegistrationBuilder(PagamentoDTO pagamento) {
			
		DirectPaymentRegistrationBuilder directPayment = new DirectPaymentRegistrationBuilder()
				.withPaymentMode("default")
				.withCurrency(pagamento.getMoeda())
				.withExtraAmount(pagamento.getPrecoExtra())
				.withNotificationURL(ConstanteUtil.URL_NOTIFICATION)
				.withReference(ConstanteUtil.REFERENCE_LIBJAVA)
				.withSender(
						remetenteComponent.toSenderBuilder(pagamento.getRemetente()))
				.withShipping(
						remessaComponent.toShippingBuilder(pagamento.getRemessa()));
		          
		          
		List<ProdutoDTO> produtos = pagamento.getProdutos();
  
		produtos.forEach(p -> {
			directPayment.addItem(
					produtoComponent.toPaymentItemBuilder(p));
		});
  
		return directPayment;
	}

}
