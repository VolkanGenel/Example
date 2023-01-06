package lesson022.okul;

import java.util.Scanner;

public class Test {
	/**
	 * Bir okulumuz olsun
	 * Okulda
	 * Öğrencilerimiz Öğretmenlerimiz  Ve memurlarımız olsun
	 * Memurlarımız kayıt alsın kayıt silsin ve bilgilendirme yapsın ve ders kaydı onaylasın
	 * Öğrencilerimiz ders kaydı oluştursun her dersin belli bir öğrenci kapasitesi olsun
	 * Öğretmenler ders verebilir etut yapabilir ve nöbetçi olabilirler
	 * Bir öğretmen en fazla 2 derse girebilir .
	 * Her çalışanın sicil numarası olsun  Ö-1, M-1
	 * @param args
	 * 
	 * memur
	 * 1- öğrenci kaydı yap
	 * 2- ogrenci kaydi sil
	 * 3-bilgilendirme yap
	 * 4- ders kaydi onayla
	 * 5- ogretmenler listesi
	 * 6- ogrenciler listesi
	 * 
	 * ogrenci
	 * 1- ders kaydi
	 * 2- not ortalaması göürntüle
	 * 3- aldığım dersleri listele
	 * 
	 * ogretmen
	 * 1- girdiğim dersleri listele
	 * 2- nobetcilik durumu sorgula
	 */

	Manager manager = new Manager();
	Memur memur = new Memur (null,null);
	Ogrenci ogrenci = new Ogrenci (null,null);
	Ogretmen ogretmen = new Ogretmen (null,null);
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		Memur memur = new Memur (null,null);
		Ogrenci ogrenci = new Ogrenci (null,null);
		Ogretmen ogretmen = new Ogretmen (null,null);
		manager.menu2(memur);
		System.out.println(OysUtility.stringDegerAlma("Lütfen Bir Değer Giriniz")); 
		memur.islemler(1);
	}
		
	public void memurPaneli() {

		System.out.println("*********************************");
		System.out.println("****   "+"Memur Paneli"+"    ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Ogrenci Kaydı Yap");
		System.out.println("2- Ogrenci Kaydı Sil");
		System.out.println("3- Bilgilendirme Yap");
		System.out.println("4- Ders Kaydı Onayla");
		System.out.println("5- Ogretmen Listesi");
		System.out.println("6- Ogrenci Listesi");
		System.out.println();
		switch (secimYap()) {
		case 1: memur.ogrenciKaydi(); break;
		case 2: memur.ogrenciKaydi(); break;
		case 3: memur.ogrenciKaydi(); break;
		case 4: memur.ogrenciKaydi(); break;
		case 5: memur.ogrenciKaydi(); break;
		case 6: memur.ogrenciKaydi(); break;
		default: System.out.println("Hatalı Giriş Yaptınız"); break;
		}
	}
	public void ogrenciPaneli() {

		System.out.println("*********************************");
		System.out.println("****   "+"Ogrenci Paneli"+"    ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Ders Kaydı Yap");
		System.out.println("2- Not Ortalaması Goster");
		System.out.println("3- Aldığım Dersleri Listele");
		System.out.println();
		switch (secimYap()) {
		case 1: ogrenci.dersKaydiOlustur();; break;
		case 2: System.out.println(ogrenci.getNotOrtalamasi()); break;
		case 3: System.out.println(ogrenci.getDersListesi());; break;
		default: System.out.println("Hatalı Giriş Yaptınız"); break;
	}
	}
	public void ogretmenPaneli() {

		System.out.println("*********************************");
		System.out.println("****   "+"Ogretmen Paneli"+"    ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Girdiğim Dersleri Listele");
		System.out.println("2- Nöbetçilik Durumu Sorgula");
		System.out.println();
		switch (secimYap()) {
		case 1: System.out.println(ogretmen.getDersListesi()); break;
		case 2: System.out.println(ogretmen.isNobetciMi()); break;
		default: System.out.println("Hatalı Giriş Yaptınız"); break;
	}
	}
	public int secimYap() {
		int secim;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Seçim Yapınız....: ");
		secim = sc.nextInt();
		return secim;
	}

}
