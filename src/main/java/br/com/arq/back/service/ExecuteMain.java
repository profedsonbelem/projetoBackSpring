package br.com.arq.back.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExecuteMain {

	public static void main(String[] args) {
		try {
	     URL url = new URL("http://example-url");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	        conn.setRequestProperty("Authorization","Bearer "+" Actual bearer token issued by provider.");
	        //e.g. bearer token= eyJhbGciOiXXXzUxMiJ9.eyJzdWIiOiPyc2hhcm1hQHBsdW1zbGljZS5jb206OjE6OjkwIiwiZXhwIjoxNTM3MzQyNTIxLCJpYXQiOjE1MzY3Mzc3MjF9.O33zP2l_0eDNfcqSQz29jUGJC-_THYsXllrmkFnk85dNRbAw66dyEKBP5dVcFUuNTA8zhA83kk3Y41_qZYx43T

	        conn.setRequestProperty("Content-Type","application/json");
	        conn.setRequestMethod("GET");


	        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        String output;

	        StringBuffer response = new StringBuffer();
	        while ((output = in.readLine()) != null) {
	            response.append(output);
	        }

	        in.close();
	        // printing result from response
	        System.out.println("Response:-" + response.toString());
        //post.setHeader(HttpHeaders.CONTENT_TYPE,"appli'	cation/json");
	        //post.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + finalToken);
	    }catch(Exception ex) {
	    	
	    }
	}
	
}
