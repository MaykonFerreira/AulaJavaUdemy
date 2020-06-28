import java.util.Locale;
import java.util.Scanner;

public class exe46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N,i;
		N = sc.nextInt();
		for (i = 1; i <=N ; i++) {
			System.out.println(i + " " + ((i * i)) + " " + ((i * i * i)));
		}
		
		sc.close();
	}

}
