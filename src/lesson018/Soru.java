package lesson018;

import java.util.Scanner;

public class Soru {
	public Scanner sc = new Scanner (System.in);
	public int soruNo;
	public String icerik;
	public int puan;
	public String dogruCevap;
	public String[] cevapIcerikleri;

public void soruOlustur(String[] cevapSecenekleri) {

	System.out.println("Lütfen sorunun içeriğini giriniz ");
	icerik = sc.nextLine()+" ?";
	cevapIcerikleri = new String [cevapSecenekleri.length];
	for (int i = 0; i < cevapSecenekleri.length; i++) {
		System.out.println("Lütfen "+ cevapSecenekleri[i]+ " şıkkının içeriğini giriniz.");
		cevapIcerikleri[i]= sc.nextLine();
	}
	System.out.println("Lütfen sorunun doğru cevabını giriniz.");
	dogruCevap = sc.nextLine().toUpperCase();
	System.out.println("Lütfen sorunun puanını giriniz");
	puan = Integer.parseInt(sc.nextLine());
}
}
