import java.util.Locale;
import java.util.Scanner;

public class exe18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1,cod2,num1,num2;
		double vl1,vl2,soma;
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		vl1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		vl2 = sc.nextDouble();
		
		soma = (num1 * vl1) + (num2 * vl2);
		System.out.printf("Valor a Paga = %.2f", soma);

		sc.close();
	}

}
