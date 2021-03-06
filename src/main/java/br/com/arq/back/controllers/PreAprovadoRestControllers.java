package br.com.arq.back.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.back.service.exception.TransacaoAbortadaException;
import br.com.uol.pagseguro.api.common.domain.DataList;
import br.com.uol.pagseguro.api.preapproval.search.PreApprovalSummary;

@RestController
@RequestMapping(value = "/pre-aprovado", produces = MediaType.APPLICATION_JSON_VALUE)
public class PreAprovadoRestControllers {

	@Autowired
	private PreAprovadoTransaction preAprovadoTransaction;
	
	@GetMapping(value = "/datas")
	public ResponseEntity<DataList<? extends PreApprovalSummary>> buscarPreAprovadosPorDatas(
				@RequestParam(value = "dataInicial", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dataInicial,
				@RequestParam(value = "dataFinal", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dataFinal
			) throws TransacaoAbortadaException {
		DataList<? extends PreApprovalSummary> preAprovados = preAprovadoTransaction.buscarPreAprovados(dataInicial, dataFinal);
		return ResponseEntity.status(HttpStatus.OK).body(preAprovados);
	}

}
