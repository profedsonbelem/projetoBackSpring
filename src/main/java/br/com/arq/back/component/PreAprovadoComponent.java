package br.com.arq.back.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.arq.back.dto.PreAprovadoDTO;
import br.com.uol.pagseguro.api.preapproval.PreApprovalRegistrationBuilder;

@Component
public class PreAprovadoComponent {
	
	@Autowired
	private RemetenteComponent remetenteComponent;
	
	@Autowired
	private RemessaComponent remessaComponent;
	
	@Autowired
	private RequisicaoPreAprovadoComponent requisicaoPreAprovadoComponent;
	
	 public PreApprovalRegistrationBuilder toPreApprovalRegistrationBuilder(PreAprovadoDTO preAprovado) {
		 return new PreApprovalRegistrationBuilder()
	              .withCurrency(preAprovado.getMoeda())
	              .withExtraAmount(preAprovado.getPrecoExtra())
	              .withReference(preAprovado.getReferencia())
	              .withSender(
	            		  remetenteComponent.toSenderBuilder(preAprovado.getRemetente()))
	              .withShipping(
	            		  remessaComponent.toShippingBuilder(preAprovado.getRemessa()))
	              .withPreApproval(
	            		  requisicaoPreAprovadoComponent.toPreApprovalRequestBuilder(preAprovado.getRequisicao()))
	              .withRedirectURL(preAprovado.getRedirecionaURL())
	              .withNotificationURL(preAprovado.getNotificacaoRL());
	 }
}
