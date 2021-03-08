package br.com.arq.back.designpattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsuarioBuild {

	@SuppressWarnings("unused")
	private static transient SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private final Long id;
	private final String uuidmain;
	private final String username;
	private final java.util.Date dataCadastro;
	private final String password;
	private final String email;
	private final String perfil;
	private final String token;
	private final String status;

	public UsuarioBuild(Long id, String uuidmain, String username, Date dataCadastro, String password, String email,
			String perfil, String token, String status) {
		super();
		this.id = id;
		this.uuidmain = uuidmain;
		this.username = username;
		this.dataCadastro = dataCadastro;
		this.password = password;
		this.email = email;
		this.perfil = perfil;
		this.token = token;
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", uuidmain=" + uuidmain + ", username=" + username + ", dataCadastro="
				+ dataCadastro + ", password=" + password + ", email=" + email + ", perfil=" + perfil + ", token="
				+ token + ", status=" + status + "]";
	}

	public static class Builder {
		private Long id;
		private String username;
		private java.util.Date dataCadastro;
		private String password;
		private String email;
		private String perfil;
		private String token;
		private String status;

		public Builder() {
		}

		public Builder buildUsername(String username) {
			this.username = username;
			return this;
		}

		public Builder buildDataCadastro(java.util.Date dataCadastro) {
			this.dataCadastro = dataCadastro;
			return this;
		}

		public Builder buildPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder buildEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder buildPerfil(String perfil) {
			this.perfil = perfil;
			return this;
		}

		public Builder buildToken(String token) {
			this.token = token;
			return this;
		}

		public String getPerfil() {
			return perfil;
		}

		public String getToken() {
			return token;
		}

		public String getStatus() {
			return status;
		}

		public Builder buildStatus(String status) {
			this.status = status;
			return this;
		}

		public UsuarioBuild build() {
			return new UsuarioBuild(getId(), getUsername(), getUsername(), getDataCadastro(), getPassword(),
					getEmail(), getPerfil(), getToken(), getStatus());
		}

		public String getUsername() {
			return username;
		}

		public java.util.Date getDataCadastro() {
			return dataCadastro;

		}

		public String getPassword() {
			return password;
		}

		public String getEmail() {
			return email;
		}

		public Long getId() {
			return id;
		}

	}

}
