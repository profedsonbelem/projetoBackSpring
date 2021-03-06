package br.com.arq.back.util;


import org.springframework.web.client.RestTemplate;

public class PagSeguroIntegration {
 
 

	    private final RestTemplate restTemplate;
	    private final String endpoint;

	    public PagSeguroIntegration(RestTemplate restTemplate,
	                           String endpoint) {
	        this.restTemplate = restTemplate;
	        this.endpoint = endpoint;
	    }
//
//	    public Transaction authorize(TransactionRequest transactionRequest,
//	                                 ZoopParams zoopParams) {
//
//	        RequestEntity<TransactionRequest> requestEntity = RequestEntity.post(
//	            URI.create(ZoopOperation.AUTHORIZATION.uri(urlFor(zoopParams), "")))
//	            .contentType(MediaType.APPLICATION_JSON)
//	            .header(HttpHeaders.AUTHORIZATION, HttpBasic.valueFor(zoopParams.getApiKey(), ""))
//	            .body(transactionRequest);
//
//	        return getRestTemplate()
//	            .exchange(requestEntity, Transaction.class)
//	            .getBody();
//	    }
//
//	    String urlFor(ZoopParams zoopParams) {
//	        return getEndpoint() + "/v1/marketplaces/" + zoopParams.getMarketplaceId();
//	    }
//
//	    public Optional<Transaction> getTransaction(String transactionId, ZoopParams zoopParams) {
//	        return getTransaction(transactionId, zoopParams, Transaction.class);
//	    }
//
//	    public <T> Optional<T> getTransaction(String transactionId, ZoopParams zoopParams, Class<T> returnType) {
//	        try {
//	            RequestEntity<Void> requestEntity = RequestEntity.get(
//	                URI.create(ZoopOperation.GET_TRANSACTION.uri(urlFor(zoopParams), transactionId)))
//	                .header(HttpHeaders.AUTHORIZATION, HttpBasic.valueFor(zoopParams.getApiKey(), ""))
//	                .build();
//	            return Optional.of(getRestTemplate().exchange(requestEntity, returnType).getBody());
//	        } catch (HttpClientErrorException httpE) {
//	            if (httpE.getStatusCode() == HttpStatus.NOT_FOUND) {
//	                return Optional.empty();
//	            }
//	            throw httpE;
//	        }
//	    }
//
//	    public List<JsonNode> getZoopTxByReferenceId(String referenceId, ZoopParams zoopParams) {
//	        String GET_TRANSACTION_BY_REFERENCE_URI = endpoint +
//	            "/v1/marketplaces/" + zoopParams.getMarketplaceId() +
//	                "/transactions?limit=100&sort=time-descending&offset=0&reference_id=" + referenceId;
//
//	        RequestEntity<Void> requestEntity = RequestEntity.get(
//	            URI.create(GET_TRANSACTION_BY_REFERENCE_URI))
//	            .header(HttpHeaders.AUTHORIZATION, HttpBasic.valueFor(zoopParams.getApiKey(), ""))
//	            .build();
//
//	        JsonNode zoopOrderTx = getRestTemplate().exchange(requestEntity, JsonNode.class).getBody();
//
//	        if (zoopOrderTx.get("items").isArray()) {
//	            return StreamSupport.stream(
//	                Spliterators.spliteratorUnknownSize(
//	                    zoopOrderTx.get("items").elements(),
//	                    Spliterator.ORDERED),
//	                false)
//	                .collect(Collectors.toList());
//	        } else {
//	            return Collections.emptyList();
//	        }
//	    }
//
//	    // TODO: migrate to new Zoop API
//	    public Transaction captureTransaction(ZoopParams zoopParams,
//	                                          String transactionId,
//	                                          BigDecimal amount,
//	                                          String onBehalfOf) {
//	        RequestEntity<String> requestEntity = RequestEntity.post(
//	            URI.create(ZoopOperation.CAPTURE.uri(urlFor(zoopParams), transactionId)))
//	            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//	            .header(HttpHeaders.AUTHORIZATION, HttpBasic.valueFor(zoopParams.getApiKey(), ""))
//	            .body(getFormParamsFor(amount, onBehalfOf));
//	        return getRestTemplate()
//	            .exchange(requestEntity, Transaction.class)
//	            .getBody();
//	    }
//
//	    private String getFormParamsFor(BigDecimal amount,
//	                                    String onBehalfOf) {
//	        return String.format("amount=%d&on_behalf_of=%s", fromBigDecimal(amount).toCents(), onBehalfOf);
//	    }
//
//	    // TODO: migrate to new Zoop API
//	    public Transaction voidTransaction(ZoopParams zoopParams,
//	                                       String transactionId,
//	                                       BigDecimal amount,
//	                                       String onBehalfOf) {
//	        RequestEntity<String> requestEntity = RequestEntity.post(
//	            URI.create(ZoopOperation.VOID.uri(urlFor(zoopParams), transactionId)))
//	            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//	            .header(HttpHeaders.AUTHORIZATION, HttpBasic.valueFor(zoopParams.getApiKey(), ""))
//	            .body(getFormParamsFor(amount, onBehalfOf));
//	        return getRestTemplate()
//	            .exchange(requestEntity, Transaction.class)
//	            .getBody();
//	    }
	}
 
