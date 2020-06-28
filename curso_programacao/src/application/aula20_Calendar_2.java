package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class aula20_Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		// esta imprimindo no formato ISO 8601
		Date d = Date.from(Instant.parse("2020-06-28T11:37:12Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		// Deve acrescentar 1(hum) pq o mês começa com 0(zero) Janeiro
		int mont   = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes : " + minutes);
		System.out.println("Month : " + mont  );
		
		sc.close();
	}

}
