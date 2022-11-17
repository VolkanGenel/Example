package lesson004;

import java.util.Scanner;

/*
 * Telefon kodu Tanımlayalım
 * Mail kodu Tanımlayalım
 * başlagıç değerlerini biz kendimiz atayacağız (int)
 * 
 * daha sonra dışarıdan bir tane telefon kodu alacağız
 * daha sonra dışarıdan bir tane mail kodu alacağız
 * 
 * eğer telefon kodu hatalı ise telefon kodu hatalı çıktısı verelim
 * eğer mail kodu hatalı ise mail kodu hatalı çıktısı verelim
 */
public class Question17 {

	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in);
	        int mailKod = 444;
	        int telKod = 555;



	       System.out.println("Lütfen mail kodunuz giriniz");
	        int mk = scanner.nextInt();
	        System.out.println("Lütfen tel kodunuz giriniz");
	        int tk = scanner.nextInt();



	       if (telKod != tk) {
	            System.out.println("Telefon kodu hatalıdır");
	        }
	        if (mailKod != mk) {
	            System.out.println("Mail kodu Hatalıdır");
	        }
	}

}
