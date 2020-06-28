import java.util.Locale;
import java.util.Scanner;

public class exe29 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos;
		double conta = 50.00;
		
		System.out.println("Digite a Quantidade de Minutos :");
		minutos = sc.nextInt();
		if (minutos > 100 ) {
			conta += ((minutos-100)*2);
		}
		 System.out.printf("Valor a Pagar R$ %.2f ", conta);
		//}
		
		sc.close();


	}

}
