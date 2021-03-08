package br.com.arq.back.mg;

import io.github.brfreitas.pagseguro.api.application.authorization.AuthorizationRegistration;
import io.github.brfreitas.pagseguro.api.application.authorization.AuthorizationRegistrationBuilder;
import io.github.brfreitas.pagseguro.api.common.domain.PermissionCode;

public class PagSeguroApi {
 
 

		
		
	  public static void main(String[] args) {


	    String appId = "your_app_id";
	    String appKey = "your_app_key";


	    try{

	  //    final PagSeguro pagSeguro = PagSeguro.instance(Credential.applicationCredential(appId,
	  //        appKey), PagSeguroEnv.SANDBOX);

 
	      // Registra as autorizações
	      AuthorizationRegistration authorizationRegistration =
	          new AuthorizationRegistrationBuilder()
	              .withNotificationUrl("www.lojatesteste.com.br/notification")
	              .withReference("REF_001")
	              .withRedirectURL("www.lojatesteste.com.br")
	              .addPermission(PermissionCode.Code.CREATE_CHECKOUTS)
	              .build();

	 //     RegisteredAuthorization ra = pagSeguro.authorizations().register(authorizationRegistration);
	   //   System.out.print(ra);

	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}
 
