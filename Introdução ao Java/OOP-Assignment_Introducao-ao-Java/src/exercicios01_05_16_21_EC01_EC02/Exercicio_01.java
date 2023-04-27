package exercicios01_05_16_21_EC01_EC02;

import java.util.Scanner;

/**
 * 1 – Faça um algoritmo que receba a idade e o peso de 7 pessoas, calcule e * mostre:
 * 	- A quantidade de pessoas com mais de 90 quilos;
 *	- A média das idades das 7 pessoas.
 *
 * @author Leandro Guedes
 */

public class Exercicio_01 {
	
	public static void main(String[] args) {
		receberDados();
	}
	
	public static void receberDados() {
		Scanner entradaDoUsuario = new Scanner(System.in);

		int idade;
		int pesoDoIndividuo = 0;
		int idades = 0;
		double peso;

		for (int i = 1; i <= 7; i++) {
			System.out.printf("Informe a idade da %dª pessoa: ", i);
			idade = entradaDoUsuario.nextInt();

			System.out.printf("Informe o peso da %dª pessoa: ", i);
			peso = entradaDoUsuario.nextDouble();

			idades += idade;

			if (peso > 90) {
				pesoDoIndividuo++;
			}
		}

		double mediaIdades = idades / 7.0;

		System.out.println("Quantidade de pessoas com mais de 90kg: " + pesoDoIndividuo);
		System.out.printf("Média das idades: %.1f anos.\n", mediaIdades);
		
		entradaDoUsuario.close();
	}
}