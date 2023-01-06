package lesson019.muzikaletleri;

public class Test {

	public static void main(String[] args) {
		MuzikAleti muzikaleti = new MuzikAleti("Türkiye", 2020, "Zil", "Vurmalı", 2);
		muzikaleti.bilgileriGoster();
		muzikaleti.cal();
		
		Calmali gitar = new Calmali();
		
		gitar.ad = "Gitar";
		gitar.mensei = "Amerika";
		gitar.tur = "Calmali";
		gitar.uretimyili=1956;
		gitar.telSayisi=5;
		gitar.bilgileriGoster();
		System.out.println("tel sayisi= " + gitar.telSayisi);
		gitar.cal();
		gitar.telleriDegistir();
		
		Bateri bateri = new Bateri();
		bateri.ad = "Bateri";
		bateri.yuzeyGenisligi= 10;
		
	}
}
