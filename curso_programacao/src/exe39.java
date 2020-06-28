import java.util.Locale;
import java.util.Scanner;

public class exe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int I,n;
		// Tabuada
		System.out.println("Digite a nro a ser criado a tabuada ");
		n = sc.nextInt();
		for (I=1 ; I <= 10 ; I ++){
			System.out.printf(" %d x %d = %d %n",n,I,(I*n));	
		}
		
		sc.close();
	}

}
