package lesson015;

import java.util.Random;

/*
 * Bir statik olmayan method yazacağız
 * bu method bize random bir sayı üretip dönecek
 * daha sonra main methodda biz bu sayıyı boyut1 e
 * eşitleyelim boyut2 içinde bir random sayı oluşturalım.
 */

/*
 * static bir method olsun. String değerimiz içeride değiştirip
 * geri döndürelim.
 * 
 * 
 * void bir method oluşturalım. Boyutu Rasgele olacak
 * Sonrasında içine rastgele sayılar atayacağız.
 */
public class Question52 {
	
	int boyut1;
	static int boyut2;
	String deger;
	static int[] dizi;

	public static void main(String[] args) {
	Question52 deger = new Question52();
	// static bir method içinde static olmayan bir değerin kullanımı.
	int sayi= deger.rastgeleSayi();
	System.out.println(sayi);	
	deger.boyut1= sayi;
	boyut2=deger.rastgeleSayi();
	System.out.println(deger.boyut1);
	System.out.println(boyut2);
	deger.deger=geriDon(deger.deger);
	System.out.println(geriDon(deger.deger));
	System.out.println(deger.deger);
	deger.atama();
	
	}
	
	
	public static String geriDon(String item) {
		item = "dünya";
		return item;
	}
	
public int [] atama() {
		
		int[] liste = new int[rastgeleSayi()];
		for (int i = 0; i < liste.length; i++) {
			liste[i]=rastgeleSayi();
			System.out.println(liste[i]);
		}
		return dizi;
	}
	
	public int rastgeleSayi() {
		Random rand = new Random();
		int sayi = rand.nextInt(10);
		return sayi;
	}
	
}
