package lesson031;

import java.util.Random;
import java.util.Scanner;

public class Utility {

	 static Scanner scanner = new Scanner(System.in);

	    public static String stringDegerAlma(String sorgu) {
	        System.out.println(sorgu);
	        return scanner.nextLine();
	    }
	    public static int intDegerAlma(String sorgu) {
	        System.out.println(sorgu);
	        return Integer.parseInt(scanner.nextLine());
	    }
	    
	    public static int randomSayiUret(int sayimin, int sayimax) {
	    	Random random = new Random();
	    	int sayi = random.nextInt(sayimin,sayimax);
	    	return sayi;
	    }
}
