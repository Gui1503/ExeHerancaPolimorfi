package entities;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O Cavalo " + getNome() + " com " + getIdade() + " anos " + "Faz:'ihihihihi'");
	}
	

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo está galopando...");
	}

}
