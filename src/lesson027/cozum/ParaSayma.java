package lesson027.cozum;

import java.util.Stack;

public class ParaSayma {

	/*
	 * bir stack olusturacag�z bu stacke e 5 6 tane deger ekleyece�iz
	 * 
	 * 100 tlden yuksek olanlar� toplam deger�ne ekleyelim kucuk olanlar�da ba�ka
	 * bir stack e ekleyelim en sonundada toplam� ve yeni olusturdugumuz stacki
	 * yazd�ral�m
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Stack<Integer> paralar = new Stack<>();
		int toplam = 0;
		Stack<Integer> yuztldenKucukparalar = new Stack<>();
		paralar.push(120);
		paralar.push(12);
		paralar.push(250);
		paralar.push(180);
		paralar.push(80);
		paralar.push(10);
		paralar.push(1);
		paralar.push(1);

		// System.out.println(paralar.push(3));
		// System.out.println(paralar.add(3));

		while (!paralar.isEmpty()) {
			// int sayi = paralar.pop();
			if (paralar.peek() > 100) {
				toplam += paralar.pop();
			} else {
				yuztldenKucukparalar.add(paralar.pop());
			}
		}

		System.out.println("toplam= " + toplam);

		yuztldenKucukparalar.forEach(System.out::println);
	}
}
