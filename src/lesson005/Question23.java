package lesson005;

import java.util.Scanner;

/* Mükemmel sayı = kendisi hariç pozitif tam bölenlerinin toplamı 
kendisine eşit olan sayı
6=1+2+3 Mükemmel Bir Sayıdır.
*/
public class Question23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen Bir Sayı Giriniz");
		int sayi = sc.nextInt();
		int i, toplam=0;
		for (i=1;i<=(sayi/2);i++) {
			if (sayi %i ==0) {
				toplam += i;}
			
		}
		if (toplam==sayi) {
			System.out.println(sayi+ " Bir Mükemmel Sayıdır");
		}
		else System.out.println(sayi+ " Bir Mükemmel Sayı Değildir");
	}

}
