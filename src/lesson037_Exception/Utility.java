package lesson037_Exception;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	/**
	 * String olarak aldığımız tarihi localdate olarak bize dönen bir method
	 * yazalım doğru değer girene kadar tarih değeri alalım.
	 */

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {
		boolean kontrol = false;
		Integer deger = null; 
		do {
			try {
				System.out.println(sorgu);
				deger =	Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen Bir Rakam Değeri Giriniz");
				kontrol = true;
			}
			
		} while (kontrol);
		return deger;
	}

	public static int randomSayiUret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}

	
	 public static LocalDate stringTarihAlma() {
	        boolean kontrol = false;
	        LocalDate date = null;
	        do {
	            try {
	                date = LocalDate.parse(stringDegerAlma("Lütfen bir tarih degeri giriniz(yıl-ay-gün)"));
	                kontrol = false;
	            } catch (DateTimeParseException e) {
	                System.out.println(e.toString());
	                System.out.println("Gridiginiz tarih degeri hatalıdır lütfen ornekteki gibi giriniz (2023-01-20)");
	                kontrol = true;
	            }
	        } while (kontrol);
	        
	        return date;
	    }
}
