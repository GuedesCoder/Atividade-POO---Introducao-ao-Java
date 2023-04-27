package exercicios01_05_16_21_EC01_EC02;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		mediaDeNotas();
	}

	public static void mediaDeNotas() {

		System.out.println("---Esse programa calcula a média final de um aluno---\n");
		System.out.println("\t\t\tJuliana Camargo\n\t\t\tLeandro Guedes\n\t\t\tAndressa Frischeisen\n\t\t\tWesley Archanjo\n\t\t\t");
		Scanner sc = new Scanner(System.in);

		double nota1 = lerNota(sc, 1);
		double nota2 = lerNota(sc, 2);
		double nota3 = lerNota(sc, 3);
		double media = calculaMediaFinal(nota1, nota2, nota3);
				
		String situacao = verificaNotas(media);
		System.out.printf("\n\t\t\tA Média das notas inseridas é igual a: %.2f%n", media);
		System.out.println("\t\t\tSituação final: " + situacao);

		sc.close();
	}

	public static double lerNota(Scanner sc, int numNota) {
		System.out.printf("\n\t\t\tInforme a nota %d deste aluno: ", numNota);
		double nota = sc.nextDouble();
		if (nota < 0 || nota > 10) {
			System.out.println("\t\t\tNota inválida");
			System.out.printf("\t\t\tDigite uma nota valida: ");
			nota = sc.nextDouble();
		}
		return nota;
	}

	public static double calculaMediaFinal(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static String verificaNotas(double media) {
		String resultado = (media >= 7) ? "O aluno está aprovado!!" : "O aluno está reprovado.";
		return resultado;		
	}
}