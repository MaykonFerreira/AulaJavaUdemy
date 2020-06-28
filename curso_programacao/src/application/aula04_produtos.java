package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Product_GS;

public class aula04_produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Antigo
		//Product pdt = new Product();
		System.out.println("Entre com os produtos");
		System.out.print("Nome : ");
		String nome = sc.nextLine();
		System.out.print("Preço : ");
		double price = sc.nextDouble();
		System.out.print("Qtde : ");
		int qtde = sc.nextInt();
		// Mais facil
		//Product pdt = new Product(nome, price, qtde); Melhorar
		Product pdt = new Product(nome, price);
		// Esse é usando o Encapsulamento
		Product_GS pdt_gs = new Product_GS(nome, price,qtde);
		// Formas de Alteração e acessar dados
		pdt_gs.setName(nome);
		pdt_gs.getName();
		
		System.out.println("Produtos data : " + pdt.toString());
		System.out.println("Digite a quantidade para adicionar no Estoque");
		qtde = sc.nextInt();
		pdt.add(qtde);
		System.out.println("Produtos data : " + pdt.toString());
		System.out.println("Digite a quantidade para remover no Estoque");
		qtde = sc.nextInt();
		pdt.ret(qtde);
		System.out.println("Produtos data : " + pdt.toString());		
		//System.out.println(pdt.nome + " , " + pdt.price + " , " + pdt.qtde + " , Est R$ " + pdt.valorestoque());
		sc.close();
	}

}
