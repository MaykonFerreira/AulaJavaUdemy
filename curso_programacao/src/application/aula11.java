package application;

import java.util.Locale;
import java.util.Scanner;

public class aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do Vetor");
		int n = sc.nextInt();
		int i = 0;
		double [] vect = new double[n];
		for (i = 0 ; i < n ; i ++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0 ;
		for (i = 0 ; i < n ; i ++) {
			soma += vect[i];
		}
		
		System.out.printf("Media %.2f" , (soma)/n);
		
		sc.close();
	}

}
