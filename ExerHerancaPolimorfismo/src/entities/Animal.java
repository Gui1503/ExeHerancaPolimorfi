package entities;

public class Animal {

	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void emitirSom() {
		System.out.println("O animal emit um som.");
	}

	public void correr() {
		System.out.println("O animal está correndo.");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}


