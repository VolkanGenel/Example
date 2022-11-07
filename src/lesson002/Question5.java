package lesson002;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz...:");
		int sayi1 = scan.nextInt();
		double sayi2 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Lütfen bir değer giriniz...:");
		String value = scan.nextLine();
		
		System.out.println("Lütfen bir deeğer giriniz...:");
		String value2 = scan.nextLine();
		
		System.out.println("value===>" + value +" "+ value2);
		scan.close();
	}

}
