package lesson037_Exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/*
 * bir tane metodum olsun iki parametre alsın dışarıdan sonra bölme işlemini yapıp sonucu donsun.
 * main de for dongusu kuracağız 3 kere çalışsın bu for dongusu içinde de try catch yapısını kullanalım.
 */
public class TryCatchOnek {
	static List <String> list = new ArrayList<>();
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	TryCatchOnek tryCatchOnek = new TryCatchOnek(); 
		try {
			list.add("a");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("---------");
			System.out.println(e.getMessage());
		}
		System.out.println("Uygulama Devam Ediyor");

		boolean kontrol=false;
		
		do {
			sc = new Scanner (System.in);
			try {					
					System.out.println("Lütfen 1 adet sayı giriniz...: ");
					int sayi1 = sc.nextInt();
					System.out.println("Lütfen 1 adet sayı giriniz...: ");
					int sayi2 = sc.nextInt();
					System.out.println(tryCatchOnek.bolme(sayi1,sayi2));
					kontrol = false;
			} catch (ArithmeticException exception) {
				System.out.println(exception.toString());
				kontrol = true;
			} catch (InputMismatchException exception) {
				System.out.println(exception.toString());
				kontrol = true;
			}
		} while (kontrol); 

		
		
		
	}
	
	public int bolme(int sayi1, int sayi2) {
		int toplam=sayi1/sayi2;
		return toplam;
	}
	
	  public static double bolme2() {
	        double bolum = 0;
	        boolean kontrol = false;
	        do {
	            try {
	                Scanner scanner = new Scanner(System.in);
	                System.out.println("Lütfen birinci sayıyı giriniz");
	                int sayi1 = scanner.nextInt();
	                System.out.println("Lütfen ikinci  sayıyı giriniz");
	                int sayi2 = scanner.nextInt();
	                kontrol = false;
	                bolum = sayi1 / sayi2;
	            } catch (InputMismatchException e) {
	                System.out.println("Lütfen sadece rakam giriniz");
	                System.out.println(e.toString());
	                kontrol = true;
	            }

	        } while (kontrol);
	        return bolum;
	    }

}
