package ExNeps;
import java.util.Locale;
import java.util.Scanner;
public class AprovadoReprovado {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in). useLocale(Locale.US); 
		
		double A, B, mediaA;
		
		A = ler.nextDouble();
		
		B = ler.nextDouble();
		
		mediaA = (A + B) / 2;
		
		if(mediaA >= 7) {
			System.out.println("Aprovado");
		}else if(mediaA < 7 && mediaA >= 4) {
			System.out.println("Recuperacao");
		}else {
			System.out.println("Reprovado");
		}
		
		
	}
	

}
