import java.util.Locale;
import java.util.Scanner;

public class exe24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int hrI,hrF;
		System.out.println("Digite a Hora Inicial e Final :");
		hrI = sc.nextInt();
		hrF = sc.nextInt();
		
		if (hrI > hrF ) {
			System.out.println("O Jogo Durou " + ((24-hrI)+hrF)  + " Horas");
		    }
		else if (hrI == hrF) {
			     System.out.println("O Jogo Durou 24 Horas");
		     }
		else {
			System.out.println("O Jogo Durou " + (hrF-hrI)  + " Horas");
		}
		//}
		
		sc.close();

	}

}
