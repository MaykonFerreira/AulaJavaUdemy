package application;

import java.util.Locale;
import java.util.Scanner;

public class aula15_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] ds = new String[] {"Domingo","2� Feira","3� Feira",
									"4� Feira","5� Feira","6� Feira","S�bado"};
		
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		System.out.println("-----------");
		for (String dia : ds) {
			System.out.println(dia);
		}
	}

}
