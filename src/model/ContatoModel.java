package model;

public class ContatoModel {

	private String nome, sobrenome;
	private String empresa;
	private String email;
	private String numero;
	private String tipotelefone;
	
	public ContatoModel(){
		
	}
	
	public ContatoModel(String nome, String sobrenome, String empresa, String email, String numero,
			String tipotelefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.empresa = empresa;
		this.email = email;
		this.numero = numero;
		this.tipotelefone = tipotelefone;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipotelefone() {
		return tipotelefone;
	}
	public void setTipotelefone(String tipotelefone) {
		this.tipotelefone = tipotelefone;
	}
	
	public boolean salvarContato() {
		return true;
	}
	
	public boolean alterarContato() {
		return true;
	}
	
	public boolean excluirContato() {
		return true;
	}
}
