import java.util.Locale;
import java.util.Scanner;

public class exe48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		n1 = 89;
		n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
		int mask = 0b00100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			System.out.println("6th bit is true");
		}
		else {
			System.out.println("6th bit is False");
		}
		
		
		 sc.close();
	}

}
