package lesson004;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/*
		Girilen sayının 5'in kuvveti olup olmadığını bulan kod
		*/
		
		Scanner sc = new Scanner (System.in);
		int sayi = sc.nextInt();
		

		if (sayi==1) {System.out.println("Sayi 5 in kuvvetidir");
		}
		
		else if (sayi!=1) {
		if (sayi %5!=0) {
			System.out.println("Sayi 5'in kuvveti değildir");
		}
			else if (sayi%5==0) {
			while (sayi > 5) {
				sayi /=5;
				}
				if (sayi%5==0)
			System.out.println("Sayi 5 in kuvvetidir");
				else System.out.println("Sayı 5 in kuvvveti değildir");
				
			}
		}
	      /* Scanner scanner = new Scanner(System.in);
	        System.out.println("Bir Sayi giriniz");
	        int sayi = scanner.nextInt();
	        boolean kontrol = true;

	       if (sayi == 1) {
	            kontrol = false;
	            System.out.println("5 in kuvvetidir");
	       } else if (sayi < 1) {
	            kontrol = false;
	            System.out.println("Negatif değer girmeyiniz");
	        }

	       while (kontrol) {
	            if (sayi % 5 == 0) {
	                sayi /= 5;
	                if (sayi == 1) {
	                    System.out.println("5 in kuvvetidir");
	                    kontrol = false;
	                }
	           } else {
	                System.out.println("5 in kuvveti değildir");
	                kontrol = false;
	           }
	       }
	       */
	}

}
