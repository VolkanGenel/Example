package lesson031;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		PlakaTahmin plakaTahmin = new PlakaTahmin();
		plakaTahmin.mapOlustur();
		plakaTahmin.sehirMap.forEach((k,v)->System.out.println(k+ "-"+v));
		plakaTahmin.menu();;
	}

}
