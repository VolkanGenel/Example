package lesson009;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		/*
		 * bir method olsun
		 * methodun içinde 2 tane sayı alalım
		 * bu sayıların çarpım değerin döndürelim.
		 * 
		 * main method da bir de bir sayi değeri =15 olsun
		 * 
		 * bir de sonuc değerimiz olsun =0;
		 * sonuca methoddan dönen değer/sayi
		 * sonra da sonucu yazdıralım.
		 */
	int sayi= 15;
	int sonuc =(Carp()/sayi);
	System.out.println("Sonuç...: "+sonuc);
	
	
	
	}	
	public static int [] sayilariAl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Sayı Giriniz...: ");
		int sayi1=sc.nextInt();
		System.out.println("Lütfen Sayı Giriniz...: ");
		int sayi2=sc.nextInt();
		int []dizi= new int [2];
		dizi [0] = sayi1;
		dizi[1] = sayi2;
		return dizi;
		
	}
	
	public static int Carp() {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Lütfen Sayı Giriniz...: ");
	int sayi1=sc.nextInt();
	System.out.println("Lütfen Sayı Giriniz...: ");
	int sayi2=sc.nextInt();
	int carpim= sayi1*sayi2;
	// 	Buraya	System.out.println(carpim); yazsaydık o da çalışırdı.
	return carpim;
	}
}
