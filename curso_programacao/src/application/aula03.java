package application;

import java.util.Locale;
import java.util.Scanner;

public class aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangulo x,y;
		x = new triangulo();
		y = new triangulo();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as medidas Triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas Triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		// Area do Triangulo X
		double areax = x.area();
		// Area do Triangulo Y
		double areay = y.area();
		
		System.out.printf("Triangulo X %.4f %n",areax);
		System.out.printf("Triangulo Y %.4f %n",areay);
		
		if (areax > areay) {
			System.out.printf("Maior Area é a X  %.4f", areax);
		}
		else {
			System.out.printf("Maior Area é a Y %.4f" , areay);
		}
		sc.close();
	}

}
