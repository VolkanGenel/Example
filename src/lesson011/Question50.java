package lesson011;

public class Question50 {

	public static void main(String[] args) {
		// Kullanıcıdan tek sayı isteyeceğiz
		// sonra satır sayısı ve sütün sayısı isteyeceğiz
		//istediğimiz sayi y
		
		
		
		
		/*
		 * bir dizi içerisindeki tekrar eden elemanların kaç kere tekrar ettiğinin sayısını
		 * ve elemanı bulalım.
		 * int [] dizi = {1,5,1,9,5,1,9,8,0,0}
		 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		 */
		
		
	int[] dizi = new int[] {1, 5, 1, 9, 5, 1, 9, 8, 0, 0};
	kacTane(dizi);
	frekans(dizi);
		        }
	public static void frekans(int[] dizi) {
		boolean [] kontrol = new boolean [dizi.length];
		for (int i=0;i<dizi.length;i++) {
			if (kontrol[i]==true) {
				continue;
			}
			int count=1;
			for (int j=i+1;j<dizi.length;j++) {
				if (dizi[i]==dizi[j]) {
					kontrol[j]=true;
					count++;
				}
			}
			System.out.println(dizi[i]+" sayisi "+count+" kere tekrar etmiştir.");
		}
	}
	public static void kacTane(int...sayi) {
		int sayac;
		int [] [] yeniDizi= new int [sayi.length][2]; 
		for (int i = 0; i < sayi.length; i++) {
			sayac=1;
			int k =i-1;
			for (int j = i+1; j < sayi.length; j++) {	
				if (sayi[i]==sayi[j]) sayac++;
				yeniDizi[i][0]=sayi[i];
				yeniDizi[i][1]=sayac;
				}
			if (i==0) {
			System.out.print(yeniDizi[i][0]);
			System.out.println(",   "+yeniDizi[i][1]+" tane");
			}
			else if (i!=0) {
				for (k=i-1;k>=0;k--) {
					if (yeniDizi[i][0]==yeniDizi[k][0])
						break;
					else if (yeniDizi[i][0]!=yeniDizi[k][0] && k==0) {
						System.out.print(yeniDizi[i][0]);
						System.out.println(",   "+yeniDizi[i][1]+" tane");
					}
				}
			}	
			}	
		}
	
	
}
