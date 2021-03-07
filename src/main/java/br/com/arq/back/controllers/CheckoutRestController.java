package br.com.arq.back.controllers;

public class CheckoutRestController {

//    @Autowired
//    private CheckoutService checkoutService;
//
//    @Autowired
//    private CheckoutTransparenteService checkoutTransparenteService;
//    
//    @GetMapping(value = "/transacoes/datas")
//    public ResponseEntity<DataList<? extends TransactionSummary>> buscarTransacoesPorDatas(
//    			@RequestParam(value = "dataInicial", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dataInicial,
//    			@RequestParam(value = "dataFinal", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dataFinal
//    		) throws TransacaoAbortadaException {
//    	
//    	DataList<? extends TransactionSummary> listaTransacoes = 
//    			checkoutTransparenteService.buscarTransacoesPorDatas(dataInicial, dataFinal);
//    	return ResponseEntity.status(HttpStatus.OK).body(listaTransacoes);
//    }
//    
//    @GetMapping(value = "/transacao/codigo/{codigo}")
//    public ResponseEntity<TransactionDetail> buscarTransacaoPorCodigo(@PathVariable(value = "codigo") String codigo) throws TransacaoAbortadaException {
//    	TransactionDetail transacao = checkoutTransparenteService.buscarTransacaoPorCodigo(codigo);
//    	return ResponseEntity.status(HttpStatus.OK).body(transacao);
//    }
//    
//    @GetMapping(value = "/transacao/codigoNotificacao/{codigoNotificacao}")
//    public ResponseEntity<TransactionDetail> buscarTransacaoPorCodigoNotificacao(@PathVariable("codigoNotificacao") String codigoNotificacao) throws TransacaoAbortadaException {
//    	TransactionDetail transacao = checkoutTransparenteService.buscarTransacaoPorCodigoNotificacao(codigoNotificacao);
//    	return ResponseEntity.status(HttpStatus.OK).body(transacao);
//    }
//
//    @PostMapping(value = "/register")
//    public ResponseEntity<Void> registrarCheckout(@RequestBody PagamentoDTO pagamento) throws TransacaoAbortadaException {
//        checkoutService.checkoutRegister(pagamento);
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);
//    }
//
//    @PostMapping(value = "/transparente/boleto-bancario", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity realizarTransacaoTransparenteBoletoBancario(@RequestBody PagamentoDTO pagamentoDTO) throws TransacaoAbortadaException {
//        checkoutTransparenteService.criarTransacaoTransparentePorBoletoBancario(pagamentoDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);
//    }
//
//    @PostMapping(value = "/transparente/cartao-credito", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity realizarTransacaoTransparenteCartaoCredito(@RequestBody PagamentoDTO pagamentoDTO) throws TransacaoAbortadaException {
//        checkoutTransparenteService.criarTransacaoTransparentePorCartaoDeCredito(pagamentoDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);
//    }
//
//    @PostMapping(value = "/transparente/debito-online", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity realizarTransacaoTransparenteDebitoOnline(@RequestBody PagamentoDTO pagamentoDTO) throws TransacaoAbortadaException {
//        checkoutTransparenteService.criarTransacaoTransparentePorDebitoOnline(pagamentoDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);
//    }

}
