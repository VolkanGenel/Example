package lesson031.cozum;
/*
 * 
 * -bu arrayden bir map olusturan metodu yazal�m 
 * key degerleri plaka degerleri olsun value �ehir olsun 
 * 1,2,3 
 * 
 * oyun say�s�n� 
 * hakk�m�z olsun () --> bir oyunda 3 kere tahminde bulunabiliriz 
 * 
 * menumuz olacak 
 * 
 * Sehir tahmin oyunana hosgeldiniz
 * Her oyun i�in 3 tahmin hakk�n�z bulunmaktad�r 
 * 
 * 1-oyuna basla
 * 
 * 1.oyun (kac�nc� oyundaysak)
 * 3 tahmin hakk�m�z var(herdefas�nda azalacak)
 * 
 * Random bir plaka uretecegiz 
 * ve kullan�c�ya soru soracag�z bu plaka hangi ile atittir 
 * kullan�c�dan gelen degere gore i�lem yapacag�z dogruysa bildiniz
 * yanl�ssa tekrar deneyin c�kt�s�n� verip basa donecegiz (toplamda 3 tahmin hakk�m�z bulunmaktad�r)
 * ba�ar�l� bildi�imiz zaman ve tahmin hakk�m�z kalmad�g� zaman ana menuye donsun 
 * 
 * 
 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim 
 * her oyunun tahminlerini bir yerde tutacag�m sonra buray� cag�rd�g�m zaman 
 * her oyunun tahminleri ayr� ayr� yaz�ls�n  
 *  
 * 3- c�k�s
 * 
 * 
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PlakaTahmin {

	String[] iller = { "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd�n",
			"Bal�kesir", "Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum",
			"Denizli", "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir", "Gaziantep", "Giresun",
			"G�m��hane", "Hakkari", "Hatay", "Isparta", "Mersin", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
			"K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa", "Kahramanmara�", "Mardin",
			"Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirda�", "Tokat", "Trabzon", "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan", "I�d�r", "Yalova", "Karab�k",
			"Kilis", "Osmaniye", "D�zce" };

	Map<Integer, String> sehirMap = new LinkedHashMap<>();

	Map<Integer, List<String>> eskiTahminler = new LinkedHashMap<>();

	int oyunSayisi;
	int hak = 3;

	public PlakaTahmin() {

	}

	public void mapOlustur() {
		for (int i = 0; i < iller.length; i++) {
			sehirMap.put(i + 1, iller[i]);
		}

	}

	public void menu() {
		int secim = 3;
		do {

			System.out.println("Sehir tahmin oyunana hosgeldiniz\n" + "Her oyun i�in 3 tahmin hakk�n�z bulunmaktad�r");
			System.out.println("==========================");
			System.out.println("1-Oyuna Ba�la");
			System.out.println("2-Eski Tahminlerim");
			System.out.println("3-��k��");
			secim = Utility.intDegerAlma("L�tfen bir Secim Yap�n�z");
			switch (secim) {
			case 1:
				oyunOyna();
				break;
			case 2:
				tahminleriYazdir();
				break;
			case 3:

				break;

			default:
				break;
			}

		} while (secim != 3);

	}

	public void oyunOyna() {
		int plaka = randomPlakaUret();
		oyunSayisi++;
		System.out.println(oyunSayisi + ". oyun");
		tahminEt(plaka);

	}

	public void tahminEt(int plaka) {

		List<String> tahminler = new ArrayList<>();
		for (int i = 0; i < hak; i++) {
			System.out.println("kalan hakk�n�z:" + (hak - i));
			String tahmin = Utility.stringDegerAlma(plaka + " plaka kodu hangi �ehire  aittir l�tfen giriniz:");
			tahminler.add(tahmin);

			if (sehirMap.get(plaka).equalsIgnoreCase(tahmin)) {
				System.out.println("Tebrikler bildiniz");
				break;
			} else {

				System.out.println("Yanl�� Tahmin");
			}

		}

		eskiTahminler.put(oyunSayisi, tahminler);
	}

	public void tahminleriYazdir() {
		eskiTahminler.forEach((x, y) -> System.out.println(x + ". oyun tahminleri =" + y));

	}

	public int randomPlakaUret() {
		return Utility.randomSayiUret(1, iller.length + 1);
	}

}
