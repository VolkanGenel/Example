package lesson006;

import java.util.Scanner;

/*
 * * Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o
*   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
*	Eğer harfi içermiyorsa bir çıktı versin.
*
* 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
* giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
* içerisinde o harf varsa değiştirsin
*
*
* 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
* olmadığını bulunuz(kek,iki,kabak)
*
*
* 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
* başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
* açıldığını düşünün elimizde) her a bir sayfaya her b bir sayfaya her c bir
* sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
* sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
* *
 */

public class Question29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;
		int sayac=0;
		boolean kontrol =true;
		while (kontrol) {
			System.out.println("=====String İşlemleri");
			System.out.println("1- Harf Saydırma");
			System.out.println("0- Çıkış");
			kontrol =false;
		}
		
		System.out.println("Lütfen Seçiminizi Yapınız");
		int secim = sc.nextInt();
		switch (secim) {
		case 1: 
			System.out.println("Lütfen bir kelime girin");
			String ifade = sc.nextLine();
			System.out.println("Lütfen bir harf girin");
			String harf = sc.nextLine();
			for (i=0;i<ifade.length();i++) {
				if (ifade.charAt(i) == harf.charAt(0)) {
					sayac ++;
				}
			}
			if (sayac<1)
			System.out.println(sayac);
			else System.out.println("Kelime içinde bu karakter yoktur");
			break;
		
			
		default:
			
		}
		
		
		
			
		
	}

}
