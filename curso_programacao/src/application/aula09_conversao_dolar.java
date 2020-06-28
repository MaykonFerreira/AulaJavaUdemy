package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cotacao;

public class aula09_conversao_dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do Dolar ");
		Cotacao.cot_atual= sc.nextDouble();
		System.out.println("Digite a qtde que será comprada ");
		int qtde = sc.nextInt();
		System.out.printf("Você irá gastar R$ %.2f",Cotacao.conversao(qtde));
		
		
		
		sc.close();
	}

}
