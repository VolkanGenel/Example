package lesson005;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir değer alacağız
		 * içinde kaç tane a var bize değerini döndürsün
		 */

		Scanner sc=new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = sc.nextLine();
		int i;
		int toplam=0;
		int sayac=0;
		for (i=0;i<=kelime.length()-1;i++) {
		if (kelime.charAt(i)==('a')) {
			sayac++;
			}
		}
		System.out.println(sayac);
	}
/*if (kelime.indexOf("a")>=0) {
 * toplam +=1;
 * kelime= kelime.substring((kelime.indexOf("a");
 */	
}