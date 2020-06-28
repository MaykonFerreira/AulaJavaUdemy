import java.util.Locale;
import java.util.Scanner;

public class exe14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a,b,soma;
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		System.out.println("a Soma de " + a + " + " + b + " = " + soma);

	}

}
