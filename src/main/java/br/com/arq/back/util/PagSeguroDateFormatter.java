package br.com.arq.back.util;

 	import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.springframework.util.StringUtils;

	public class PagSeguroDateFormatter implements Serializable {
		private static final long serialVersionUID = 1L;

		private static final ZoneId ZONE_ID = ZoneId.of("America/Sao_Paulo");

	    public static final DateTimeFormatter TRANSACTION = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
	            .withZone(ZONE_ID);

	    public static final DateTimeFormatter WEBHOOK_TRANSACTION = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")
	            .withZone(ZONE_ID);

	    public static final DateTimeFormatter PAGSEGURO_ZONED_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:ss:ssxxx")
	            .withZone(ZoneId.of("UTC"));

	    
	    public static Instant pagSeguroDateToInstant(String pagDate){
	        if (pagDate == null || !StringUtils.hasText(pagDate)){
	            return null;
	        }
	        String normalizedpagDate = normalizeDateString(pagDate);

	        if(normalizedpagDate.length() <= 20)
	            return parseZoopHistoryDate(normalizedpagDate).toInstant(ZoneOffset.UTC);
	        else
	            return parseZoopTransactionOffsetDate(pagDate).toInstant();
	       }
	    
	    

	    private static OffsetDateTime parseZoopTransactionOffsetDate(String content){
	        return OffsetDateTime.parse(content, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
	    }

	    private static LocalDateTime parseZoopHistoryDate(String content) {
	        return LocalDateTime.parse(content, DateTimeFormatter.ISO_DATE_TIME);
	    }

	    private static String normalizeDateString(String pagDate){
	        StringBuilder myString = new StringBuilder(pagDate.trim());

	        myString.setCharAt(10, 'T');
	        if(myString.length() > 19 && Character.isWhitespace(myString.charAt(19))){
	            myString.setCharAt(19,'+');
	        }
	        return myString.toString();
	    }

	}
 
