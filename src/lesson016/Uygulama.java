package lesson016;


import java.util.Random;

public class Uygulama {

	Kart kart = new Kart();
static Uygulama uygulama = new Uygulama();
	
	public static void main(String[] args) {
		
		uygulama.karismisDesteyiGoster(uygulama.desteyiKaristir(uygulama.deste()));
		
		//for (int j = 0; j < 52; j++) {
		//	System.out.println(uygulama.karisikDesteyiGoster()[j]);}
		
		// int[] liste=uygulama.desteyiKaristir(uygulama.deste());
		
		//for (int i = 0; i < liste.length ; i++) {
		//System.out.print(liste[i]+", ");}
		
		//System.out.println(uygulama.desteyiGoster()[randomSayi()]);
		
		//for (int i = 0; i <uygulama.deste().length ; i++) {
		//	System.out.println(uygulama.deste()[i]);	}
		// uygulama.desteyiGoster();
	
	}
	
	public int[] deste() {
		int [] dizi = new int[(kart.kartTurleri.length)*(kart.kartNumaralari.length)];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=i;
		}
		return dizi;
	}
	
	public String[] desteyiGoster() {
		String [] dizi2 = new String[deste().length];
		int count=0;
		for (int i = 0; i < kart.kartTurleri.length; i++) {
			for (int j=0; j<kart.kartNumaralari.length;j++) {
				dizi2[count] = kart.kartTurleri[i]+" "+kart.kartNumaralari[j];
				System.out.println(dizi2[count]);
				count++;	
		}
		}
		return dizi2;
	}
	
	public void karismisDesteyiGoster (int[] deste ) {
		// String [] kartTurleri = {"Kupa","Maça","Karo","Sinek"}
		// String [] kartNumaralari= { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		for (int i = 0; i < deste.length; i++) {
			// 1=14/13//maca
			
			int kartIndex = deste[i]/13;
			//14%13=1
			int numaraIndex = deste[i]%13;
			String kartTuru = kart.kartTurleri[kartIndex];
			String kartNumarasi = kart.kartNumaralari[numaraIndex];
			System.out.println(kartTuru + " "+ kartNumarasi);
		}
	}
	
	public String[] karisikDesteyiGoster() {
		String [] dizi3 = new String[deste().length];
		int count=randomSayi();
		boolean kontrol=true;
		for (int i = 0; i < kart.kartTurleri.length; i++) {
			for (int j=0; j<kart.kartNumaralari.length;j++) {
				kontrol=true;
				do {
				count =randomSayi();
				int temp= count;
				if (dizi3[temp]==null) {
				dizi3[temp] = kart.kartTurleri[i]+" "+kart.kartNumaralari[j];
				kontrol=false;
				}
				}while (kontrol);
				}
		}
		return dizi3;
	}
	
	public int [] desteyiKaristir (int[] deste) {
		// {5,12,50,7,6,0}
		for (int i=0;i<deste.length;i++) {
			int rastgeleIndex = randomSayi();
			int gecici= deste[i];
			deste[i] = deste [rastgeleIndex];
			deste[rastgeleIndex] = gecici;
			
		}
		return deste;
	}
	
	
	public static int randomSayi() {
		Random rand = new Random();
		int sayi = rand.nextInt(52);
		return sayi;
	}
}
