package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CNHVeiculo implements Serializable {
 
	 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeiculo;
    @Column(length=50)
	private String cpf;
    @Column(length=50)
    private String placa;
    @Column(length=50)
    private String renavan;
    @Column(length=50)
    private String crlvArch;
	@OneToOne
	@JoinColumn(name="idCondutor", referencedColumnName = "idCondutor")
    private CNHPessoaFisica pessoaFisica;
    
    
    public CNHVeiculo() {
	}
    

	public CNHVeiculo(Long idVeiculo, String cpf, String placa, String renavan, 
			String crlvArch) {
		super();
		this.idVeiculo = idVeiculo;
		this.cpf = cpf;
		this.placa = placa;
		this.renavan = renavan;
		this.crlvArch = crlvArch;
	}



	@Override
	public String toString() {
		return "CNHVeiculo [idVeiculo=" + idVeiculo + ", cpf=" + cpf + ", placa=" + placa + ", renavan=" + renavan
				+ ", crlvArch=" + crlvArch + "]";
	}



	public Long getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavan() {
		return renavan;
	}
	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}


	public String getCrlvArch() {
		return crlvArch;
	}


	public void setCrlvArch(String crlvArch) {
		this.crlvArch = crlvArch;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
    

}
