package lesson023.polimorphism;

public class Test {

	/**
	 * Polimorphism 
	 * final değişmezliği granti eder.
	 * abstract // soyut sunıftır.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Ucak ucak = new Ucak();
		 * Araba araba = new Araba();
		 * Bisiklet bisiklet = new Bisiklet();
		*/
		Arac arac = new Arac();
		arac.ilerle();
		arac.durma();
		
		Arac arac1 = new Ucak();
		arac1.ilerle();
		arac1.durma();
		
		Arac arac2 = new Bisiklet();
		arac2.ilerle();
		arac2.durma();
		
		Arac arac3 = new Araba();
		arac3.ilerle();
		arac3.durma();
		
		Bisiklet bisiklet = new Bisiklet(); // Aracı extend eden sınıf olduğu için çalışır.
		hareketEt(arac3);
		hareketEt(bisiklet); // Bu da olur çünkü aracı extend eden sınıf.
		
		
		hareketEt2(arac1);
		hareketEt2(arac2);
		hareketEt2(arac3);
		
		IHareket hareket = new Bisiklet();
		hareketEt(hareket);
	}
	
	
	public static void hareketEt(IHareket arac) {
		arac.ilerle();
	}
	public static void hareketEt(Arac arac) {
		arac.ilerle();
	}
	public static void hareketEt2(Arac arac) {
		if (arac instanceof Bisiklet) {
			System.out.println("Bisiklet hareket ediyor");
		} else if (arac instanceof Araba) {
			System.out.println("Araba hareket ediyor");
		} else {
			System.out.println("Ucak hareket ediyor");
		}
	}
	
	
}
