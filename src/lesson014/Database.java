package lesson014;


import java.util.Scanner;


public class Database {

static Kullanici[] kullaniciListesi=new Kullanici[6];
	
static int uzunluk=0;	
	
public static void veriTabaniBaslangicDegerleri() {
	Kullanici kullanici = new Kullanici();
	kullanici.isim="Mustafa";
	kullanici.email="mustafa@gmail.com";
	kullanici.password="123";
	kullanici.id= uzunluk+1;
	kullaniciListesi[0] =kullanici;
	uzunluk++;
	
	Kullanici kullanici2 = new Kullanici();
	kullanici2.isim="Ahmet";
	kullanici2.email="ahmet@gmail.com";
	kullanici2.password="123";
	kullanici2.id=uzunluk+1;
	kullaniciListesi[1] =kullanici2;
	uzunluk++;
	
	Kullanici kullanici3 = new Kullanici();
	kullanici3.isim="Mehmet";
	kullanici3.email="mehmet@gmail.com";
	kullanici3.password="123";
	kullanici3.id=uzunluk+1;
	kullaniciListesi[2] =kullanici3;
	uzunluk++;

}
	public static void kullaniciEkle (Kullanici x) {
		if (uzunluk>=kullaniciListesi.length -2) {
			Kullanici [] temp = kullaniciListesi;
			kullaniciListesi = new Kullanici[uzunluk+5];
			for (int i = 0; i < temp.length; i++) {
				kullaniciListesi[i]=temp[i];
			}
		}
	if (uzunluk < kullaniciListesi.length) {		
		kullaniciListesi[uzunluk]=x;
		uzunluk++;
	}
	}
	
}
