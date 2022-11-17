package lesson009;



public class Question43 {
		/*
		 *  bir method yazalım bu method dizi içindeki tek elemanları alıp
		 *  başka bir diziye atsın ve o diziyi yazdırsın.
		 */
	
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
                { 189, 35, 56, 89, 8 } };
	int [] matris2= {1,2,3};
	
	int[] x;
	
	x = tekSayilariAta2(matris);	
	yazdir(x);
	}
	
	public static void tekSayilariAta(int [][]dizi) {
	int [] teksayilar=new int[dizi.length * dizi[0].length];
	int sayac=0;
	for (int i = 0; i < dizi.length; i++) {
		for (int j = 0; j < dizi[i].length; j++) {
			if (dizi[i][j]%2!=0) {
				teksayilar[sayac]= dizi [i][j];
				sayac++;
			}
		}
	}
	for (int j=0; j<teksayilar.length;j++) {
		if (teksayilar[j]!=0)
		System.out.print(teksayilar[j]+"-");
	}
	}

	public static void yazdir (int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}
	public static int[]tekSayilariAta2(int [][]dizi) {
					//		!					!
					//tek matris dön		dışarıdan çift matrisli al
		int [] teksayilar=new int[dizi.length * dizi[0].length];
		int sayac=0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if (dizi[i][j]%2!=0) {
					teksayilar[sayac]= dizi [i][j];
					sayac++;
				}
			}
		}
		return teksayilar;
		}

}
