package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class aula19_Date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.PRC);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date y1 = sdf1.parse("28/06/2020");
		Date y2 = sdf2.parse("28/06/2020 11:37:12");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		// esta imprimindo no formato ISO 8601
		Date y3 = Date.from(Instant.parse("2020-06-28T11:37:12Z"));
		
		System.out.println(y1 + "\n" + y2);
		System.out.println("\n"+ sdf1.format(y1) + "\n" + sdf2.format(y2));
		System.out.println("\n" + sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		System.out.println(sdf2.format(y3));
		System.out.println("\n\nFormato Brasil \n" + sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(x3));
		System.out.println(sdf3.format(x4));
		System.out.println(sdf3.format(y3));
		
		sc.close();
	}

}
