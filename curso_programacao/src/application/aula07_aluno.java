package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class aula07_aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno AL = new Aluno();
		System.out.println("Entre o Nome do Aluno");
		AL.Aluno = sc.nextLine();
		System.out.print("Digite a 1� Nota : ");
		AL.n1 = sc.nextDouble();
		System.out.print("Digite a 2� Nota : ");
		AL.n2 = sc.nextDouble();
		System.out.print("Digite a 3� Nota : ");
		AL.n3 = sc.nextDouble();
		System.out.println(AL.Resultado());
		sc.close();
	}

}
