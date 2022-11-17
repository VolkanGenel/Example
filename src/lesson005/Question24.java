package lesson005;
/*
 * Klavyeden girilen 0 dan 100 e kadar olan
 * 5 adet sayıdan en büyük ve en küçük olanı bulup 
 * ekrana yazan programın kodu
 */
import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner (System.in);
		int i=1;
		int sayiMax=0;
		int sayiMin=100;
		
		do {
		System.out.println("Lütfen Bir Sayı Giriniz");		
		int sayi = sc.nextInt();
		if (sayi >100 || sayi<0);
		else i++;
		if (sayi>=sayiMax) sayiMax=sayi;
		if (sayi<=sayiMin) sayiMin=sayi;
		}
		while (i<=5);
		
		System.out.println(sayiMax);
		System.out.println(sayiMin);

	}

}
