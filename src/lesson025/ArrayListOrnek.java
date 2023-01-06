package lesson025;

import java.util.ArrayList;
import java.util.List;

/*
* Bir tane String arraylisti oluşturalım
*
* Ankara
* Bursa
* Antalya
* Artvin
* Erzurum
* Karaman
*/
public class ArrayListOrnek {


public static void main(String[] args) {
	List<String> sehirler = new ArrayList<String>();
	sehirler.add("Ankara");
	sehirler.add("Bursa");
	sehirler.add("Antalya");
	sehirler.add("Artvin");
	sehirler.add("Erzurum");
	sehirler.add("Karaman");
	List<String> kentler = new ArrayList<String>();	
	for (String sehir : sehirler) {
		if (!sehir.startsWith("An")) {
			kentler.add(sehir);
			}
		}
	for (String kent : kentler) {
		System.out.println(kent);
	}
	
	for (int i = 0; i < sehirler.size(); i++) {
		if (sehirler.get(i).startsWith("An")) {
			sehirler.set(i, "xxx");
		}
	}
	for (String sehir : sehirler) {
		System.out.println(sehir);
	}
	
	
}
}