package br.com.arq.back.component;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.arq.back.service.exception.TransacaoAbortadaException;
import br.com.arq.back.util.DetalheErro;
import br.com.arq.back.util.DetalheErroBuilder;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(TransacaoAbortadaException.class)
    public ResponseEntity<DetalheErro> handlerTransacaoAbortadaException(
                    TransacaoAbortadaException exception, HttpServletRequest request) {

        DetalheErro erro = DetalheErroBuilder.getBuilder()
                .withTitulo("Erro ao realizar Transação")
                .withStatus(500L)
                .withData(new Date())
                .withMensagemDesenvolvedor(exception.getMessage() + " ##### " + request.getRequestURI())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
