package entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("O Cachorro " + getNome() + " com " + getIdade() + " anos " + "Faz:'au au'");
	}
	

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cachorro está correndo...");
	}

}

