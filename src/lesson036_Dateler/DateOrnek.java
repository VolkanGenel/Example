package lesson036_Dateler;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateOrnek {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2020,11,3);
		
		long gun = date2.until(date1, ChronoUnit.DAYS);
		long hafta = date2.until(date1, ChronoUnit.WEEKS);
		long ay = date2.until(date1, ChronoUnit.MONTHS);
		long yil = date2.until(date1, ChronoUnit.YEARS);

		System.out.println(gun);
		System.out.println(hafta);
		System.out.println(ay);
		System.out.println(yil); 
		
//		System.out.println(date2.plusDays(25));
//		System.out.println(date2.plusMonths(1));
//		System.out.println(date2.plusWeeks(3));
//		System.out.println(date2.plusYears(1));
//		System.out.println(date2.minusDays(5));
//		System.out.println("yılı  :"+date2.getYear());
//		System.out.println("ayı  :"+date2.getMonthValue());
//		System.out.println("gün  :"+date2.getDayOfMonth());
//		System.out.println("o yıldaki kaçıncı gün   :"+ date2.getDayOfYear());
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date1.isAfter(date2));
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Lütfen yılı giriniz");
//		int yıl = sc.nextInt();
//		System.out.println("Lütfen ayı giriniz");
//		int ay = sc.nextInt();
//		System.out.println("Lütfen günü giriniz");
//
//		int gun = sc.nextInt();
//		LocalDate date3 = LocalDate.of(yıl, ay, gun);
//		System.out.println(date3);
		
//		LocalDate date4 = LocalDate.parse("2000-10-25");
//		System.out.println(date4);
//		System.out.println("Lütfen tarihi giriniz");
//		LocalDate date5 = LocalDate.parse(sc.nextLine());
//		System.out.println(date5);
//		
//		LocalDateTime date2 =LocalDateTime.now();
//		System.out.println(date2);
//		Date date = new Date();
//		System.out.println(date);
		
		
	}
}
