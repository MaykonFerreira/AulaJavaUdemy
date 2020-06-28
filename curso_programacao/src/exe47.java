import java.util.Locale;
import java.util.Scanner;

public class exe47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double C;
		char R;

		do  {
			System.out.println("Digite a Temperatura em Celsius");
			C = sc.nextDouble();
			System.out.printf("Grau Fahrenheit %.2f %n", (9.0 * C / 5.0 +32.0));
			System.out.print("Deseja Repetir ? (s/n)");
			R = sc.next().charAt(0);
		 } while (R!='n');

		 sc.close();
	}

}
