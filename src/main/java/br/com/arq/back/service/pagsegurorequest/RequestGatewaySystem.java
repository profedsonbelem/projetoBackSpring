package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;

 
public class RequestGatewaySystem implements Serializable{
    
 
	private static final long serialVersionUID = 1L;
	private String type="cielo";  
    private Integer authorizationCode=0;
    private Integer  nsu=0;
    private Integer  tid=0;
    private String establishmentCode="1056784170";
    private String  acquirerName="CIELO";
    
    public RequestGatewaySystem() {
	}
    
    
	public RequestGatewaySystem(String type, Integer authorizationCode, Integer nsu, Integer tid,
			String establishmentCode, String acquirerName) {
		super();
		this.type = type;
		this.authorizationCode = authorizationCode;
		this.nsu = nsu;
		this.tid = tid;
		this.establishmentCode = establishmentCode;
		this.acquirerName = acquirerName;
	}

    

	@Override
	public String toString() {
		return "RequestGatewaySystem [type=" + type + ", authorizationCode=" + authorizationCode + ", nsu=" + nsu
				+ ", tid=" + tid + ", establishmentCode=" + establishmentCode + ", acquirerName=" + acquirerName + "]";
	}


	public void setEstablishmentCode(String establishmentCode) {
		this.establishmentCode = establishmentCode;
	}
	public String getEstablishmentCode() {
		return establishmentCode;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(Integer authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public Integer getNsu() {
		return nsu;
	}
	public void setNsu(Integer nsu) {
		this.nsu = nsu;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
 
	public String getAcquirerName() {
		return acquirerName;
	}
	public void setAcquirerName(String acquirerName) {
		this.acquirerName = acquirerName;
	}
 
}
