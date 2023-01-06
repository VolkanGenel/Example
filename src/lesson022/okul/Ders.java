package lesson022.okul;

import java.util.ArrayList;

public class Ders {
	
	private int kontenjan;
	private String ad;
	private ArrayList<Ogretmen> ogretmenListesi;
	private ArrayList<Ogrenci> ogrenciListesi;
	
	
	public Ders(int kontenjan, String ad) {
		super();
		this.kontenjan = kontenjan;
		this.ad = ad;
		this.ogrenciListesi = new ArrayList<>();
		this.ogretmenListesi = new ArrayList<>();
	}
	public int getKontenjan() {
		return kontenjan;
	}
	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public ArrayList<Ogretmen> getOgretmenListesi() {
		return ogretmenListesi;
	}
	public void setOgretmenListesi(ArrayList<Ogretmen> ogretmenListesi) {
		this.ogretmenListesi = ogretmenListesi;
	}
	public ArrayList<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}
	public void setOgrenciListesi(ArrayList<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

}
