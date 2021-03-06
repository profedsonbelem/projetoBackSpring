package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;
import java.util.Date;

public class RequestPayMethod implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	
	private Date datePayMent=new Date("2019-01-29T4:37:00.000-02:00");
	private String code="D58A27DC-E03A-47E5-A20A-63AE1B80C5B6";
    private String reference="REF1234";
    private Integer type=1;
    private Integer status=1;
    private Date lastEventDate=new Date("2019-01-29T14:37:00.000-02:00");
    
    public RequestPayMethod() {
		 
	}
    
    
    
	public RequestPayMethod(Date datePayMent, String code, String reference, Integer type, Integer status,
			Date lastEventDate) {
		super();
		this.datePayMent = datePayMent;
		this.code = code;
		this.reference = reference;
		this.type = type;
		this.status = status;
		this.lastEventDate = lastEventDate;
	}



	@Override
	public String toString() {
		return "RequestPayMethod [datePayMent=" + datePayMent + ", code=" + code + ", reference=" + reference
				+ ", type=" + type + ", status=" + status + ", lastEventDate=" + lastEventDate + "]";
	}



	public Date getDatePayMent() {
		return datePayMent;
	}
	public void setDatePayMent(Date datePayMent) {
		this.datePayMent = datePayMent;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getLastEventDate() {
		return lastEventDate;
	}
	public void setLastEventDate(Date lastEventDate) {
		this.lastEventDate = lastEventDate;
	}
	 
    
    
	
}
