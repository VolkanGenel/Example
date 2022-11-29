package lesson011;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen tek bir sayı giriniz");
		int sayi=sc.nextInt();
		System.out.println("Lütfen satır sayısını giriniz");
		int satir = sc.nextInt();
		System.out.println("Lütfen sütun sayısını giriniz");
		int sutun = sc.nextInt();
		int [][] dizi = new int [satir][sutun]; 
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				if (i==j) dizi [i][j]= (sayi/2)+1;
				else if (j<i) dizi [i][j] = 1;
				else if (j>i) dizi [i][j] = sayi;
			}
		}
	
			for (int i = 0; i < satir; i++) {
			System.out.println();
			for (int j = 0; j < sutun; j++) {
			System.out.print(dizi[i][j]+" ");	
			}
			}
	}
}
