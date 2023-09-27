package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Digite o nome do cachorro: ");
			String nomeCachorro = sc.nextLine();
			int idadeCachorro;

			while (true) {
				System.out.print("Digite a idade do cachorro: ");
				try {
					idadeCachorro = sc.nextInt();
					break; // Sai do loop se a entrada for válida
				} catch (InputMismatchException ex) {
					System.out.println("Erro: Digite um número inteiro.");
					sc.nextLine(); // Limpa o buffer
				}
			}

			System.out.print("Digite o nome do cavalo: ");
			String nomeCavalo = sc.nextLine();
			nomeCavalo = sc.nextLine();
			System.out.print("Digite a idade do cavalo: ");
			int idadeCavalo = sc.nextInt();

			System.out.print("Digite o nome da preguiça: ");
			String nomePreguica = sc.nextLine();
			nomePreguica = sc.nextLine();
			System.out.print("Digite a idade da preguiça: ");
			int idadePreguica = sc.nextInt();

			Animal cachorro = new Cachorro(nomeCachorro, idadeCachorro);
			Animal cavalo = new Cavalo(nomeCavalo, idadeCavalo);
			Animal preguica = new Preguica(nomePreguica, idadePreguica);

			cachorro.emitirSom();
			cavalo.emitirSom();
			preguica.emitirSom();

			cachorro.correr();
			cavalo.correr();

			if (preguica instanceof Preguica) {
				((Preguica) preguica).subirEmArvores();

			}

			sc.close();

		} catch (InputMismatchException e) {
			System.out.println("Erro: Digite um número inteiro.");
		} finally {

		}
	}
}
