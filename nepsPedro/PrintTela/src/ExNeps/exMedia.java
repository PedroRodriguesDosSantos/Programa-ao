package ExNeps;

import java.util.Scanner;
public class exMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declaração das variaveis
		int a, b, media;
		
		// leitura do primeiro valor
		System.out.println();
		a = ler.nextInt();
		
		// Leitura do segundo valor
		System.out.println();
		b = ler.nextInt();
		
		// Calculo da media dos valores
		media = (a+b)/2;
		
		// Apresentação do calculo da media
		System.out.println(media);
	ler.close();	
	}
	
}
