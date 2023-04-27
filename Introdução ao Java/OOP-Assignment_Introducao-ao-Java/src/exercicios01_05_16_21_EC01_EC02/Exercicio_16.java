package exercicios01_05_16_21_EC01_EC02;

/**
 * 16 – Maria quer saber quantos litros de gasolina precisa colocar em seu carro e quanto
 * vai gastar para fazer uma viagem até a casa de sua irmã.
 * 
 * - Dados extras: Distância da casa de Maria até sua irmã :520 km; 
 * - Seu carro consome um litro a cada 12 Km rodado. 
 * - Ela abastece sempre no mesmo posto, onde o preço da gasolina é R$ 1,50 o litro.
 * 
 * @author Leandro Guedes
 */

public class Exercicio_16 {
	public static void main(String[] args) {
	
		custoDaViagem();		
	}
	
	public static void custoDaViagem() {
		
		int distancia = 520;
		int quantidadeDeLitros;
		double valorGasto;
		double valorDoLitro = 1.50;
		
		quantidadeDeLitros = distancia/12;
		valorGasto = (distancia / 12) * valorDoLitro;
		
		System.out.printf("Considerando que:" + 
		"\nO valor do litro da gasolina é R$ %.2f." + 
		"\nA distancia de Maria até a casa de sua irmã é de %d Kms." + 
		"\nE ainda que seu veículo percorre 12Kms com um litro de gasolina." + 
		"\n\nMaria precisará abastercer o total de %d litros de gasolina em seu carro," + 
		"\ne o valor total gasto por Maria para viajar até a casa de sua irmã será de R$ %.2f.",valorDoLitro, distancia, quantidadeDeLitros,valorGasto);
	}
}
