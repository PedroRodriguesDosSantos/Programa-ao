package ExNeps;
import java.util.Scanner;
public class Bondinho {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		// Declaração das variaveis
		int a, m;
	
		// Leitura do primeiro valor
		a = ler.nextInt();
		
		// Leitura do segundo valor
		m = ler.nextInt();
	
		// Verificação do bondinho
		if(a+m >= 1 && a+m <=50 ) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		
	ler.close();
	}
}
