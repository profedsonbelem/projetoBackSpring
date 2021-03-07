package br.com.arq.back.serviceciclico;

import java.time.LocalDateTime;
import java.util.UUID;

import org.dom4j.rule.Rule;


public class CiclicRule extends Rule {

	public String uuid() {

		return UUID.randomUUID().toString();

	}

	public LocalDateTime localDateTime() {
	 
		LocalDateTime DateTime_now = LocalDateTime.now(); 
	 return DateTime_now;
	}

 
 }
