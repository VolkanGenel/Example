package lesson004;

/*
 * Dışarıdan girilen bir sayının asal sayı olup olmadığını kontol eden kod yazalım.
 */
import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen Bir Sayı Giriniz");
		int sayi = sc.nextInt();
		
		int i = 2; 
		while ((sayi)%i!=0 && i<=(sayi/2)) {
			i++;
		}
		if (sayi%i ==0 && sayi!=i) {System.out.println("Sayı Asal Değildir");
		}
		else System.out.println("Sayı Asaldır");
	}
}
