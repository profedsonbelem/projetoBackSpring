package br.com.arq.back.mg;

public class UsuarioMG {
	public int id;
    public String nome;
    public String sobrenome;
    public String email;
    public String cpf;
    public String fone;
    public String fone_cod;
    public EnderecoMG enderecoMG;
    
    
    public UsuarioMG() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    
	@Override
	public String toString() {
		return "UsuarioMG [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", cpf="
				+ cpf + ", fone=" + fone + ", fone_cod=" + fone_cod + ", enderecoMG=" + enderecoMG + "]";
	}




	public UsuarioMG(int id, String nome, String sobrenome, String email, String cpf, String fone, String fone_cod,
			EnderecoMG enderecoMG) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.fone = fone;
		this.fone_cod = fone_cod;
		this.enderecoMG = enderecoMG;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getFone_cod() {
		return fone_cod;
	}
	public void setFone_cod(String fone_cod) {
		this.fone_cod = fone_cod;
	}
	public EnderecoMG getEnderecoMG() {
		return enderecoMG;
	}
	public void setEnderecoMG(EnderecoMG enderecoMG) {
		this.enderecoMG = enderecoMG;
	}
    
    
    
    
    
}
