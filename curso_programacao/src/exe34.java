import java.util.Locale;
import java.util.Scanner;

public class exe34 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tb,num;
		// Tabuada
		tb = sc.nextInt();
		num=0;
		System.out.println("Tabuada do numero " + tb);
		while (num!=10) {
			num += + 1;
			System.out.println( tb + " x " + num + " = " + (tb*num));
		}
		
		sc.close();
	}

}
