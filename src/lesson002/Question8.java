package lesson002;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
	/*
	 * Dışarıdan girilen bir sayının faktoriyelini hesaplayalım.	
	 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Sayı Giriniz.....: ");
		int a = scan.nextInt();
		int j=1;
		for (int i=1; i<=a; i++) {
			j *= i; 
			}
		
		System.out.println(j);
		scan.close();
	}
}
 