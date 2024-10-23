package ExNeps;

// Importação do Locale 
import java.util.Locale;

// Importação do Scanner
import java.util.Scanner;

public class AprovadoReprovado {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in). useLocale(Locale.US); 
		
		// Declaração das variaveis
		double A, B, mediaA;
		
		// Leitura do primeiro valor
		A = ler.nextDouble();
		
		// Leitura do segundo valor
		B = ler.nextDouble();
		
		// Calculo da media aritmetica
		mediaA = (A + B) / 2;
		
		// Verificação para identificar se o aluno(a) será reprovado ou aprovado ou em recuperação
		if(mediaA >= 7) {
			System.out.println("Aprovado");
		}else if(mediaA < 7 && mediaA >= 4) {
			System.out.println("Recuperacao");
		}else {
			System.out.println("Reprovado");
		}
		ler.close();
		
	}
	

}
