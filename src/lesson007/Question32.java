package lesson007;

import java.util.Scanner;

public class Question32 {
/*
 * Dışarıdan girilen değerin dizimizde olup olmadığını bulan algoritma
 */
	public static void main(String[] args) {
		String[] dizi= {"Türkiye","Japonya","Moğolistan","Fransa","Danimarka"};
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen Bir Değer Giriniz");
		String ulke = sc.nextLine();
		boolean kontrol = true;
		for (int i=0;i<dizi.length;i++) {
		if(ulke.equalsIgnoreCase(dizi[i])) {
			System.out.println("Ülke Dizi İçerisinde Mevcuttur");
			kontrol =false;
		}
		}
		if (kontrol==true) {
		System.out.println("Ülke Dizi İçerisinde Mevcut Değildir");
		}
	}

}
