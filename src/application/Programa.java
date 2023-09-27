package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;
import entities.Veterinario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idadeCachorro = 0;
		int idadeCavalo = 0 ;
		int idadePreguica = 0;
		String nomeCachorro ,nomeCavalo ,nomePreguica;

		try {
			while (true) {
				System.out.print("Digite o nome do cachorro: ");
				nomeCachorro = sc.next();

				if (!(parseIntOrNull(nomeCachorro) == null)) {
					System.out.println("Digite apenas caracteres ");
				} else {
					System.out.print("Digite a idade do cachorro: ");
					idadeCachorro = sc.nextInt();
					break;
				}
			}

			while (true) {
				System.out.print("Digite o nome do cavalo: ");
				nomeCavalo = sc.next();

				if (!(parseIntOrNull(nomeCavalo) == null)) {
					System.out.println("Digite apenas caracteres ");
				} else {
					System.out.print("Digite a idade do cavalo: ");
					idadeCavalo = sc.nextInt();
					break;
				}
			}

			
			while (true) {
				System.out.print("Digite o nome da Preguiça: ");
				nomePreguica = sc.next();

				if (!(parseIntOrNull(nomePreguica) == null)) {
					System.out.println("Digite apenas caracteres ");
				} else {
					System.out.print("Digite a idade da preguiça: ");
					idadePreguica = sc.nextInt();
					break;
				}
			}

			Animal cachorro = new Cachorro(nomeCachorro, idadeCachorro);
			Animal cavalo = new Cavalo(nomeCavalo, idadeCavalo);
			Animal preguica = new Preguica(nomePreguica, idadePreguica);

			Veterinario.examinar(cachorro);
			Veterinario.examinar(cavalo);
			Veterinario.examinar(preguica);

			cachorro.acao();
			cavalo.acao();
			preguica.acao();

			sc.close();

		} catch (InputMismatchException e) {
			System.out.println("Erro: Digite um número inteiro.");

		} finally {

		}

	}

	public static Integer parseIntOrNull(String value) {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
