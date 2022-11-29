package lesson012;

import java.util.Scanner;

/*
 * 1. method dışarıdan girilen harfle başlayan illeri yazdır.
 * 2. method illeri plaka ile yazddıran method 01-Adana,02 Adıyaman
 * 3- Girdiğimiz şehrin ismine göre plaka dönen methodu yazdıralım.
 * 4- İlk harf hariç bütün sesli harfler silip yazdıran fonksiyon.
 * 5- Method bir önceki methoddan dönen değerlerin ilk üç harfini alın
 * ve sonuna nokta ekleyin Adn...Ady... gibi
 * 6- method bir önceki methoddan dönen dizide B ile başlayan illerin
 * başına 1-Blk gibi yazdıralım
 * 7-method ikinci harfi a olanların ilk değeri ve sadece ilk 3 harfini
 * büyük yazdıralım Çankırı->ÇAN gibi
 */

public class Test {
	
	public static void main(String[] args) {
	
	SehirDatabase database = new SehirDatabase ();
	String[] iller = database.iller;
	//ileBaslayanIller(iller);
	//plakaKodlu(iller);
	//plakaDonen(iller);
	//plakaBul(iller, "ankara","istanbul","İzmir","Bolu");
	//sessizYazdir(database.iller); 
	//ilkHarfler(iller);
	//ilkHarflerB(iller);
	ucHarfBuyuk(iller);
}

	public static void ileBaslayanIller (String[]dizi) {
		
		System.out.println("Lütfen bir karakter giriniz");
    	Scanner sc = new Scanner (System.in);
    	String karakter = sc.nextLine();
    	for (int i=0;i<=80;i++) {
    	if	(dizi[i].startsWith(karakter.toUpperCase())) {
    		System.out.println(dizi[i]);
    	}
    
	}
	}
	
	public static void plakaKodlu (String[] dizi) {
	
	for (int i = 0; i < dizi.length; i++) {
		if (i<9) System.out.println("0"+ (i+1)+" "+dizi[i] );
		else System.out.println((i+1)+" "+dizi[i]);
	}
		
	}
	
	public static void plakaDonen (String[]dizi) {
		System.out.println("Lütfen bir kelime giriniz...: ");
		Scanner scan = new Scanner (System.in);
    	String ifade = scan.nextLine();
    	
    	for (int i = 0; i < dizi.length; i++) {	
    		if (ifade.equalsIgnoreCase(dizi[i])) {
    		if (i<9) System.out.println("0"+ (i+1)); 
    		else System.out.println(i+1);
    		}
    	}
	}
	public static void plakaBul(String[] iller, String...il) {
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if (iller[i].equalsIgnoreCase(il[j])) {
				if (i<9) System.out.println("0"+ (i+1)+"-"+iller[i]);
				else System.out.println((i+1)+"-"+iller[i]);
			}
			}
		}
	}
	public static void sessizYazdir (String[]dizi) {
		/*
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i].charAt(0)+dizi[i].substring(1).replace("a","").replace("e","").replace("ı","").replace("i","").replace("o","").replace("ö","").replace("u","").replace("ü",""));
		}
		*/
		String[] liste = new String [] {"a","e","ı","i","o","ö","u","ü"};
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < liste.length; j++) {
				if (dizi[i].contains(liste[j]))
				dizi[i]=dizi[i].replace(liste[j],"");
			}
			System.out.println(dizi[i]);
		}

	}
	public static void ilkHarfler (String[]dizi) {
		
		String[] liste = new String [] {"a","e","ı","i","o","ö","u","ü"};
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < liste.length; j++) {
				if (dizi[i].contains(liste[j]))
				dizi[i]=dizi[i].replace(liste[j],"");
			}
			if (dizi[i].length()>2)
			System.out.println(dizi[i].substring(0,3)+"...");
			else  System.out.println(dizi[i].substring(0,2)+"...");
		}	
	}
	
	public static void ilkHarflerB (String[]dizi) {
		
		String[] liste = new String [] {"a","e","ı","i","o","ö","u","ü"};
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < liste.length; j++) {
				if (dizi[i].contains(liste[j]))
				dizi[i]=dizi[i].replace(liste[j],"");
			}
			if (dizi[i].startsWith("B") && dizi[i].length()>2) System.out.println((i+1)+"-"+dizi[i].substring(0,3)+"...");
			else if  (dizi[i].startsWith("B") && dizi[i].length()<3) System.out.println((i+1)+"-"+dizi[i].substring(0,2)+"...");
			else if (dizi[i].length()<3) System.out.println(dizi[i].substring(0,2)+"...");
			else {
			System.out.println(dizi[i].substring(0,3)+"...");
			}
		}
	}
	public static void ucHarfBuyuk(String[]dizi) {
		
		String[] liste = new String [] {"a","e","ı","i","o","ö","u","ü"};
		//String[] temp= dizi; temp dizi ile aynı referans noktasına işaret ettiği için dizi değişince temp de değişiyor.
		String[] temp= new String[dizi.length];

		for (int i = 0; i < dizi.length; i++) {
			temp[i]=dizi[i];
			for (int j = 0; j < liste.length; j++) {
				if (dizi[i].contains(liste[j]))
				dizi[i]=dizi[i].replace(liste[j],"");
			}
			if (dizi[i].length()>2 && temp[i].charAt(1)=='a')
			System.out.println(temp[i].substring(0,3).toUpperCase()+"...");
			else if (dizi[i].length()>2)
				System.out.println(dizi[i].substring(0,3)+"...");
			else if (dizi[i].length()<3 && temp[i].charAt(1)=='a') System.out.println(temp[i].substring(0,2).toUpperCase()+"...");
			else if (dizi[i].length()<3) System.out.println(dizi[i].substring(0,2)+"...");
		}	
	}
	
	
}
