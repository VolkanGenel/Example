package lesson006;

import java.util.Scanner;

public class Question28 {
	public static void main(String[] args) {
		
	

	/*
	 * =Java,React,Spring
	 * 
	 * split kullanmadan virgülden bölüp bir for
	 * dögüsü içinde
	 * Java
	 * React
	 * Spring yapın
	 */
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Lütfen 3 kelime ve 2 virgülden oluşan sözcükler giriniz");
	String kelime = sc.nextLine();
	System.out.println(kelime);
	kelime = kelime.replace(",","\n");
	System.out.println(kelime);
	
	int index=0;
	String ifade = "Java,React,Spring";
	
	for (int i=0;i<ifade.length();i++) {
		if (ifade.charAt(i) == ',') {
		System.out.println(ifade.substring(index, i));
		index = i+1;		 
		}	
	}
	System.out.println(index);
	System.out.println(ifade.substring(index));
	 
	for (int i = 0; i < ifade.length(); i++) {
        if (ifade.charAt(i) == ',') {
             System.out.println();
         } else {
             System.out.print(ifade.charAt(i));
         }
     }
	}
}
