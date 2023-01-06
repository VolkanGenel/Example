package lesson022.okul;

public class Memur extends Calisan implements IOgrenciIsleri {

	
	
	public Memur(String ad, String soyad) {
		super(ad, soyad);
			}

	public Memur(String ad, String soyad, double maas, int calismaSaati) {
		super(ad, soyad, maas, calismaSaati);
	}
	
	@Override
	public Ogrenci ogrenciKaydi() {
		String isim = OysUtility.stringDegerAlma("Lütfen isim giriniz");
		String soyisim = OysUtility.stringDegerAlma("Lütfen soyisim giriniz");
		Ogrenci ogrenci = new Ogrenci(isim, soyisim);
	return ogrenci;
	}

	@Override
	public boolean ogrenciKaydiSil(String ogrenciNo) {
		return false;
	}

	@Override
	public void bilgilendirmeYap(Ogrenci ogrenci) {
		
	}

	@Override
	public boolean dersKaydiOnayla(Ders ders, Ogrenci ogrenci) {
		// TODO Auto-generated method stub
		return false;
	}
	public void menu() {
		int secim;
		do {
		super.menu();
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
		secim = OysUtility.intDegerAlma("Lütfen secim yapınız");
		islemler(secim);
		} while (secim!=0); 
	}
	public void ogrencileriListele() {
		for(Ogrenci ogrenci: Okul.ogrenciListesi) {
			System.out.println(ogrenci.toString());	
		}
	}
	
	public void islemler (int secim) {
		switch (secim) {
		case 1: 
			Ogrenci ogrenci = ogrenciKaydi();
			Okul.ogrenciListesi.add(ogrenci);
			System.out.println(ogrenci.getAd()+"adlı öğrenci başarılı bir şekilde kayıt olmuştur");
			break;
		case 2: ogrenciKaydiSil("sşsş"); break;
//		case 3: memur.ogrenciKaydi(); break;
//		case 4: memur.ogrenciKaydi(); break;
//		case 5: memur.ogrenciKaydi(); break;
		case 6: ogrencileriListele(); break;
		default: System.out.println("Hatalı Giriş Yaptınız"); break;
		}
	}
}
