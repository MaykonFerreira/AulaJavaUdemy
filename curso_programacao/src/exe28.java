import java.util.Locale;
import java.util.Scanner;

public class exe28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor,fx1,fx2,fx3,fx4;
		System.out.println("Digite um valor de Salario :");
		valor = sc.nextDouble();
		fx1 = 0 ;
		fx2 = 0 ;
		fx3 = 0 ;
		fx4 = 0 ;
		if (valor <=2000.00 ) {
			System.out.println("Isento");
		    }
		else if (valor>2000.00 && valor <=3000.00) {
			fx2= (valor-2000.00) * 0.08;
			System.out.printf("R$ %.2f ", (fx1+fx2+fx3+fx4));
		     }
		else if (valor>3000.00 && valor <=4500.00) {
			fx3= (valor-3000) * 0.18;
			fx2= (1000) * 0.08;
			System.out.printf("R$ %.2f ", (fx1+fx2+fx3+fx4));
	     }
		else {
			
			fx4 = (valor-4500.00) * 0.28;
			fx3= (1500) * 0.18;
			fx2= (1000) * 0.08;

			System.out.printf("R$ %.2f ", (fx1+fx2+fx3+fx4));
		}
		//}
		
		sc.close();


	}

}
