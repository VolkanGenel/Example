package lesson008;

public class Question37 {
	/*
	 * int [] sayilar= { 1, 4, 5, 6, 1, 1, 4, 8 }
	 * 
	 * dizi içerisinde 1 ve 4 kaç kere geçtiğini bulunuz. Eğer 1 sayısı
	 * 4 sayısından daha fazla geçiyorsa true değilse false gelsin. 
	 */
	
	public static void main(String[] args) {
		
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int sayac1=0,sayac4=0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==1) sayac1++;
			else if (sayilar[i]==4) sayac4++;
		}
		if (sayac1>sayac4) System.out.println(true);
		else System.out.println(false);
	}
}
