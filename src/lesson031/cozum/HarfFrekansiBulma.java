package lesson031.cozum;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 
 * d��ar�dan bir string de�eri girece�iz

 * 
 * bir map i�ine ataca��z  merhaba
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 * 
 */
public class HarfFrekansiBulma {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		String kelime = "merhaba";

		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) { // m=1,e=1,r=1,h=1 a=1,b=1;
				// map.put(c, map.get(c) + 1);
				map.replace(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// map.entrySet().forEach(System.out::println);

		for (Entry<Character, Integer> string : map.entrySet()) {
			System.out.println(string.getKey() + "=" + string.getValue());
		}

		map.forEach((x, y) -> System.out.println(x + "=" + y));

	}

}
