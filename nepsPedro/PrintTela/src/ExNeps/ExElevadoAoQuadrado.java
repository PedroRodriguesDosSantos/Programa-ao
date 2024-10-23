package ExNeps;

import java.util.Scanner;
public class ExElevadoAoQuadrado {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declaração da variavel
		int l;
		
		// Leitura do valor
		System.out.println();
		l = ler.nextInt();
		
		// Calculo do numero elevado ao quadrado
		l = l*l;
		
		// Apresentação do numero elevado ao quadrado
		System.out.println(l);
	ler.close();	
	}

}
