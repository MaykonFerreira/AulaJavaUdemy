import java.util.Locale;
import java.util.Scanner;

public class exe31 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco, desconto;
		
		System.out.println("Digite o dia da Semana :");

		preco = 34.50;
		desconto = (preco < 20.00) ? preco * 0.1: preco * 0.05;
		System.out.printf("Desconto :" + desconto);
		//}
		
		sc.close();


	}

}
