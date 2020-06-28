import java.util.Locale;
import java.util.Scanner;

public class exe43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double N, D,i,X;
		X = sc.nextInt();
		for (i = 0; i <= X; i++) {
			N = sc.nextDouble();
			D = sc.nextDouble();
			if (D==0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				System.out.printf("%.1f %n",(N/D));
			}
		}
		
		sc.close();
	}

}
