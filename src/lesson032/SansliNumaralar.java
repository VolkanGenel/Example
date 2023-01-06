package lesson032;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SansliNumaralar {

	/*
	* 
	* 1 den 100 e kadar rastgele
	* 10 000 tane sayı ureteceğiz 
	* 1- sayıolustur metodu ile rastgele olusturduğumuz sayıları map a atacağız 
	* sayının kaç kere olduğunu tutacağız key değeri sayı 
	* value değeri ise kaç kere üretildiği.
	* 
	* 
	* 2-map de gezinirken  listeye ekleyeceğiz her eleman
	*  ne kadar tekrar ediyorsa o kadar
	* kez listeye ekleyeceğiz
	* 
	*3- en son listeden rastgele 10 adet değer alacağız ve bunu bir set e ekleyeceğiz 
	* Önce Collections.shuffle(liste) methodunu kullanalım
	* 
	* 4- Aynı  sette 50 den büyük sayıları getir.
	* 5- Setteki sayıların toplamını getir.
	* 
	* 
	*/
	Random random;
	
	
	public static void main(String[] args) {
		SansliNumaralar sanslinumaralar = new SansliNumaralar();
		sanslinumaralar.MapOlustur().forEach((k,v)-> System.out.println(k+" ===> "+v));
		System.out.println(sanslinumaralar.setOlustur());
		Set<Integer> set1 = sanslinumaralar.setOlustur().stream().filter((x)->x>50).collect(Collectors.toSet());
		System.out.println(set1);
		set1.forEach(System.out::println);
		System.out.println("============================");
		//sanslinumaralar.setOlustur().stream().filter((x)->x>50).forEach(System.out::println);
		/*
		int Toplam = 0;
		for (Integer integer : sanslinumaralar.setOlustur()) {
			Toplam += integer;
		} 
		System.out.println(Toplam);
		*/
		Optional<Integer> toplam = sanslinumaralar.setOlustur().stream().reduce((x,y) -> x+y);
		System.out.println(toplam);
		
		
		System.out.println("50den büyük sayıların toplamı");
        Optional<Integer> toplam2 = sanslinumaralar.setOlustur().stream().filter((x) -> x > 50)
                .reduce((x, y) -> x + y);    
        System.out.println(toplam2);
        sanslinumaralar.setOlustur().stream().filter((x) -> x > 50)
        .reduce((x, y) -> x + y).ifPresent(System.out::println);
        toplam2.ifPresent(System.out::println);
        
        // Optional Methodlar
        Integer toplam3 = toplam2.get();
        Optional<String> kelime = Optional.empty();
        System.out.println(toplam3);
        System.out.println(kelime);
        Optional<String> kelime2 = Optional.ofNullable(null);
        System.out.println(kelime2);
        Optional<String> kelime3 = Optional.of("Merhaba Dünya");
        System.out.println(kelime3.get());
        System.out.println(kelime2.isEmpty());
        System.out.println(kelime2.isPresent());
	}
	
	public int rastgeleSayiUret() {
		random = new Random();
		int rastgeleSayi = random.nextInt(1,101);
		return rastgeleSayi;
	}
	
	public int rastgeleYeniSayiUret(int minSayi, int maxSayi) {
		random = new Random();
		int rastgeleSayi = random.nextInt(minSayi,maxSayi);
		return rastgeleSayi;
	}
	
	public Map<Integer,Integer> MapOlustur() {
		
		Map <Integer, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < 10000; i++) {
			 int sayi= rastgeleSayiUret();
			if (map.containsKey(sayi)) {
				map.replace(sayi, map.get(sayi)+1);
			} else {
				map.put(sayi, 1);
			}
		}
		return map;
	}
	public List<Integer> listeOlustur () {
		List <Integer> liste = new ArrayList<>();
		MapOlustur().forEach((k,v)-> {
			for (int i = 0; i < v; i++) {
				liste.add(k);
			}
		});
		return liste;
		
		/**
		 * for (Entry<Integer,Integer> sayi : sayilarMap.entrySet()) {
		 * for (int i=0; i<sayi.getValue();i++) {
		 * sayilarListesi.add(sayi.getKey());
		 * }
		 * }
		 */
	}
	
	
	
	public Set <Integer> setOlustur() {
		Set <Integer> set = new HashSet<>();
		List <Integer> yeniListe = listeOlustur();
		Collections.shuffle(yeniListe);
		int y = 10;
		for (int i = 0; i < y; i++) {
			if (set.contains(yeniListe.get(i))) {
				y++; }
				set.add(yeniListe.get(i));
		}
		return set;
	}
}
