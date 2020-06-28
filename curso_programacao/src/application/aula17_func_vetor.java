package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Func_Vetor;

public class aula17_func_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a qtde de Funcionario");
		int n = sc.nextInt();
		Func_Vetor [] vect = new Func_Vetor[n];
		for (int i = 0; i < vect.length ; ++ i) {
			System.out.println("Digite o " + (i+1) + " �");
			System.out.print("ID : ");
			Integer id = sc.nextInt();	
			sc.nextLine();
			System.out.print("Name : ");
			String name = sc.nextLine();
			System.out.print("Salary : ");
			Double salary = sc.nextDouble();

			vect[i] = new Func_Vetor(id,name,salary);
		}
		
		System.out.print("Entre com o Codigo que tera aumento :");
		n = sc.nextInt();
		Double porc = 0.0;
		// Verificar se existe
		int tem = 0;
		for ( int i = 0 ; i < vect.length ; i ++) {
			if (vect[i].getId() == n) {
				tem = 1;
			}
		}
		if (tem ==0) {
			System.out.println("N�o existe esse ID \n");
		}
		else {
				System.out.print("Quanto % de aumento :");
				porc = sc.nextDouble();
			}
		
		
		for ( int i = 0 ; i < vect.length ; i ++) {
			if (vect[i].getId() == n) {
				vect[i].setSalary( vect[i].getSalary() + 
						((vect[i].getSalary())* porc/100));
			}
			System.out.println(vect[i].getId() + " , " + vect[i].getName() + " , " + vect[i].getSalary());
		}
		

		sc.close();
	}

}
