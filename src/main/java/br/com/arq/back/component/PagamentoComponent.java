package br.com.arq.back.component;

public class PagamentoComponent {
//	
//	private RemetenteComponent remetenteComponent;
//	
//	private RemessaComponent remessaComponent;
//	private ProdutoComponent produtoComponent;
//	
//	public DirectPaymentRegistrationBuilder toDirectPaymentRegistrationBuilder(PagamentoDTO pagamento) {
//			
//		DirectPaymentRegistrationBuilder directPayment = new DirectPaymentRegistrationBuilder()
//				.withPaymentMode("default")
//				.withCurrency(pagamento.getMoeda())
//				.withExtraAmount(pagamento.getPrecoExtra())
//				.withNotificationURL(ConstanteUtil.URL_NOTIFICATION)
//				.withReference(ConstanteUtil.REFERENCE_LIBJAVA)
//				.withSender(
//						remetenteComponent.toSenderBuilder(pagamento.getRemetente()))
//				.withShipping(
//						remessaComponent.toShippingBuilder(pagamento.getRemessa()));
//		          
//		          
//		List<ProdutoDTO> produtos = pagamento.getProdutos();
//  
//		produtos.forEach(p -> {
//			directPayment.addItem(
//					produtoComponent.toPaymentItemBuilder(p));
//		});
//  
//		return directPayment;
//	}

}
