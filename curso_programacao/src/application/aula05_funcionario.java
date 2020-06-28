package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Product;

public class aula05_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		System.out.println("Entre com os dados do Funcionario");
		System.out.print("Nome : ");
		func.nome = sc.nextLine();
		System.out.print("Salario : ");
		func.Sal = sc.nextDouble();
		System.out.print("taxa : ");
		func.taxa = sc.nextDouble();
		System.out.println("Employee : " + func.toString());
		System.out.println("Digite % de Aumento de Salario");
		double Sal = sc.nextDouble();
		func.add(Sal);
		System.out.println("Employee : " + func.toString());
		System.out.println("Digite % de Desconto de Salario");
		Sal = sc.nextDouble();
		func.ret(Sal);
		System.out.println("Employee : " + func.toString());
		sc.close();
	}

}
