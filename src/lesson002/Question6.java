package lesson002;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
/* Dairenin alanı ve çevresini bulalım
 * yarı çapı dışarıdan alınız
 * pi = 3.14
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Dairenin Yarıçapını Giriniz: ");
		double r = scan.nextDouble();
		double pi=3.14, daireAlan = pi * r * r, daireCevre = 2 * pi * r;
		System.out.println("Dairenin Alanı= "+ daireAlan);
		System.out.println("Dairenin Cevresi= "+ daireCevre);
		
		float alan = ((float) (pi * Math.pow(r, 2)));
		scan.close();
	}

}
