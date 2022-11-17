package lesson009;

import java.util.Scanner;

/*
 * türkçe karakterleri İngilizce karaktere çevirme
 * Bir method yazalım içinde bir string değer alalım
 * sonra türkçe karakterleri ing karakterler dönüştürülmüş halini ger dönelim.
 * döndüğümüz String değerini main methoda yazdıralım.
 */

public class Question45 {

	public static void main(String[] args) {
		 String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
	      String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
	
	System.out.println(changeString(ingilizceKarakter, turkceKarakter));  
	
	}
	
	public static String changeString(String[] eng, String[] tr) {
	Scanner sc =new Scanner (System.in);
	String value = sc.nextLine();
	for (int i = 0; i < value.length(); i++) {
		value =value.replace(tr[i], eng[i]);	
		}
		return value;
	}
		
	
	      
	
	public static String cevirme() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz...: ");
		String kelime = sc.nextLine();
		kelime = kelime.replace('İ', 'I').replace("ı", "i");
		return kelime;
	}

}
