package lesson003;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		/* Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
		 * 0 girildiğinde sayıların toplamını ve ortalamayı ekrana yazdıralım.
		 */

		Scanner sc = new Scanner (System.in);
		double result = 0;
		double i = 1, j = 1;		
		double ortalama = 0;
		double sayi;
		
		
		do { 
		
		System.out.println("Bir Sayı Giriniz....");
		sayi = sc.nextInt();
		result += sayi;
		ortalama = result / j;
		i++;
		j= i-1;
		
		} while (sayi != 0);
		

		
		System.out.println(result);
		System.out.println(ortalama);
		System.out.println(i);
	}
}
