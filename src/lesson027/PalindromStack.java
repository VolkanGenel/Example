package lesson027;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {

	/*
	 * Dışarıdan bir metin gireceğiz sonra bu metini bir stacke atayacağız.
	 * daha sonra palindrom olup olmadığını kontrol eden methodu yazacağız.
	 */
	public static void main(String[] args) {
		Stack<String> stacklist = new Stack<String>();
		Stack<String> newstacklist = new Stack<String>();	
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Lütfen harf giriniz");
		stacklist.add(sc.nextLine().toLowerCase());
		}
		Stack <String> tempstacklist = new Stack<String>();
		for (String string : stacklist) {
			tempstacklist.add(string);
		}
		
		System.out.println(stacklist);
		System.out.println(tempstacklist);
		
		while (tempstacklist.size()!=0) {
			newstacklist.add(tempstacklist.pop());
			}
		
		System.out.println(stacklist);
		System.out.println(newstacklist);
		
		if (stacklist.equals(tempstacklist)) 
			System.out.println("Kelime palindromdur");
		else { System.out.println("Kelime palindromdur değildir");
		
		}
	}		
}
