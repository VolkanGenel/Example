package lesson022.okul;

import java.util.Scanner;

public class OysUtility {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String stringDegerAlma (String sorgu) {
		System.out.println(sorgu);
		return sc.nextLine();
	}
	
	public static int intDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return Integer.parseInt(sc.nextLine());
	}

}
