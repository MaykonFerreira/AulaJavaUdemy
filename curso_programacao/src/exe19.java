import java.util.Locale;
import java.util.Scanner;

public class exe19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A , B , C , Pi;
		Pi= 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();		
		//triangulo = A * C / 2.0;
		//circulo = 3.14159 * C * C;
		//trapezio = (A + B) / 2.0 * C;
		//quadrado = B * B;
		//retangulo = A * B;		
		
		
		System.out.printf("Triangulo : %.3f %n",(A * C / 2.0) );
		System.out.printf("Circulo : %.3f %n", (Pi * C * C));
		System.out.printf("Trapezio : %.3f %n", ((A + B)/ 2.0 * C));
		System.out.printf("Quadrado : %.3f %n", (B*B));
		System.out.printf("Retangulo : %.3f",(A * B));

		sc.close();

	}

}
