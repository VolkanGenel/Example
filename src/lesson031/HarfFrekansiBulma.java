package lesson031;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HarfFrekansiBulma {
	/*
	* 
	* dışarıdan bir string değeri gireceğiz
	* 
	* bir map içine atacağız  merhaba
	* 
	* m=1
	* e=1
	* r=1
	* h=1
	* a=2
	* b=1
	* 
	*/

	public static void main(String[] args) {
	/*	
		Map<Character, Integer> harfSayisi = new LinkedHashMap<Character, Integer>();
		System.out.println("Lütfen bir kelime giriniz...: ");
		Scanner sc = new Scanner(System.in);
		String kelime = sc.nextLine();
		for (int i = 0; i < kelime.length(); i++) {
			if (harfSayisi.containsKey(kelime.charAt(i))) {
				harfSayisi.put(kelime.charAt(i),harfSayisi.get(kelime.charAt(i))+1); }
			else 
				harfSayisi.put(kelime.charAt(i),1);
		}
		harfSayisi.forEach((k,v)->System.out.println(k+ " -> "+v));
		*/	
		Map<Character, Integer> map = new LinkedHashMap<>();
		String kelime = "merhaba";
		
		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				map.replace(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		map.entrySet().forEach(System.out::println);
		for (Entry<Character, Integer> string : map.entrySet()) {
			System.out.println(string.getKey()+"-"+string.getValue());
		}
		map.forEach((k,v)->System.out.println(k+ " -> "+v));
	}
}
