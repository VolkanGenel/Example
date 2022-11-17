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
 * İkisi de uyuşuyorsa siteme kaydoldunuz
 * telefonu dopru emeili yanlış ise emaili yanlış girdiniz
 * email doğru telefon yanlış ise telefonu yanlış girdiniz
 * ikisi de yanlış ise telefon da mail de yanlış girildi
 */
public class Question18 {

	public static void main(String[] args) {
			
		      Scanner scanner = new Scanner(System.in);
		        int mailKod = 444;
		        int telKod = 555;


		       System.out.println("Lütfen mail kodunuz giriniz");
		        int mk = scanner.nextInt();
		        System.out.println("Lütfen tel kodunuz giriniz");
		        int tk = scanner.nextInt();


		       if (telKod != tk && mailKod != mk) {
		            System.out.println("Komple Hatalı Girdin");
		            }
		            else if (telKod != tk) {
		            System.out.println("Telefon kodu hatalıdır");
		        }
		            else if (mailKod != mk) {
		            System.out.println("Mail kodu Hatalıdır");
		        }
		            else System.out.println("Sisteme Kaydoldunuz...");
	}

}
