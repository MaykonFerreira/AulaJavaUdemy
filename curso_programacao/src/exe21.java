import java.util.Locale;
import java.util.Scanner;

public class exe21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um Numero :");
		num = sc.nextInt();		
		if (num>=0) {
			System.out.println("Não Negativo");
		}
		else {
			System.out.println("Negativo");
		}

		sc.close();

	}

}
