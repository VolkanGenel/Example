package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		/*
		 * Dışarıdan iki tane sayısal değer alalım. İki sayının toplamı
		çift ise true yazdıralım, tek ise false yazdıralım. Sonra toplamın yarısını
		ekrana uazdıralım
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Değer Giriniz");
		double a = scan.nextDouble();
		System.out.println("Lütfen Bir Değer Giriniz");
		double b = scan.nextDouble();
		double c = a + b;
		boolean kontrol = c%2 == 0;
		System.out.println(kontrol);
		System.out.println(c/2);
		scan.close();		

	}

}
