package lesson011;

public class Question48 {
		// Dizideki elemanlar arasındaki farkın en küçük oluğu değer nedir?
	public static void main(String[] args) {
		int [] array = {1,5,-4,3};
		System.out.println(Math.abs(dizi(array)));
//		Math.abs() Mutlak Değer
	}
	
	public static int dizi(int...sayilar) {
		int min =0;
		int[] sayi= new int[sayilar.length];
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = i+1; j < sayilar.length; j++) {
				sayi[i] = sayilar[i]-sayilar[j];
				if (sayilar [i]<min)
					min = sayilar [i];
			}	
		}
		return min;
	}

}
