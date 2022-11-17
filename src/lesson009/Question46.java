package lesson009;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		// Dışarıdan kaç sayı qalacağımızı alalım 2,3
		/*eğer iki sayı gelirse topla() içindeki iki methodu toplayalım.
		 * eğer 3 gelirse de bu methodu overload şeklinde yazalım. Aldığımız 3 
		 * değeri methoda geçelim.
		 * 
		 * main dışarıdan ka. sayı alacağımızı belirliyoruz o sayılara göre koşullarımızı
		 * belirleyip o koşullarda yukarıda yazdığımız 2 methoddan birini çağıracağız.
		 */
	System.out.println("Kaç Sayı Girmek İstiyorsunuz..?");
	Scanner sc =new Scanner(System.in);
	int adet =sc.nextInt();
	if (adet==2) {	
	System.out.println(topla(sc.nextInt(), sc.nextInt()));	
	}
	else if (adet==3) System.out.println(topla(sc.nextInt(), sc.nextInt(),sc.nextInt()));
	}
		public static int topla(int s1,int s2) {
			return s1+s2;	
		}
		public static int topla(int s1,int s2,int s3) {
			return s1+s2+s3;	
	}
		

}
