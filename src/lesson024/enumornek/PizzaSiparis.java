package lesson024.enumornek;

public class PizzaSiparis {


		//System.out.println(hamurTipiSec());
		//Dışarıdan girilen string değere göre bize enum değerini dönüyor.
		
		/*
		 * pizzamızın hamur tipini .boyutunu ve turunu secip bize bir pizza olarak dönen
		 * metodu yazalım ve pizzayı yazdıralım
		 */
		/*
		System.out.println(HamurTipi.valueOf("Normal"));
		System.out.println(hamurTipiSec2("Kalın"));
		
		System.out.println(HamurTipi.Kalın.name());
		System.out.println(HamurTipi.Kalın.ordinal());
		System.out.println(HamurTipi.Kalın.toString());
		
		HamurTipi[] hamurtipleri = HamurTipi.values();
		for(HamurTipi tip: hamurtipleri)
		System.out.println(tip);
		*/
		
		
	
	public void menu() {
		Pizza pizza = pizzaSec();
		siparisHazirlama(pizza);
	}
	
	public Pizza pizzaSec() {
		HamurTipi hamurtipi = hamurTipiSec();
		Boy boyut = boyutuSec();
		Tur tur = turSec();
		Pizza pizza = new Pizza(boyut, tur, hamurtipi);
		return pizza;
	}
	
	public void siparisHazirlama (Pizza pizza) {
		System.out.println("Siparişiniz=====> "+ pizza);
		System.out.println("Hazırlanıyor ......");
	}
	public Tur turSec() {
		for (Tur tur : Tur.values()) {
			System.out.println((tur.ordinal()+1)+"-"+tur);	
			}
			int secim = Utility.intDegerAlma("Lütfen Pizza Türünü Seçiniz");
			switch (secim) {
			case 1: 
			return Tur.Tonbalıklı;
			case 2: 
				return Tur.Karışık;
			case 3: 
				return Tur.Akdeniz;	
			default: return null;
			}
	}
	
	public Boy boyutuSec() {
		for (Boy boyut : Boy.values()) {
		System.out.println((boyut.ordinal()+1)+"-"+boyut);	
		}
		int secim = Utility.intDegerAlma("Lütfen Pizza Boyutunu Seçiniz");
		switch (secim) {
		case 1: 
		return Boy.Kucuk;
		case 2: 
			return Boy.Orta;
		case 3: 
			return Boy.Buyuk;
		
		default: return null;
		}
	}
	public HamurTipi hamurTipiSec() {
		for(HamurTipi tip: HamurTipi.values()) {
			 System.out.println((tip.ordinal() + 1) + "-" + tip);
		}
		int secim = Utility.intDegerAlma("Lütfen Hamur Tipi Seçiniz");
		switch (secim) {
		case 1:
			return HamurTipi.İnce;
		case 2:
			return HamurTipi.Normal;
		case 3:
			return HamurTipi.Kalın;
		default: return null;
		}
	}
	
	public static HamurTipi hamurTipiSec2(String tip) {
	return HamurTipi.valueOf(tip);
	}
	
}
