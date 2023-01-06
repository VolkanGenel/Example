package lesson018;

public class Test {

	public static void main(String[] args) {
	
		/*	
		Soru soru = new Soru();
		String[] cevapSecenekleri = {"A","B","C","D"};
		soru.soruOlustur(cevapSecenekleri);
		
		System.out.println("///////////////////////////");
		System.out.println(soru.icerik);
		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println(soru.cevapIcerikleri[i]);
		}
		
		*/
		
		Sinav sinav = new Sinav();
		sinav.sinavOlustur();
		sinav.cevaplariGir();
		sinav.cevapKontrol();
	}
}
