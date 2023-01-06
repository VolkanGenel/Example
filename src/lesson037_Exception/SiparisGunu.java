package lesson037_Exception;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SiparisGunu {

	/**
	 * Bir alışveriş tarihimiz olsun
	 * Daha sonra bir de ayın 15 i bizim fatura kesim tarihimiz olsun
	 * 
	 * 1- Alışveriş tarihi fatura tarihinden önce mi kontrol edelim
	 * once ise fatura tarihnde once yazdıralım
	 * 
	 * 2- sonra ise fatura tarihinden sonra yazdıralım.
	 * yeni fatura tarihi yazdıralım (Bir sonraki fautra tarihi) ve kalan gün sayısını yazdıralım
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		LocalDate alisverisTarihi1 = LocalDate.parse(sc.nextLine());
		LocalDate alisverisTarihi = LocalDate.of(2023, 1, 23);
		LocalDate faturaTarihi1 = LocalDate.of(alisverisTarihi.getDayOfYear(), alisverisTarihi.getDayOfMonth(), 15);
		int faturaGunu = 15;
		
		if (alisverisTarihi.getDayOfMonth()<=15) {
			System.out.println("Fatura Tarihinden Önce");
			
		} else { System.out.println("Fatura Tarihinden Sonra");
			
			LocalDate faturatarihi = alisverisTarihi.minusDays(alisverisTarihi.getDayOfMonth()-15);
			faturatarihi = faturatarihi.plusMonths(1);
			System.out.println(faturatarihi);
			//System.out.println(30-(alisverisTarihi.getDayOfMonth()-15)+" gün kaldı.");
			System.out.println(faturatarihi.getDayOfYear()-alisverisTarihi.getDayOfYear()+" gün kaldı.");
			long kalanGun = alisverisTarihi.until(faturatarihi, ChronoUnit.DAYS);
			long kalanGun2 = ChronoUnit.DAYS.between(alisverisTarihi, faturatarihi);
			System.out.println("kalan gun:  " +kalanGun);
			System.out.println("kalan gun:  " +Math.abs(kalanGun2)); // Mutlak Değer Alma.
			
			Period p = Period.between(alisverisTarihi, faturatarihi);
			long fark = p.getDays();
			System.out.println(p);
		}
		
	}
}
