package lesson022.okul;

public class Manager {
	
	Okul okul;
	public Manager() {
		
	}
	
	 public void memurPaneli() {
	        System.out.println("1-Ogrenci Kaydı Yap");
	        System.out.println("2-Ogrenci Kaydı Sil");
	        System.out.println("3-Bilgilendirme");
	        System.out.println("4-Ders kayıt onayı");
	        System.out.println("5-Ogretmen Listesi");
	        System.out.println("6-Ogrenci Listesi");
	    }
	   public void ogrenciPaneli() {
	        System.out.println("1-Ders Kaydı Yap");
	        System.out.println("2-Not ortalaması görüntüle");
	        System.out.println("3-Aldığım dersleri listele");
	    }
	   public void ogretmenPaneli() {
	        System.out.println("1-Girdiğim dersleri Listele");
	        System.out.println("2-Nöbetcilik durumu sorgula");
	    }
	
	   public void menu (Kisi kisi) {
		
		if (kisi instanceof Memur) {
			memurPaneli();
		}
		else if (kisi.getClass().getSimpleName().equals("Ogrenci")) {
			ogrenciPaneli();
		}
		else  ogretmenPaneli();
	}
	
	public void menu2 (Kisi kisi) {
		kisi.menu();
	}
	
}
