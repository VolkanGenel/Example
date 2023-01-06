package lesson027;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStackCozum {

	  Stack<Character> stack = new Stack<>();

	   public static void main(String[] args) {
	        PalindromStackCozum palindromStack = new PalindromStackCozum();
	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen bir kelime giriniz");
	        String kelime = scanner.nextLine();

	       if (palindromStack.isPalindrom(kelime)) {
	            System.out.println(kelime + " Palindromdur");
	        } else {
	            System.out.println(kelime + " Palindrom değildir !!!");

	       }
	   }

	   public void stackOlusturma(String kelime) {

	       for (int i = 0; i < kelime.length(); i++) {
	            stack.push(kelime.charAt(i));
	        }

//	        while (!stack.isEmpty()) {
//	        System.out.println(stack.pop());
	//
//	        }
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
