package lesson022.okul;

import java.util.ArrayList;

public class Ogrenci extends Kisi {
	
	
	private String okulNo;
	private double notOrtalamasi;
	private ArrayList<Ders> dersListesi;
	int index = 0;
	
	public Ogrenci(String ad, String soyad) {
		super(ad, soyad);
		this.dersListesi = new ArrayList<>();
	}

	public Ogrenci(String ad, String soyad, String adres) {
		super(ad, soyad, adres);
		this.dersListesi = new ArrayList<>();
	}
	
	public String getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}

	public double getNotOrtalamasi() {
		return notOrtalamasi;
	}

	public void setNotOrtalamasi(double notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

	public ArrayList<Ders> getDersListesi() {
		return dersListesi;
	}

	public void setDersListesi(ArrayList<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}

	public void dersKaydiOlustur() {
		
	}
	
	public void okulNoAta() {
	
		index++;
		this.okulNo = "Ö-"+index;
	}
	public void menu() {
		super.menu();
		System.out.println("*********************************");
		System.out.println("****   "+"Ogrenci Paneli"+"    ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Ders Kaydı Yap");
		System.out.println("2- Not Ortalaması Goster");
		System.out.println("3- Aldığım Dersleri Listele");
		System.out.println();
		int secim = OysUtility.intDegerAlma("Lütfen secim yapınız");

	}

	@Override
	public String toString() {
		return "Ogrenci [okulNo=" + okulNo + ", notOrtalamasi=" + notOrtalamasi + ", getAd()=" + getAd() + "]";
	}
	
}
