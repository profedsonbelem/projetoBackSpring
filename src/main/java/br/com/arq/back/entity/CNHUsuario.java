package br.com.arq.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import br.com.arq.back.enums.GrupoTypeEnum;
import br.com.arq.back.enums.PrivilegioTypeEnum;

@Entity
@Table(name = "cnhusuario")
public class CNHUsuario implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuariocnh")
	private Long idUsuario;
	@Column(name = "uuid")
	private String uuid;
	@Column(name = "email", length = 50)
	@Email
	private String email;
	@Column(name = "password")
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "tip_grupo")
	private GrupoTypeEnum grupoType;
	@Enumerated(EnumType.STRING)
	@Column(name = "tip_privilegio")
	private PrivilegioTypeEnum privilegioType;

	public CNHUsuario() {

	}

	
  
	public CNHUsuario(Long idUsuario, String uuid, @Email String email, String password, GrupoTypeEnum grupoType,
			PrivilegioTypeEnum privilegioType) {
		super();
		this.idUsuario = idUsuario;
		this.uuid = uuid;
		this.email = email;
		this.password = password;
		this.grupoType = grupoType;
		this.privilegioType = privilegioType;
	}

 


	@Override
	public String toString() {
		return "CNHUsuario [idUsuario=" + idUsuario + ", uuid=" + uuid + ", email=" + email + ", password=" + password
				+ ", grupoType=" + grupoType + ", privilegioType=" + privilegioType + "]";
	}




	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GrupoTypeEnum getGrupoType() {
		return grupoType;
	}

	public void setGrupoType(GrupoTypeEnum grupoType) {
		this.grupoType = grupoType;
	}

	public PrivilegioTypeEnum getPrivilegioType() {
		return privilegioType;
	}

	public void setPrivilegioType(PrivilegioTypeEnum privilegioType) {
		this.privilegioType = privilegioType;
	}

}
