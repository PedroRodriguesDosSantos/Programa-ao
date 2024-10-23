package ExNeps;
import java.util.Scanner;
public class CinoEBino {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			// Declaração das variaveis
			int Bino, Cino;
			
			// Leitura do primeiro valor
			Bino = ler.nextInt();
			
			// Leiruta do segundo valor
			Cino = ler.nextInt();
			
			// Verificação para identificar o ganhador
			if((Bino+Cino)%2==0) {
				System.out.println("Bino");
			}else {
				System.out.println("Cino");
			}
			ler.close();
		}
	}
