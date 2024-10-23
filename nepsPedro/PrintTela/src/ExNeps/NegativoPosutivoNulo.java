package ExNeps;
import java.util.Scanner;
public class NegativoPosutivoNulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declaração da variavel
		int x;
		
		// Leitura da variavel
		x = ler.nextInt();
		
		// Verificação para ver se é negativo ou positivo
		if(x>0) {
			System.out.println("positivo");
		}else if(x<0) {
			System.out.println("negativo");
		}else {
			System.out.println("nulo");
		}
		
		ler.close();
	}
	

}
