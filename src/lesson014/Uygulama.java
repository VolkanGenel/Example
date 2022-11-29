package lesson014;

import java.util.Scanner;

public class Uygulama {
	static Scanner sc = new Scanner(System.in);
/*
   System.out.println("1-Kayıt Ol");
   System.out.println("2-Giriş Yap");
   System.out.println("3-Kullanıcıları göster");
   System.out.println("4-Çıkış");
*/
	
/*
 * 1- menümüzü oluşturacapız
 * 2- seçim yapacağız
 * 3- seçime göre methodları yazacapız
 * 3-1 Kayıt ol methodu yazalım () bizden bilgilerimizi alacak gidecek database
 * sınıfındaki listeye kullanıcıyı ekleyecek.	
 */
public static void main(String[] args) {
	
	uygulamayiBaslat();
}
	public static void menu() {
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
	    System.out.println("3-Kullanıcıları göster");
	    System.out.println("4-Çıkış");
	}
	
	public static int secimYap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Seçiminizi Yapınız");
		return sc.nextInt();
	}
	
	public static void uygulamayiBaslat() {
		
		int secim;
		do {
		menu();
		Scanner sc = new Scanner(System.in);
		secim=sc.nextInt();
		switch (secim) {
		
		case 1: kayitOl();break;
		case 2: girisYap();
		break;
		case 3: kullaniclariGoster();
		break;
		case 4: System.out.println("Güvenli bir şekilde çıkış yaptınız");
		break;
		default:
			System.out.println("Hatalı giriş yaptınızé");
			break;
		}
		}while(secim!=4);
}	
	public static void kayitOl() {
		Scanner sc = new Scanner(System.in);
		if (Database.uzunluk==Database.kullaniciListesi.length) {System.out.println("Kullanıcı Sayısı Dolmuştur");
		Database.veriTabaniBaslangicDegerleri();}
		else {
		Database.veriTabaniBaslangicDegerleri();
		Kullanici kullanici4 = new Kullanici();
		System.out.println("Lütfen adınızı giriniz");
		String isim= sc.nextLine();
		System.out.println("Lütfen mailinizi giriniz");
		String mail= sc.nextLine();
		System.out.println("Lütfen şifrenizi giriniz");
		String password= sc.nextLine();
		kullanici4.isim=isim;
		kullanici4.email=mail;
		kullanici4.password=password;
		kullanici4.id=Database.uzunluk+1;
		Database.kullaniciEkle(kullanici4);
		}	
	}
	public static void kullaniclariGoster() {
		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
			if (Database.kullaniciListesi[i]==null) {
			System.out.println(Database.kullaniciListesi[i]);
			}
			else {
			System.out.print(Database.kullaniciListesi[i].isim);
			System.out.println(Database.kullaniciListesi[i].id);
			}
		}
	}
	public static void girisYap() {
		boolean x = false;
		int sayac=0;
		do {
		System.out.println("Lütfen Kullanıcı Mailinizi Giriniz");
		String mail=sc.nextLine();
		System.out.println("Lütfen Kullanıcı Şifrenizi Giriniz");
		String sifre=sc.nextLine();
		
		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
			if (Database.kullaniciListesi[i]!=null) {
			if (Database.kullaniciListesi[i].email.equals(mail) && 
				Database.kullaniciListesi[i].password.equals(sifre)) {
				System.out.println("Hosgeldiniz");
				x=true;
			}
			
			}
			
		} if(x==false) {
			System.out.println("Hatalı Giriş Yaptınız");
			sayac++;}
		} while (x==false && sayac <3);
		
	}
}
