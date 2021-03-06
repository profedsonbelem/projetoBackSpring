package br.com.arq.back.component;

import org.springframework.stereotype.Component;

import br.com.arq.back.dto.DocumentoTitularDTO;
import br.com.uol.pagseguro.api.common.domain.builder.DocumentBuilder;

@Component
public class DocumentoTitularComponent {

	public DocumentBuilder toDocumentBuilder(DocumentoTitularDTO documento) {
		return new DocumentBuilder()
				.withType(documento.getTipo())
				.withValue(documento.getValor());
	}
}
