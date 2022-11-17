package lesson008;
public class Question40 {

	public static void main(String[] args) {
		/*
	     * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3 'ün katı
	     * ise bilge 5'in ise adam hem3 hem 5 'in katı ise bilgeadam yazdıralım int start=2; 
	     * intend=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge]
	     */
			String dizi[] = new String [21];
		for (int i = 0; i < 21; i++) {
			int sayi= i+2;
			if (i%5==3 && i%3==1) {dizi[i]="BilgeAdam";
			}
			else if (i%3==1) dizi[i]="Bilge";
			else if (i%5==3) dizi[i]="Adam";
			else dizi[i]=""+sayi;
		}
		System.out.print("[");
		for (int i = 0; i < dizi.length; i++) {
			if(i==dizi.length-1)
				System.out.println(dizi[i]);
			else
			System.out.print(dizi[i]+",");
		}
		System.out.println("]");
	}

}
