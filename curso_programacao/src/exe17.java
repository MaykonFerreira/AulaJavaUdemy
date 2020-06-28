import java.util.Locale;
import java.util.Scanner;

public class exe17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int func,hr_trab;
		double vl_hora,rec_pagto;
		func = sc.nextInt();
		hr_trab = sc.nextInt();
		vl_hora = sc.nextDouble();
		rec_pagto = hr_trab * vl_hora;
		System.out.println("Number = " + func);
		System.out.printf("Salary U$ = %.2f",rec_pagto);

		sc.close();
	}

}
