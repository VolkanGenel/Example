package lesson005;
import java.util.Scanner;
public class Question22 {

	public static void main(String[] args) {

		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
		// burc hesabı yapan program

		// Koç Burcu : 21 Mart - 20 Nisan
		//
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		//
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		//
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		//
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		//
		// Başak Burcu : 23 Ağustos - 22 Eylül
		//
		// Terazi Burcu : 23 Eylül - 22 Ekim
		//
		// Akrep Burcu : 23 Ekim - 21 Kasım
		//
		// Yay Burcu : 22 Kasım - 21 Aralık
		//
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		//
		// Balık Burcu : 20 Şubat - 20 Mart
		
		Scanner sc = new Scanner(System.in);
        int gun,ay;
        boolean isError = false;
        
        do {
        System.out.println("Lütfen doğduğunuz günü giriniz: ");
        gun = sc.nextInt();
        System.out.println("Lütfen doğduğunuz ayı giriniz: ");
        ay = sc.nextInt();
        if (gun>31 || gun<=0) isError=true;
        else if (ay>12 || ay<=0) {isError=true;}
        else isError =false;
        } while(isError==true);
      
        switch (ay) {
		case 1:
			if (gun<22) System.out.println("Burcunuz Oğlak");
			else System.out.println("Burcunuz Kova");
			break;
		case 2:
			if (gun<20) System.out.println("Burcunuz Kova");
			else if (gun > 29 || gun < 1) {
                System.out.println(
                        "Şubat Ayının son gün 29 Şubattır ve  ilk günü 1 Şubattır\nsizin girdiğiniz değer: " + gun);
            }
			else System.out.println("Burcunuz Balık");
			break;
		case 3:
			if  (gun<21) System.out.println("Burcunuz Balık");
			else System.out.println("Burcunuz Koç");
			break;
		case 4: 
			if (gun<21) System.out.println("Burcunuz Koç");
			else if (gun > 30 || gun < 1) {
                System.out.println(
                        "Nisan Ayının son gün 30 Nisandır  ve  ilk günü 1 Nisandır\nsizin girdiğiniz değer: " + gun);
            }
			else System.out.println("Burcunuz Boğa");
			break;
		case 5: 
			if (gun<22) System.out.println("Burcunuz Boğa");
			else System.out.println("Burcunuz İkizler");
			break;
		case 6: 
			if (gun<23) System.out.println("Burcunuz İkizler");
			else if (gun > 30 || gun < 1) {
                System.out.println(
                        "Haziran Ayının son günü 30 Temmuzdur ilk günü 1 Hazirandır,\n sizin girdiğiniz değer:" + gun);
           } 
			else System.out.println("Burcunuz Yengeç");
			break;
		case 7: 
			if (gun<23) System.out.println("Burcunuz Yengeç");
			else System.out.println("Burcunuz Aslan");
			break;
		case 8: 
			if (gun<23) System.out.println("Burcunuz Aslan");
			else System.out.println("Burcunuz Başak");
			break;
		case 9: 
			if (gun<23) System.out.println("Burcunuz Başak");
			else if (gun > 30 || gun < 1) {
                System.out.println(
                        "Eylül Ayının son günü 30 Eylüldür ilk günü 1 Eylüldür,\n sizin girdiğiniz değer:" + gun);
           }
			else System.out.println("Burcunuz Terazi");
			break;
		case 10: 
			if (gun<23) System.out.println("Burcunuz Terazi");
			else System.out.println("Burcunuz Akrep");
			break;
		case 11: 
			if (gun<22) System.out.println("Burcunuz Akrep");
			else if (gun > 30 || gun < 1) {
                System.out.println(
                        "Kasım Ayının son günü 30 Kasımdır ilk günü 1 Kasımdır ,\n sizin girdiğiniz değer:" + gun);
           }
			else System.out.println("Burcunuz Yay");
			break;
		default: 
			if (gun<22) System.out.println("Burcunuz Yay");
		else System.out.println("Burcunuz Oğlak");
			break;
		}
	}

}
