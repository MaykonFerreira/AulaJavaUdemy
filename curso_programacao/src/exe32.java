import java.util.Locale;
import java.util.Scanner;

public class exe32 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double larg = sc.nextDouble();
		double comp = sc.nextDouble();
		double metroq = sc.nextDouble();
		double area = larg * comp;
		double preco = area * metroq;
		
		System.out.printf("Area = %.2f", area);
		System.out.printf("Preco = %.2f", preco);
		
		sc.close();

	}

}
