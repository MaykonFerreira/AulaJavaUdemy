package application;

import java.util.Locale;
import java.util.Scanner;

public class aula02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aula01_triangulo x,y;
		x = new aula01_triangulo();
		y = new aula01_triangulo();
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
		double p = (x.a + x.b + x.c)/2;
		double areax = Math.sqrt(p * (p - x.a) * ( p - x.b) * (p - x.c));
		// Area do Triangulo Y
		p = (y.a + y.b + y.c)/2;
		double areay = Math.sqrt(p * (p - x.a) * ( p - x.b) * (p - x.c));
		
		System.out.printf("Triangulo X %.4f %n",areax);
		System.out.printf("Triangulo Y %.4f %n",areay);
		
		if (areax > areay) {
			System.out.printf("Maior Area � a X  %.4f", areax);
		}
		else {
			System.out.printf("Maior Area � a Y %.4f" , areay);
		}
		sc.close();
	}

}
