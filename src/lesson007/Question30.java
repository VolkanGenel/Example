package lesson007;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işlemeler ve OTH yerine Ki
		 * 2000 ile bitmiyorsa kıta dışı işlemler yazsın ve OTH yerine Kd 200200…
		 */
		
		
		System.out.println("Lütfen İban Giriniz");
		Scanner sc = new Scanner(System.in);
		String iban = sc.nextLine();
		if (iban.startsWith("TR")) {
			System.out.println("Yurtiçi İşlemler"); 
			
		if (iban.endsWith("5001")) {
			System.out.println("Ziraat");
		}
			else if (iban.endsWith("5002")) {
				System.out.println("Garanti");
				
		}
			
			else if (iban.endsWith("5003")) {
				System.out.println("İş Bankası");
				}
	}
		else if (iban.startsWith("OTH")) {
			System.out.println("Yurtdışı İşlemler"); 
			if (iban.endsWith("2000")) {
				System.out.println("Kıta İçi İşlemler");
				System.out.println(iban.replace("OTH","Ki"));
			}
				else { System.out.println("Kıta Dışı İşlemler");
				System.out.println(iban.replace("OTH","Kd"));
				}
		}
		
		/*
		String bankaKodu = iban.substring(iban.length()-4);
		switch (bankaKodu) {
		case "5001":
			System.out.println("Ziraat Bankası"); break;
		case "5002":
			System.out.println("Garanti Bankası"); break;
		case "5003":
			System.out.println("İş Bankası"); break;
			default: 
				System.out.println("Diğer");
		}
		*/
	}

}
