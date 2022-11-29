package lesson010;

import java.util.Scanner;

public class Question47 {
	/*
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
     * System.out.println("2- Çıkar"); System.out.println("3- Çarp");
     * System.out.println("4- Böl"); System.out.println("0- Çıkış");
     * System.out.println("Bir işlem Seçiniz");
     *
     *bir döngümüz olacak bu döngüde işlem seçeceğiz. 1- toplama kullacağız = alana
     *kadar girilen sayıları toplasın ve ekrana yazdırsın.
     *
     *
     *MENÜ için bir method
     *İşlem için bir method
     *
     *Dışarıdan iki sayı gireceğiz bu sayıların ebob ve ekokunu hesaplayan kod.
     *
	 */
	public static void main(String[] args) {
		uygulama();
		
	}
	
	public static void hesapMakinesi() {
		
		System.out.println("==Hesap makinesi===\n");
		System.out.println("1- Topla");
	    System.out.println("2- Çıkar"); 
	    System.out.println("3- Çarp");
	    System.out.println("4- Böl");
	    System.out.println("5-EBOB-EKOK");
	    System.out.println("0- Çıkış");	 
	    
	}
	
	public static int islemSec () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir işlem Seçiniz");
		int islem = sc.nextInt();
		return islem;
	}
	
	public static int topla() {
		String deger="";
		String sayi2="";
		int toplam =0;
		Scanner scan=new Scanner(System.in);
		int sayi;
		/*
		do {
			System.out.println("Devam etmek için lütfen bir sayı girini");
			sayi = scan.nextInt();
			scan.nextLine();
			toplam+=sayi;
			i++;
			System.out.println("İşlemi sonlandırmak için = tuşuna basınız..: )");
			deger =scan.nextLine();
		} while (!deger.equals("="));
		*/
		do {
			System.out.println("Lütfen bir sayı giriniz,eğer sonuç çıksın isterseniz '=' giriniz. ");
			sayi2 = scan.nextLine();
			if (!sayi2.equals("="))
			toplam += Integer.parseInt(sayi2);
		} while (!sayi2.equals("="));
		
		return toplam;
	}
	
	public static int cikarma() {		
		String sayi3="";
		int cikarma =0;
		int sayac=0;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Lütfen bir sayı giriniz,eğer sonuç çıksın isterseniz '=' giriniz. ");
			sayi3 = scan.nextLine();
			sayac++;	
			if (!sayi3.equals("="))
				if (sayac==1) cikarma = Integer.parseInt(sayi3);
				else cikarma -= Integer.parseInt(sayi3);
		} while (!sayi3.equals("="));
		
		return cikarma;
	}
	public static int carpma() {
		String sayi4=null;
		int carpim=1;
		Scanner sc = new Scanner(System.in);
		int sayac=0;
		do {
		System.out.println("Lütfen bir sayı giriniz,eğer sonuç çıksın isterseniz '=' giriniz. ");
		sayi4 = sc.nextLine();
		sayac++;
		if (!sayi4.equals("="))
				if (sayac==1) carpim = Integer.parseInt(sayi4);
				else
			carpim *= Integer.parseInt(sayi4);
		}while (!sayi4.equals("="));
		return carpim;
	}
	
	public static int bolme() {
		Scanner sc =new Scanner(System.in);
		String sayi5;
		int bolme=1;
		int sayac=1;
		do {
		System.out.println("Lütfen bir sayı giriniz,eğer sonuç çıksın isterseniz '=' giriniz. ");
		sayi5 =sc.nextLine();
		
		if (!sayi5.equals("=")) {
			if (sayac==1)
			bolme = Integer.parseInt(sayi5);
			else { if (sayi5.equals("0")) {
				System.out.println("Lütfen başka bir değer giriniz");
				sayac--; }
				else
				bolme /= Integer.parseInt(sayi5);}
			sayac++;
		}
		}
		while(!sayi5.equals("="));
		return bolme;
	}
	
	public static void ebobEkok() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 2 adet sayı giriniz");
		int sayi1=sc.nextInt();
		int sayi2=sc.nextInt();
		for (int i=sayi1;i>=1;i--)
		if (sayi1%i==0 && sayi2%i==0) {
			System.out.println(i); 
			System.out.println((sayi1*sayi2)/i);
			break;}
	}
	
	public static void uygulama() {
		
		boolean kontrol=true;
		int islem =0;
		do {
		hesapMakinesi();
		islem=islemSec();
		
		switch (islem) {
		case 0:
			System.out.println("Çıkış Yaptınız...: ");
			kontrol = false;
			break;
		case 1: 
			System.out.println(topla());
			break;
		case 2: 
			System.out.println(cikarma());
			break;	
		case 3:
			System.out.println(carpma());
			break;
		case 4:
			System.out.println(bolme());
			break;
		case 5:
			ebobEkok();
		default:
			System.err.println("Yanlış Seçim Yaptınız!");
			break;
		}
		
		} while (kontrol);
		
		
	}
	

}
