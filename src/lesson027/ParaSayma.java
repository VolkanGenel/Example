package lesson027;

import java.util.Random;
import java.util.Stack;

public class ParaSayma {

	public static void main(String[] args) {

		/*
		 * Bir stack oluşturacağız bu stack e 5 6 tane değer ekleyeceğiz
		 * 
		 * 100 tlden yüksek olanları toplam değerine ekleyelim kucuk olanları başka
		 * bir stack e ekleyelim
		 * en sonunda toplamı ve yeni oluşturduğumuz stacki yazdıralım.
		 */
		
		Stack<Integer> stacklist = new Stack<Integer>();
		Stack<Integer> listYigit = new Stack <Integer>();

		Random random = new Random();
		int toplam = 0;
		int deger = random.nextInt(250);
		stacklist.add(deger);
		stacklist.add(150);
		stacklist.add(200);
		stacklist.add(250);
		stacklist.add(80);
		stacklist.add(20);
		stacklist.forEach(System.out::println);
		System.out.println(stacklist.size());
		System.out.println(stacklist.get(0));
		int sayi =stacklist.size();
		while (stacklist.size()!=0) {
			if (stacklist.peek()>100)
				toplam += stacklist.pop();
			else {
				listYigit.add(stacklist.pop());	
			}
		}
		System.out.println(toplam);
		for (Integer integer : listYigit) {	
			System.out.println("100'den küçük değerler.....: "+integer);
		}
	}
}
