package br.com.arq.back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


 
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class CNHCondutor  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCondutor")
	private long idCondutor;
	@Column(length=250)
	private String Uuid;
	@Column(length=50)
	private String nome;
	@Column(length=50)
	private String cnh;
    @Column(length=100)
	private String primeiraCNG;
	@Column(length=250)
    private String CNH_ARCH;
	
	public CNHCondutor() {
	}
	
	

	public CNHCondutor(long idCondutor, String uuid, String cnh, String primeiraCNG, String cNH_ARCH) {
		super();
		this.idCondutor = idCondutor;
		Uuid = uuid;
		this.cnh = cnh;
		this.primeiraCNG = primeiraCNG;
		CNH_ARCH = cNH_ARCH;
	}



	@Override
	public String toString() {
		return "CNHCondutor [id_condutor=" + idCondutor + ", Uuid=" + Uuid + ", cnh=" + cnh + ", primeiraCNG="
				+ primeiraCNG + ", CNH_ARCH=" + CNH_ARCH + "]";
	}



	public long getIdCondutor() {
		return idCondutor;
	}

	public void setIdCondutor(long idCondutor) {
		this.idCondutor = idCondutor;
	}

	public String getUuid() {
		return Uuid;
	}

	public void setUuid(String uuid) {
		Uuid = uuid;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPrimeiraCNG() {
		return primeiraCNG;
	}

	public void setPrimeiraCNG(String primeiraCNG) {
		this.primeiraCNG = primeiraCNG;
	}

	public String getCNH_ARCH() {
		return CNH_ARCH;
	}

	public void setCNH_ARCH(String cNH_ARCH) {
		CNH_ARCH = cNH_ARCH;
	}

}
