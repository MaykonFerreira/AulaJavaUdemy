package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class aula06_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo ret = new Retangulo();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com Largura e Altura do Triangulo");
		ret.X = sc.nextDouble();
		ret.Y = sc.nextDouble();
		System.out.printf("Area : %.2f ",ret.area());
		System.out.printf("Perimeter : %.2f ",ret.perimeter());
		System.out.printf("Diagonal : %.2f ",ret.diagonal());
		sc.close();
	}

}
