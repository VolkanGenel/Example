package lesson008;

public class Question36 {

	public static void main(String[] args) {
		int [] sayilar = {0,120,5,85,-256,16,1258,81,14};
		// dizi deki tüm sayıların toplamı ve
		// bu sayı çiftdir ve bu sayı tektir şeklinde çıktı alalım.
		int toplam =0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		if (sayilar[i]%2==0) System.out.println((i+1)+". sayı...: "+sayilar[i]+ " çifttir");
		else System.out.println((i+1)+". sayı...: "+sayilar[i]+ " tektir");
		}
		System.out.println("Toplam.....: "+toplam);
		
	}

}
