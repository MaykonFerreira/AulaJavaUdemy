import java.util.Locale;
import java.util.Scanner;

public class exe49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String original = "abcde FGHIJ ABC abc DEFG   ";
		//String s01 = original.toLowerCase();
		System.out.println("-" + original + "-");
		System.out.println("-" + original.toLowerCase() + "-");
		System.out.println("-" + original.toUpperCase() + "-");
		System.out.println("-" + original.trim() + "-");
		System.out.println("-" + original.substring(2) + "-");
		System.out.println("-" + original.substring(2, 9) + "-");
		System.out.println("-" + original.replace('a','x') + "-");
		System.out.println("-" + original.replace("abc","xyz") + "-");
		System.out.println("-" + original.indexOf("bc") + "-");
		System.out.println("-" + original.lastIndexOf("bc") + "-");
		String s ="potato apple lemon";
		String [] vect = s.split(" ");
		System.out.println(s);
		System.out.println( vect[0]);
		System.out.println( vect[1]);
		System.out.println( vect[2]);
		/*
		 ddsads
		  dasdsd
		 dsadsa
		 
		 */
		//System.out.println(n1 & n2);
		//System.out.println(n1 | n2);
		//System.out.println(n1 ^ n2);
		sc.close();
	}

}
