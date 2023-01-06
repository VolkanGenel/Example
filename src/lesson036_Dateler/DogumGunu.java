package lesson036_Dateler;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Dışarıdan string olarak dogum gününüzü alınız
 * daha sonra dogduğunuz günden bugüne kaç yıl kaç hafta kaç ay
 * kaç yaşamışsınız onu hesaplayınız.
 * Bir sonraki doğumgününe kaç gün kaldı.
 * @author sezaigenel
 *
 */
public class DogumGunu {
 
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println(now);
	
	Scanner sc = new Scanner (System.in);
//	System.out.println("Lütfen yılı giriniz");
//	int yıl = sc.nextInt();
//	System.out.println("Lütfen ayı giriniz");
//	int ay = sc.nextInt();
//	System.out.println("Lütfen günü giriniz");
//	int gun = sc.nextInt();
	
	System.out.println("Lütfen dogum günü tarihini giriniz....: ");
	LocalDate dg = LocalDate.parse(sc.nextLine());
	
//	LocalDate date2 = LocalDate.of(yıl, ay, gun);
//	LocalDate date3 = LocalDate.of(2023,ay,gun);


	
	
	long gun1 = dg.until(now, ChronoUnit.DAYS);
	long hafta = dg.until(now, ChronoUnit.WEEKS);
	long ay1 = dg.until(now, ChronoUnit.MONTHS);
	long yil = dg.until(now, ChronoUnit.YEARS);
	long kalangun = (dg.getDayOfYear() - now.getDayOfYear()+365)%365;
	
	 LocalDate sonrakiDogunGunu = dg.plusYears(yil + 1);
     long fark = now.until(sonrakiDogunGunu, ChronoUnit.DAYS);
     System.out.println("Bir sonraki dogum gununuze " + fark + " gunkaldı");
     
	
	System.out.println("Yaşadığım gün sayısı....:"+gun1);
	System.out.println("Yaşadığım hafta sayısı....:"+hafta);
	System.out.println("Yaşadığım ay sayısı....:"+ay1);
	System.out.println("Yaşadığım yıl sayısı....:"+yil);
	System.out.println("Doğum gününe kalan gün sayısı....: "+kalangun);
	
	}
}
