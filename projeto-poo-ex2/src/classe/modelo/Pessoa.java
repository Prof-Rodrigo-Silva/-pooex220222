package classe.modelo;


public class Pessoa {
	
	private String nome, email;
	private long celular, cpf,idt;
	private int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email, long celular, long cpf, long idt, int idade) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
		this.idt = idt;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getIdt() {
		return idt;
	}

	public void setIdt(long idt) {
		this.idt = idt;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	

}
