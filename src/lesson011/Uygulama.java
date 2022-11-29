package lesson011;
import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		uygulama();
		
	}
	
	public static void uygulama() {
		TasKagitMakas tkm = new TasKagitMakas();
		String[] dizi = tkm.tasKagitMakas;	
		int sayacBiz =0, sayacRakip=0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Lütfen hamlenizi yapınız... ");
		String hamle = sc.nextLine();
		String rakip = dizi[rastgeleSayiUret(dizi.length)];
		System.out.println(rakip);
		switch (hamle.trim().toLowerCase()) {
		case "taş":
			if (rakip.equalsIgnoreCase("Taş"));
			else if (rakip.equalsIgnoreCase("kağıt"))
				sayacRakip++;
			else sayacBiz++;
			break;
		case "kağıt":
			if (rakip.equalsIgnoreCase("kağıt"));
			else if (rakip.equalsIgnoreCase("makas"))
				sayacRakip++;
			else sayacBiz++;
		case "makas":
			if (rakip.equalsIgnoreCase("makas"));
			else if (rakip.equalsIgnoreCase("taş"))
				sayacRakip++;
			else sayacBiz++;	
		default:
			sayacRakip++;
			break;
		}
		} while (sayacBiz<5 && sayacRakip<5);
		
		if (sayacBiz>sayacRakip)
			System.out.println("Kazandık");
		else System.out.println("Bilgisayar kazandı");
	}
	
	public static int rastgeleSayiUret(int uzunluk) {
		
		Random random = new Random();
		int sayi = random.nextInt(uzunluk);
		return sayi;
	}
}
