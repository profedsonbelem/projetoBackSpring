package br.com.arq.back.component;

 
//public class ResourceExceptionHandler {
//
//    @ExceptionHandler(TransacaoAbortadaException.class)
//    public ResponseEntity<DetalheErro> handlerTransacaoAbortadaException(
//                    TransacaoAbortadaException exception, HttpServletRequest request) {
//
//        DetalheErro erro = DetalheErroBuilder.getBuilder()
//                .withTitulo("Erro ao realizar Transação")
//                .withStatus(500L)
//                .withData(new Date())
//                .withMensagemDesenvolvedor(exception.getMessage() + " ##### " + request.getRequestURI())
//                .build();
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
//    }
//}
