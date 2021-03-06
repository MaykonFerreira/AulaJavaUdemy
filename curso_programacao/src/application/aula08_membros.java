package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;
import entities.Calculator;

public class aula08_membros {
	// Declarada e n�o pode ser alterada
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator Calc = new Calculator();
		System.out.println("Entre Radium");
		double rad = sc.nextDouble();
		double c = Calc.circu(rad);
		double v = Calculadora.volume(rad);
		System.out.printf("Circunferencia : %.2f%n",c);
		System.out.printf("Volume : %.2f%n",v);
		System.out.printf("Valor de PI : %.2f%n",Calc.PI);
		sc.close();
	}
	public static double circu (double rad) {
		return 2.0 * PI * rad;
	}
	public static double volume (double rad) {
		return 4.0 * PI * rad * rad * rad / 3.0;
	}
}
