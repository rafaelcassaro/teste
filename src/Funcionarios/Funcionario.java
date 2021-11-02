package Funcionarios;

public class Funcionario {
	private String login;
	private String senha;
	private String Nome;
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	public void verAta() {
		System.out.println("Ata de numero X");
		string toString() {}
	}


// funcao para adicionar uma sugestao na ata
	public void addSugestao(int estado, String nome) {
		if(estado == 2 && nome == true) {
			System.out.println("Digite um comentario: ");
			
		}
		else {
			System.out.println("Seu nome nao consta na Ata em questao");
		}
	}


}
