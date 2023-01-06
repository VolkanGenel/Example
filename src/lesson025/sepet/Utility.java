package lesson025.sepet;

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
}
