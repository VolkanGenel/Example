package lesson009;

import java.util.Scanner;

public class Question44_Cozum {

	  public static void main(String[] args) {
	       int sayi = 15;
	        int sonuc = 0;
//	        sonuc = carpim() / sayi;

//	        System.out.println("sonuc= " + sonuc);
//	        System.out.println(carpim());

	       int dizi[] = sayilariAl();
	        int sonuc2 = carpim3(dizi);
	        System.out.println(sonuc2);
	       System.out.println(carpim3(sayilariAl()));
	   }
	   public static int[] sayilariAl() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen 1. sayıyı giriniz");
	        int deger1 = scanner.nextInt();
	        System.out.println("Lütfen 2. sayıyı giriniz");
	        int deger2 = scanner.nextInt();
	       int dizi[] = new int[2];
	        dizi[0] = deger1;
	        dizi[1] = deger2;
	       return dizi;
	   }
	   public static int carpim3(int[] dizi) {
	       int carpım = dizi[0] * dizi[1];
	        return carpım;
	   }
	   public static int carpim() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen 1. sayıyı giriniz");
	        int deger1 = scanner.nextInt();
	        System.out.println("Lütfen 2. sayıyı giriniz");
	        int deger2 = scanner.nextInt();
	        int carpım = deger1 * deger2;
	       return carpım;
	   }
	   public static void carpim2() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen 1. sayıyı giriniz");
	        int deger1 = scanner.nextInt();
	        System.out.println("Lütfen 2. sayıyı giriniz");
	        int deger2 = scanner.nextInt();
	        int carpım = deger1 * deger2;
	        System.out.println(carpım);
	   }
}
