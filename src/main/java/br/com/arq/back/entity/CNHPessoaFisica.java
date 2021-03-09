package br.com.arq.back.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idCondutor")
public class CNHPessoaFisica  extends CNHCondutor{
	
     @Column(length=20)
     private String cpf;
     @Column(length=20)
	 private Date dataNascimento;
     
     @OneToOne(mappedBy="pessoaFisica",cascade = CascadeType.ALL)
	 private CNHEndereco endereco;
	  
	 public CNHPessoaFisica() {
	 
	}
	 
	 
	public CNHPessoaFisica(String cpf, Date dataNascimento) {
		super();
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

    
	@Override
	public String toString() {
		return "CNHPessoaFisica [cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	 
	 
	 
	 
	
}