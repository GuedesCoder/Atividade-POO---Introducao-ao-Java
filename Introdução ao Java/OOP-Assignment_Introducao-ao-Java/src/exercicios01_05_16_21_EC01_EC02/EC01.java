package exercicios01_05_16_21_EC01_EC02;

import java.util.Random;
import java.util.Scanner;

public class EC01 {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Solicita ao usuário o tamanho do vetor
		System.out.print("Digite o tamanho do vetor: ");	
		int tamanho = scanner.nextInt();
		// Cria o vetor com o tamanho informado
		int[] vetor = new int[tamanho];

		// Popula o vetor com valores aleatórios
		Random random = new Random();
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(100); // valores de 0 a 99
		}

		// Encontra o maior valor do vetor
		int maximo = vetor[0];
		for (int i = 1; i < tamanho; i++) {
			if (vetor[i] > maximo) {
				maximo = vetor[i];
			}
		}

		// Mostra o maior valor na tela
		System.out.println("O maior valor no vetor é: " + maximo);
		
		scanner.close();
	}

}
