import java.util.Locale;
import java.util.Scanner;

public class exe42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		int  N, i;
		N = sc.nextInt();
		for (i = 1; i <= N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			System.out.printf("%.1f %n",((a * 2.0)+( b * 3.0)+(c * 5.0))/10.0);
		}
		
		sc.close();
	}

}
