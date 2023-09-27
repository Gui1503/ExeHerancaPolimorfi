package entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);

	}
	

	@Override
	public void emitirSom() {
		System.out.println("O Preguiça " + getNome() + " com " + getIdade() + " anos " + "Faz:'aaahhhhhhhh'");
	}

	@Override
	public void acao() {
		System.out.println("A Preguiça está subindo em árvores...");

	}

}
