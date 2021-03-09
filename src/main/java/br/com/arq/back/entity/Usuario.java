package br.com.arq.back.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@Transient
	private static transient SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@Column(name = "uuidmain", length = 250)
	private String uuidmain;

	@JsonProperty("username")
	@Column(name = "username")
	private String username;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("datacadastro")
	@Column(name = "datacadastro")
	private java.util.Date dataCadastro;

	@JsonProperty("passwordInitial")
	@Column(name = "passwordInitial")
	private String passwordInitial;

	@JsonProperty("password")
	@Column(name = "password")
	private String password;

	@JsonProperty("email")
	@Column(name = "email")
	private String email;

	@JsonProperty("perfil")
	@Column(name = "perfil")
	private String perfil;

	@JsonProperty("nivel")
	@Column(name = "nivel")
	private Integer nivel;

	@JsonProperty("token")
	@Column(name = "token")
	private String token;

	@JsonProperty("status")
	@Column(name = "status")
	private String statusUsuario;

 
	
	{
		this.dataCadastro = new Date();
		this.token = "token";
		this.perfil = "usuario";
		this.statusUsuario = "ativo";
		this.uuidmain = UUID.randomUUID().toString();
		this.passwordInitial = "password";
	}

	public Usuario() {
		this.dataCadastro = new Date();
	}

	public Usuario(Long id, String uuidmain, String username, Date dataCadastro, String passwordInitial,
			String password, String email, String perfil, Integer nivel, String token, String statusUsuario) {
		super();
		this.idUsuario = id;
		this.uuidmain = uuidmain;
		this.username = username;
		this.dataCadastro = dataCadastro;
		this.passwordInitial = passwordInitial;
		this.password = password;
		this.email = email;
		this.perfil = perfil;
		this.nivel = nivel;
		this.token = token;
		this.statusUsuario = statusUsuario;
		this.gerenciarPerfil();
	}

	public Usuario(String uuidmain, String username, String passwordInital, String password,
			@Email(message = "Email fora do Padrao !!!") String email) {
		super();
		this.uuidmain = uuidmain;
		this.username = username;
		this.passwordInitial = passwordInital;
		this.password = password;
		this.email = email;
		this.gerenciarPerfil();

	}

	public Usuario(String email, String password) {
		this.password = password;
		this.email = email;

		this.gerenciarPerfil();
	}

	public void gerenciarPerfil() {
		if (this.getEmail().equalsIgnoreCase("admin@gmail.com")
				|| this.getEmail().equalsIgnoreCase("felipe01cnh@gmail.com")) {
			this.perfil = "admin";
			this.nivel=1;
		} else {
			this.perfil = "user";
			this.nivel=1;
		}

	}

 

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", uuidmain=" + uuidmain + ", username=" + username
				+ ", dataCadastro=" + dataCadastro + ", passwordInitial=" + passwordInitial + ", password=" + password
				+ ", email=" + email + ", perfil=" + perfil + ", nivel=" + nivel + ", token=" + token
				+ ", statusUsuario=" + statusUsuario + ", products=" + "]";
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Usuario.sdf = sdf;
	}

	public String resp() {
		return uuidmain;
	}

	public void setUuidmain(String uuidmain) {
		this.uuidmain = uuidmain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatusUsuario() {
		return statusUsuario;
	}

 

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.util.Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(java.util.Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

	public String getPasswordInitial() {
		return passwordInitial;
	}

	public void setPasswordInitial(String passwordInitial) {
		this.passwordInitial = passwordInitial;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
 
	public String getUuidmain() {
		return uuidmain;
	}

 
	
	
}
