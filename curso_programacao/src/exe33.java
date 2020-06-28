import java.util.Locale;
import java.util.Scanner;

public class exe33 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num,soma;
		
		num = sc.nextInt();
		soma=0;
		
		while (num!=0) {
			soma += num;
			num= sc.nextInt();
		}
		System.out.println("Soma dos numero digitado = " + soma);
		
		
		sc.close();

	}

}
