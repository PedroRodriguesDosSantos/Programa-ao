package ExNeps;

import java.util.Scanner;
public class ExFliper {
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	
	// declaração das variaveis
	int p, r;
	
	// Leiura do primeiro valor
	p = ler.nextInt();
	
	// Leitura do segundo valor
	r = ler.nextInt();
	
	// Verificação do Fliper
	if(p==1 && r==0) {
		
		System.out.println("B");
		
		}else if(p==0 && r==0) {
			System.out.println("C");
			
		}else if(p==0 && r==1) {
			System.out.println("C");
			
		}else if(p==1 && r==1) {
			System.out.println("a");		
		}
	
	ler.close();
	}

}
