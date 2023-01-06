package lesson030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {
	
	String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
    int[] notlar = { 60, 80, 70 };
    static int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
	Map<String, Integer> ogrenciNotlari = new HashMap<>();
	Map<String, List<Integer>> ogrenciButunNotlari = new HashMap<>();

	
	
	public static void main(String[] args) {
		   
		MapOrnek2 ornek = new MapOrnek2();
		ornek.mapOlustur();
		ornek.ogrenciNotlari.forEach((k,v)->System.out.println(k+ " -> "+v));
		System.out.println(ornek.ogrenciNotlari.get("Ece"));
		
		for (Entry<String,Integer> r : ornek.ogrenciNotlari.entrySet()) {
			System.out.println(r.getKey()+"--->"+r.getValue());
		}
		
		for (int i = 0; i < ornek.ogrenci.length; i++) {
			List <Integer> ogrencilerinNotlari = new ArrayList<Integer>();
			for (int j = 0; j < ornek.notlar.length ; j++) {
				ogrencilerinNotlari.add(ornek.notlar2[i][j]) ;
			}
			ornek.ogrenciButunNotlari.put(ornek.ogrenci[i], ogrencilerinNotlari);
		}
		ornek.ogrenciButunNotlari.forEach((k,v)->System.out.println(k+ " -> "+v));
		/**
		Map<String, List<Integer>> map = new HashMap<>();
		map.forEach((k, v) -> {
            System.out.println(k + ": ");
            v.forEach((t) -> System.out.print(t + ","));
//            for (int i = 0; i < v.size(); i++) {
//                System.out.print(v.get(i) + ",");
//            }
            System.out.println();
        });

        for (Entry<String, List<Integer>> ogrenciler : map.entrySet()) {
            System.out.print(ogrenciler.getKey() + "==> ");
            for (Integer not : ogrenciler.getValue()) {
                System.out.print(not + " ");
            }
        }
        */
	}
	public void mapOlustur() {
	
		for (int i = 0; i < notlar.length; i++) {
			ogrenciNotlari.put(ogrenci[i],notlar[i]);
//			System.out.println(ogrenciNotlari.get(ogrenci[i]));
		}
//		ogrenciNotlari.forEach((k,v)->System.out.println(k+ " -> "+v));	
	}
	
}
