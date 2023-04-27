package exercicios01_05_16_21_EC01_EC02;

/**
 * 5 – Faça um algoritmo que calcule a soma dos primeiros 50 números pares. -
 * Este algoritmo não recebe valor do teclado. Os primeiros número pares são: 2,
 * 4, 6...
 * 
 * @author Leandro Guedes
 */

public class Exercicio_05 {
	public static void main(String[] args) {
		
		contagemDeNumerosPares();
		
	}
	
	public static void contagemDeNumerosPares() {
		
		int soma = 0;
		int contador = 0;

		System.out.println("Os primeiros 50 números pares são: ");

//Abaixo está sendo iterado um laço for com 10000 números, contudo apenas os 50 primeiros numeros compõem a soma.

		for (int i = 2; i <= 10000 && contador < 50; i += 2) {
			System.out.print(i + "-");
			soma += i;
			contador++;
		}

		System.out.println("\nA soma destes primeiros 50 números pares é: " + soma);
	}
}

