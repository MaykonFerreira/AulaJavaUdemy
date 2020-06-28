import java.util.Locale;
import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		int x ;
		
		x = sc.nextInt();
		// Inclui para Consumir a entrada (ENTER)
		sc.nextLine();
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
