package lesson031;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
/*
* 
* -bu arrayden bir map olusturan metodu yazalım 
* key degerleri plaka degerleri olsun value şehir olsun 
* 1,2,3 
* 
* oyun sayısını 
* hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz 
* 
* menumuz olacak 
* 
* Sehir tahmin oyunana hosgeldiniz
* Her oyun için 3 tahmin hakkınız bulunmaktadır 
* 
* 1-oyuna basla
* 
* 1.oyun (kacıncı oyundaysak)
* 3 tahmin hakkımız var(herdefasında azalacak)
* 
* Random bir plaka uretecegiz 
* ve kullanıcıya soru soracagız bu plaka hangi ile atittir 
* kullanıcıdan gelen degere gore işlem yapacagız dogruysa bildiniz
* yanlıssa tekrar deneyin cıktısını verip basa donecegiz (toplamda 3 tahmin hakkımız bulunmaktadır)
* başarılı bildiğimiz zaman ve tahmin hakkımız kalmadıgı zman ana menuye donsun 
* 
* 
* 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim 
* her oyunun tahminlerini bir yerde tutacagım sonra burayı cagırdıgım zaman 
* her oyunun tahminleri ayrı ayrı yazılsın  
*  
* 3- cıkıs
* 
* 
*/

public class PlakaTahmin {
	
	Map<Integer, String> sehirMap = new TreeMap<>();
	Scanner sc;
	Random rand;
	Map<Integer, List<String>> tahminlerim = new LinkedHashMap<>();
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
            "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
            "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
            "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
            "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
            "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
            "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
            "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
            "Kilis", "Osmaniye", "Düzce" };
		
	int oyunSayisi=0;
	int hak;
	
	public void mapOlustur() {

			
		for (int i = 0; i < iller.length; i++) {
			sehirMap.put(i+1, iller[i]);
		}
	}
	
	public void menu() {
		int secim=0;
		sc = new Scanner (System.in);
		do {
		System.out.println("Şehir tahmin oyununa hoşgeldiniz");
		System.out.println("Her Oyunda 3 tahmin hakkınız var");
		System.out.println("================================");
		System.out.println("1 - Oyuna Başla");
		System.out.println("2 - Eski Tahminlerimi Listele");
		System.out.println("3 - Çıkış");
		secim = sc.nextInt();
		switch (secim) {
		case 1: oyunOyna(); break;
		case 2: tahminlerim.forEach((x,y)->System.out.println(x+". Oyun Tahminleri "+y)); break;
		case 3: System.out.println("Başarıyla Çıkış Yaptınız"); break;
		default: System.out.println("Hatalı Giriş Yaptınız");
			break;
		}
		} while (secim!=3);
	}
	public int rastgelePlaka() {
		return Utility.randomSayiUret(1, iller.length+1);
	}
	public void oyunOyna() {
		int sorulanPlaka = rastgelePlaka();
		System.out.println(sorulanPlaka+" plaka kodu hangi şehre aittir? ");
		sc = new Scanner(System.in);
		String tahmin;
		oyunSayisi++;
		List <String> tahminler =  new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println((3-i)+" hakkınız var");
			tahmin = sc.nextLine().trim();
			tahminler.add(tahmin);
			
		if (iller[sorulanPlaka-1].equalsIgnoreCase(tahmin)) {		
			System.out.println("Tebrikler Bildiniz");
			break;
		}
		else System.out.println("Bilemediniz");
		}		
		System.out.println("Oyun Sonlandı");
		tahminlerim.put(oyunSayisi,tahminler);
	}
}
