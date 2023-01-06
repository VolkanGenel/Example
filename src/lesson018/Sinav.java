package lesson018;

import java.util.Scanner;

public class Sinav {
	public String Ders;
	public String konu;
	public int sinavNo;
	public int soruSayisi;
	public long süre;
	public int not;
	public String tarih;
	public Soru[] sorular;
	public String[] cevaplar;
	public String [] cevapSecenekleri = {"A","B","C","D"};

public void sinavOlustur() {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Lütfen sınavın konusunu giriniz");
	konu = sc.nextLine();
	System.out.println("Lütfen soru adetini giriniz");
	soruSayisi = Integer.parseInt(sc.nextLine());
	System.out.println("Lütfen sınav süresini giriniz");
	süre = Long.parseLong(sc.nextLine());
	sorular= new Soru[soruSayisi];
	
	for (int i = 0; i < sorular.length; i++) {
		Soru soru = new Soru();
		soru.soruOlustur(cevapSecenekleri);
		sorular[i]=soru;
	}
}
public void cevaplariGir() {
	Scanner sc = new Scanner (System.in);
	cevaplar = new String[sorular.length];
	for (int i = 0; i < sorular.length; i++) {
		System.out.println(sorular[i].icerik);
		for (int j = 0; j < cevapSecenekleri.length; j++) {
			System.out.println(cevapSecenekleri[j]+" "+sorular[i].cevapIcerikleri[j]);	
		}
		cevaplar[i]= sc.nextLine();
	}
}
public void cevapKontrol() {
	String kontrol[] = new String [sorular.length]; 
	for (int i = 0; i < sorular.length; i++) {
		if (cevaplar[i].equalsIgnoreCase(sorular[i].dogruCevap)) {
			kontrol[i] = "true";
			not+= sorular[i].puan;
			}
		else kontrol[i] = "false";	
		}
	System.out.println("Notunuz.... "+not);
	}
}
