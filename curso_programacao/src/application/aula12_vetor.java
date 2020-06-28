package application;

import java.util.Locale;
import java.util.Scanner;

import entities.vetor_pdt;

public class aula12_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do Vetor");
		int n = sc.nextInt();
		int i = 0;
		vetor_pdt [] vect = new vetor_pdt[n];
		for (i = 0 ; i < n ; i ++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new vetor_pdt(nome,preco);
			
		}
		
		double soma = 0 ;
		// lengt � a quantidade de linhas do vetor
		for (i = 0 ; i < vect.length ; i ++) {
			soma += vect[i].getPreco();
		}
		
		System.out.printf("Media %.2f" , (soma)/n);
		
		sc.close();
	}

}
