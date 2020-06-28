import java.util.Locale;
import java.util.Scanner;

public class exe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Digite os valores X e Y :");
		x = sc.nextDouble();
		y = sc.nextDouble();
		while (x != 0 ) {

			if (x == 0 && y == 0) {
				System.out.println("Origem");
			} else if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		// }

		sc.close();

	}

}
