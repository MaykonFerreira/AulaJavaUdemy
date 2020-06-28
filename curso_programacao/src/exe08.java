import java.util.Locale;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
				
		x = sc.nextDouble();
		System.out.println("Você Digitou : " + x);
		System.out.printf("Você Digitou : %.2f%n", x);
		sc.close();

	}

}
