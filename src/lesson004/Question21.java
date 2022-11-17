package lesson004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {

		/*Dışarıdan 1 den 7 ye arasında bir sayı alalım. 
		 * Daha sonra bu sayıya karşılık gelen günü yazdıralım.
		 */
		
		
		Scanner sc = new Scanner (System.in);
		int sayi;
		
		do {
		System.out.println("Lütfen bir sayı giriniz");
		sayi=sc.nextInt();
		}
		while (sayi<1||sayi>7);
			
		switch (sayi) {
		case 1: System.out.println("Bugün Günlerden Pazartesi");
			break;
		case 2: System.out.println("Bugün Günlerden Salı");
		break;
		case 3: System.out.println("Bugün Günlerden Çarşamba");
		break;
		case 4: System.out.println("Bugün Günlerden Perşembe");
		break;
		case 5: System.out.println("Bugün Günlerden Cuma");
		break;
		case 6: System.out.println("Bugün Günlerden Cumartesi");
		break;
		default:System.out.println("Bugün Günlerden Pazar");
			break;
		}
	}

}
