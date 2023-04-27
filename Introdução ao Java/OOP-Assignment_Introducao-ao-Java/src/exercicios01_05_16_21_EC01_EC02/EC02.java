package exercicios01_05_16_21_EC01_EC02;

import java.util.Random;
import java.util.Scanner;

public class EC02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário o tamanho da matriz
		System.out.print("Digite o número de linhas da matriz: ");
		int linhas = scanner.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int colunas = scanner.nextInt();

		// Cria a matriz com as dimensões informadas
		int[][] matriz = new int[linhas][colunas];

		// Popula a matriz com valores aleatórios
		Random random = new Random();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = random.nextInt(100); // valores de 0 a 99
			}
		}

		// Encontra o menor valor da matriz
		int minimo = matriz[0][0];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] < minimo) {
					minimo = matriz[i][j];
				}
			}
		}

		// Mostra o menor valor na tela
		System.out.println("O menor valor na matriz é: " + minimo);

		scanner.close();
	}
}
