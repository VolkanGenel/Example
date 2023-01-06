package lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 1 tane tek sayılar 1 tane çift sayılar için bir liste oluşturalım.
 * Sonra 35 tane random sayıyı çif ise çiftlere tek ise teklere atalım.
 * En sonunda tekler ve çiftler listesini yazdıralım. 
 */
public class ArrayListOrnek2 {

static Random random;
	
	public static void main(String[] args) {
		
		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();
		random = new Random();
		int sayi;
		
		for (int i = 0; i < 35; i++) {
			 sayi = random.nextInt(500);
			 if (sayi%2==0)
			 ciftSayilar.add(sayi);
			 else tekSayilar.add(sayi);
		}
		System.out.println("Çift Sayılar");
		for (Integer ciftsayi : ciftSayilar) {
			System.out.print(ciftsayi+", ");	
		}
		System.out.println();
		System.out.println("Tek Sayılar");
		for (Integer teksayi : tekSayilar) {
			System.out.print(teksayi+", ");
//		Başka for kullanımları;	
//	    tekSayilar.forEach((x) -> System.out.print(x + ","));
//	    tekSayilar.forEach(System.out::print);	
			
		}
	}
}
