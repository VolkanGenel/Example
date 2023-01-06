package lesson027.cozum;

import java.util.Scanner;
import java.util.Stack;

/*
 * 
 * d��ar�dan bir metin girece�iz sonra bu metini bir stack e atayacag�z
 * 
 * daha sonrada palindrom olup olmad�g�n� kontrol eden metodu yazal�m 
 * 
 * 
 */
public class PalindromStack {

	Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		PalindromStack palindromStack = new PalindromStack();

		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen bir kelime giriniz");
		String kelime = scanner.nextLine();

		if (palindromStack.isPalindrom(kelime)) {
			System.out.println(kelime + " Palindromdur");
		} else {
			System.out.println(kelime + " Palindrom de�ildir !!!");
		}

	}

	public void stackOlusturma(String kelime) {

		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}

//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//
//		}
	}

	public boolean isPalindrom(String kelime) {

		stackOlusturma(kelime);

		for (int i = 0; i < kelime.length() / 2; i++) {

			if (kelime.charAt(i) != stack.pop()) {
				return false;
			}
		}

		return true;

	}

}
