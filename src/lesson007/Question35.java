package lesson007;

public class Question35 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
		// sonlansın yoksa false yazdırsın.
			int [] sayilar= {2,-256,16,1258,5,2}; int sayi1; boolean kontrol= false;
			
			for (int i = 1; i < sayilar.length; i++) {
				if (sayilar[i] == sayilar[i-1] && sayilar[i]==2) {
					kontrol= true;
					}

			}
			System.out.println(kontrol);
	}

}
