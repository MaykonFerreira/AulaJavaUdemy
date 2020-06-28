import java.util.Locale;
import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double delta,raio,resultado;
		delta = 3.14159;
		raio = sc.nextDouble();
		resultado = delta * Math.pow(raio,2.0);
		System.out.printf("o Valor do Circulo é : %.4f",resultado);

	}

}
