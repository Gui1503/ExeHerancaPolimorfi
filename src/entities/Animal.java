package entities;

public abstract class Animal {

	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void emitirSom() {

	}

	public abstract void acao();

	{

	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	
	
}
