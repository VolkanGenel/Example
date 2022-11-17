package lesson007;
//dizide en büyük ve en küçük öğeyi bulma
public class Question33_34 {

	public static void main(String[] args) {
		int[] sayilar = {0,120,5,85,-256,16,1258,81,14};
		int min = sayilar[0];
				int max = sayilar[0];
				int toplam=0,ortalama=0;
				for (int i = 0; i < sayilar.length; i++) {
					toplam += sayilar[i];
					if (sayilar[i]<min)
					min = sayilar[i];					
					if (sayilar[i]>max)
					max = sayilar[i];		
				}
				System.out.println(min);
				System.out.println(max);
				ortalama = toplam/(sayilar.length);
				System.out.println(ortalama);
				
				
				for (int i=0;i<sayilar.length;i++) {
					if (max == sayilar[i]) {
						System.out.println(i);
						sayilar[i] = ortalama; }
					if (min == sayilar[i]) {
							System.out.println(i);
							sayilar[i] = ortalama;
					}
				}
				min = sayilar[0];
				max = sayilar[0];
				for (int i = 0; i < sayilar.length; i++) {
					if (sayilar[i]<min && sayilar[i]!=ortalama)
					min = sayilar[i];					
					if (sayilar[i]>max && sayilar[i]!=ortalama)
					max = sayilar[i];
				}
					System.out.println(min);
					System.out.println(max);		
	}

}
