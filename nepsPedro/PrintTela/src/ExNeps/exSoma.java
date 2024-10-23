package ExNeps;

import java.util.Scanner;
public class exSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declaração das variaveis
		int a, b, soma;
		
		// Leitura do primeiro valor
		System.out.println();
		a = ler.nextInt();
		
		// Leitura do segundo valor
		System.out.println();
		b = ler.nextInt();
		
		// Calculo da soma dos valores
		soma = a+b;
		
		// Apresentação do calculo da soma
		System.out.println(soma);
		ler.close();
	}

}
