import java.util.Locale;
import java.util.Scanner;

public class exe25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo,qtde;
		System.out.println("Digite o Codigo e Quantidade :");
		codigo = sc.nextInt();
		qtde = sc.nextInt();
		
		if (codigo==1 ) {
			System.out.printf("Total: %.2f ", (qtde * 4.00));
		    }
		else if (codigo==2) {
			System.out.printf("Total: %.2f ", (qtde * 4.50));
		     }
		else if (codigo ==3) {
			System.out.printf("Total: %.2f ", (qtde * 5.00));
	     }
		else if (codigo==4) {
			System.out.printf("Total: %.2f ", (qtde * 2.00));
	     }
		else {
			System.out.printf("Total: %.2f ", (qtde * 1.50));
		}
		//}
		
		sc.close();


	}

}
