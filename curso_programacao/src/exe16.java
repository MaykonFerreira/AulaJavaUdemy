import java.util.Locale;
import java.util.Scanner;

public class exe16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b , c , d , dif ;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		dif = (a * b - c * d);
		System.out.println("A Diferença ( " + a + " * " + b + " - " + c + " * " + d + " ) = " + dif);

	}

}
