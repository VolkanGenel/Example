package lesson005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
/*Dışarıdan bir kelime girin her harf
 * başına index numarası kullanılarak alt alt yazdırınız.
 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen Bir Kelime Giriniz");
		String kelime = sc.nextLine();
		int i;
		for (i=0;i<=kelime.length()-1;i++)
			System.out.println(i+"-"+kelime.charAt(i));
	}

}
