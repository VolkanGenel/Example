package lesson029;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOdev {
	
static Set<Character> tekrarlayanSet = new HashSet<>();
static Set<Character> tekrarlamayanSet = new HashSet<>();
	/*
	* Dışarıdan bir string deger alacağız 
	* 
	*bu string degerdeki her harfi kontrol edeceğiz tekrar edenleri bir sete 
	*tekrar etmeyenleri başka bir sete atacagız 
	* 
	* daha sonra bu iki seti yazdıracagız
	* 
	* araba
	* 
	* tekrar edenler
	* a
	* tekrar etmeyenler
	* r
	* b
	* 
	*/
	
	public static void main(String[] args) {
		
	karakterEkle(kelimeGir());
}
	public static String kelimeGir() {
		System.out.println("Kelime Giriniz");
	    Scanner scanner = new Scanner (System.in);
	    String kelime = scanner.nextLine();  
	    return kelime;
	}


public static void karakterEkle(String girilenkelime) {
	String kelime = girilenkelime.toLowerCase().trim();
	for (int i = 0; i < kelime.length(); i++) {
	if (!tekrarlamayanSet.contains(kelime.charAt(i))) {
		tekrarlamayanSet.add(kelime.charAt(i));
//		System.out.println(kelime.charAt(i) + " basarılı bir şekilde eklenmiştir");
    } else {
    	tekrarlayanSet.add(kelime.charAt(i)); 
    }
	  }
	tekrarlamayanSet.removeAll(tekrarlayanSet);
	System.out.println("Tekrarlamayan Set");
	for (Character character : tekrarlamayanSet) {
		System.out.println(character);
	}
	System.out.println("Tekrarlayan Set");
	tekrarlayanSet.forEach(System.out::print);	
}
}
