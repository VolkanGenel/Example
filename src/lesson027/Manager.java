package lesson027;

import java.util.Random;
import java.util.Stack;

public class Manager {
static int value;
	

	

	public static void main(String[] args) {
		Stack<Integer> stacklistTemiz = new Stack<Integer>();
		Stack<Integer> stacklistKirli = new Stack<Integer>();

		for (int i = 0; i < 10; i++) {
			value++;
			Tabak tabak = new Tabak(value,rastgele() );
			if (tabak.getTemizMi().equalsIgnoreCase("temiz")) { 
				stacklistTemiz.add(tabak.getId()); 
			}else {stacklistKirli.add(tabak.getId());
			}
			
			}
		for (Integer integer : stacklistKirli) {
			System.out.println("Kirli...: "+integer);
		}
		for (Integer integer : stacklistTemiz) {
			System.out.println("Temiz...: "+integer);
		}
	}
	
	
	public static String kullan() {
		Random rand = new Random();
		int sayi = rand.nextInt(2);
		if (sayi==0)
		return "temizle";
		else
		return "kullan";
	}
	
	public static String rastgele() {
		Random rand = new Random();
		int sayi = rand.nextInt(2);
		if (sayi==0)
			return "temiz";
		else
		return "kirli";
	}

}
