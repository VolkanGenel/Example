package lesson025.odev;

import java.util.Random;
import java.util.Scanner;

public class Utility { 
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	
	public static String stringDegerAlma (String sorgu) {
		System.out.println(sorgu);
		return sc.nextLine();
	}
	
	public static int intDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return Integer.parseInt(sc.nextLine());
	}
	
	public static Yemek yemekrandomAlma () {
		int sayi = random.nextInt(Yemek.values().length);
		return Yemek.values()[sayi];
	}
	public static Icecek icecekrandomAlma () {
		int sayi = random.nextInt(Icecek.values().length);
		return Icecek.values()[sayi];
	}
	public static Tatli tatlirandomAlma () {
		int sayi = random.nextInt(Tatli.values().length);
		return Tatli.values()[sayi];
	}
	public static Corba corbarandomAlma () {
		int sayi = random.nextInt(Corba.values().length);
		return Corba.values()[sayi];
	}
}
