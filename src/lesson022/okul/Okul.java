package lesson022.okul;

import java.util.ArrayList;

public class Okul {
	
	private String ad;
	private String adres;
	public final static ArrayList <Ogrenci> ogrenciListesi=new ArrayList<>();
	public final static ArrayList<Ogretmen> ogretmenListesi=new ArrayList<>();
	public final static  ArrayList<Memur> memurListesi=new ArrayList<>();
	
	public Okul(String ad, String adres) {
		super();
		this.ad = ad;
		this.adres = adres;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
