package lesson006;
import java.util.Scanner;
public class Question29Cozum {
	/*
	 * * Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o
	*   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
	*	Eğer harfi içermiyorsa bir çıktı versin.
	*
	* 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
	* giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
	* içerisinde o harf varsa değiştirsin
	*
	*
	* 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
	* olmadığını bulunuz(kek,iki,kabak)
	*
	*
	* 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
	* başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
	* açıldığını düşünün elimizde) her a bir sayfaya her b bir sayfaya her c bir
	* sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
	* sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
	* sayfa olduğunu ekrana yazdıralım. (KAÇ KATEGORİ VAR) 
	* (en fazla 4 kategori olabilir a,b,c ve diğerleri)
	* *
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        boolean kontrol = true;
        while (kontrol) {
            System.out.println("=====String İşemleri=====");
            System.out.println("0-çıkış");
            System.out.println("1-Harf Saydırma");
            System.out.println("2-Harf Değiştirme");
            System.out.println("3-Kelime Polindrom Konrol");
            System.out.println("4-Kategori Bulma");
            
            int secim = scanner.nextInt();
            scanner.nextLine();



           switch (secim) {
           case 0:
               kontrol = false;
                break; 
           case 1:
                int sayac = 0;
                String indexler = "";
                System.out.println("Lütfen bir kelime giriniz");
                String kelime = scanner.nextLine();
                System.out.println("Lütfen bir harf giriniz");
                String harf = scanner.nextLine();
                if (!kelime.contains(harf)) {
                    System.out.println("Aradığınız harf kelimede bulunmamaktadır");
                    break;
                }
                for (int i = 0; i < kelime.length(); i++) {
                    if (kelime.charAt(i) == harf.charAt(0)) {
                        sayac++;
                        indexler += i + ",";
                    }
                }
                System.out.println(harf + " harfi kelime içinde" + sayac + " adet bulunuyor");
                System.out.println(harf + " değerinin indexleri ===> " + indexler.substring(0, indexler.length() - 1));
                break;
           	case 2: 
           	 System.out.println("Lütfen bir kelime giriniz");
             kelime = scanner.nextLine();
             System.out.println("Lütfen değiştirmek istediğiniz harfi giriniz");
             harf = scanner.nextLine();
             System.out.println("Lütfen bir harf giriniz");
             String yeniHarf = scanner.nextLine();
             if (kelime.contains(harf)) {
             kelime = kelime.replace(harf,yeniHarf);
             System.out.println(kelime);
             }
             else {System.out.println("Harf Kelimede Bulunmuyor");
           
             }
             break;
             
           	case 3:
           		String tersKelime ="";
           		System.out.println("Lütfen Bir Kelime Giriniz");
           		String kelime3 =scanner.nextLine();
           		
           		for (int i = kelime3.length()-1; i >= 0;i--) {
           			tersKelime +=kelime3.charAt(i);
           		}
           		if(kelime3.equals(tersKelime)) {
           			System.out.println("Kelimeniz Polindromdur"); }
           		else {	System.out.println("Kelimeniz Polindrom Değildir");
           		}
           		System.out.println(tersKelime);
           	
           	/*System.out.println("Lütfen bir kelime giriniz");
            kelime = scanner.nextLine();
            int k=0;
            boolean control = true;
            for (int i=kelime.length()-1;i>=0;i--) {
            		if (kelime.charAt(i)==kelime.charAt(k)) {
            			}
            		else {System.out.println("Kelime Polindrom Değildir");
            				control = false;
            				i = -1;	}
            	k++;
            		}
            if (control==true) {System.out.println("Kelime Polindromdur");
            }
            */
           
            break;
            
           	case 4:
           		
           	int kategori=0, sayacA=0, sayacB=0,	sayacC=0, sayacOthers=0;
           
           	for (int i=5;i>=1;i--) { 	
           	System.out.println("Lütfen "+i+" adet kelime giriniz.");
           	String kelime4= scanner.nextLine(); 
           	if (kelime4.startsWith("a") || kelime4.startsWith("A")) {
           		 sayacA=1;
           	}
           	if (kelime4.startsWith("b") || kelime4.startsWith("B")) {
               		sayacB=1;
           	}
            if (kelime4.startsWith("c") || kelime4.startsWith("C")) {
                   		sayacC=1;
           	}
            if (kelime4.toUpperCase().charAt(0)!='A' && kelime4.toUpperCase().charAt(0)!='B'
            		&& kelime4.toLowerCase().charAt(0)!='c'){
           		sayacOthers=1;
            }
           	}
           	
           	kategori = sayacA+sayacB+sayacC+sayacOthers;
            System.out.println("Kategori Sayısı: "+kategori);
            break;
            
           	default:
            break;
            }
       }

	}

}
