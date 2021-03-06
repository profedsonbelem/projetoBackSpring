package br.com.arq.back.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientegeral")
public class ClienteGeral {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long idCliente;
    private String nomeCliente;
    @Column(length=250, unique=true)
    private String email;
    private  Date dataNascimento ;
    @Column(length=250, unique=true)
    private String cnh;

    
    private Date dataEmissao;
    private String infracao;
    private String pontosInfracao;
    private String detalhesInfracao;
    private String telefoneContato;
    private String celular;
    private String detalhesRelevantesLocalizacao;
    private String detalhesRelavantesDiaHoraFuncionamentoNoEndereco;
    private String detalhesRelavantesCuidadoDaPista ;
    private String oqueFoiIgnorado;
    private String suaObservacaoDetalhada;
    
    public ClienteGeral() {
		// TODO Auto-generated constructor stub
	}
    
    
    
	public ClienteGeral(Long idCliente, String nomeCliente, String email, Date dataNascimento, String cnh,
			Date dataEmissao, String infracao, String pontosInfracao, String detalhesInfracao, String telefoneContato,
			String celular, String detalhesRelevantesLocalizacao,
			String detalhesRelavantesDiaHoraFuncionamentoNoEndereco, 
			String detalhesRelavantesCuidadoDaPista,
			String oqueFoiIgnorado, String suaObservacaoDetalhada) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cnh = cnh;
		this.dataEmissao = dataEmissao;
		this.infracao = infracao;
		this.pontosInfracao = pontosInfracao;
		this.detalhesInfracao = detalhesInfracao;
		this.telefoneContato = telefoneContato;
		this.celular = celular;
		this.detalhesRelevantesLocalizacao = detalhesRelevantesLocalizacao;
		this.detalhesRelavantesDiaHoraFuncionamentoNoEndereco = detalhesRelavantesDiaHoraFuncionamentoNoEndereco;
		this.detalhesRelavantesCuidadoDaPista = detalhesRelavantesCuidadoDaPista;
		this.oqueFoiIgnorado = oqueFoiIgnorado;
		this.suaObservacaoDetalhada = suaObservacaoDetalhada;
	}

    

	@Override
	public String toString() {
		return "ClienteCnh [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", cnh=" + cnh + ", dataEmissao=" + dataEmissao + ", infracao="
				+ infracao + ", pontosInfracao=" + pontosInfracao + ", detalhesInfracao=" + detalhesInfracao
				+ ", telefoneContato=" + telefoneContato + ", celular=" + celular + ", detalhesRelevantesLocalizacao="
				+ detalhesRelevantesLocalizacao + ", detalhesRelavantesDiaHoraFuncionamentoNoEndereco="
				+ detalhesRelavantesDiaHoraFuncionamentoNoEndereco + ", detalhesRelavantesCuidadoDaPista="
				+ detalhesRelavantesCuidadoDaPista + ", oqueFoiIgnorado=" + oqueFoiIgnorado
				+ ", suaObservacaoDetalhada=" + suaObservacaoDetalhada + "]";
	}



 
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getInfracao() {
		return infracao;
	}
	public void setInfracao(String infracao) {
		this.infracao = infracao;
	}
	public String getPontosInfracao() {
		return pontosInfracao;
	}
	public void setPontosInfracao(String pontosInfracao) {
		this.pontosInfracao = pontosInfracao;
	}
	public String getDetalhesInfracao() {
		return detalhesInfracao;
	}
	public void setDetalhesInfracao(String detalhesInfracao) {
		this.detalhesInfracao = detalhesInfracao;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDetalhesRelevantesLocalizacao() {
		return detalhesRelevantesLocalizacao;
	}
	public void setDetalhesRelevantesLocalizacao(String detalhesRelevantesLocalizacao) {
		this.detalhesRelevantesLocalizacao = detalhesRelevantesLocalizacao;
	}
	public String getDetalhesRelavantesDiaHoraFuncionamentoNoEndereco() {
		return detalhesRelavantesDiaHoraFuncionamentoNoEndereco;
	}
	public void setDetalhesRelavantesDiaHoraFuncionamentoNoEndereco(
			String detalhesRelavantesDiaHoraFuncionamentoNoEndereco) {
		this.detalhesRelavantesDiaHoraFuncionamentoNoEndereco = detalhesRelavantesDiaHoraFuncionamentoNoEndereco;
	}
	public String getDetalhesRelavantesCuidadoDaPista() {
		return detalhesRelavantesCuidadoDaPista;
	}
	public void setDetalhesRelavantesCuidadoDaPista(String detalhesRelavantesCuidadoDaPista) {
		this.detalhesRelavantesCuidadoDaPista = detalhesRelavantesCuidadoDaPista;
	}
	public String getOqueFoiIgnorado() {
		return oqueFoiIgnorado;
	}
	public void setOqueFoiIgnorado(String oqueFoiIgnorado) {
		this.oqueFoiIgnorado = oqueFoiIgnorado;
	}
	public String getSuaObservacaoDetalhada() {
		return suaObservacaoDetalhada;
	}
	public void setSuaObservacaoDetalhada(String suaObservacaoDetalhada) {
		this.suaObservacaoDetalhada = suaObservacaoDetalhada;
	}

	public  Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}



}
