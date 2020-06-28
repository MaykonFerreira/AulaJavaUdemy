import java.util.Locale;
import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int y ;
		double z;
				
		x = sc.next();
		y= sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", z);
		
		sc.close();

	}

}
