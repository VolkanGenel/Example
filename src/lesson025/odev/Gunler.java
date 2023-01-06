package lesson025.odev;

import java.util.ArrayList;
import java.util.List;

public enum Gunler {
	
	Pazartesi ("Pazartesi",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()),
	Sali ("Salı", Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()),
	Carsamba ("Carsamba",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()),
	Persembe ("Perşembe",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()),
	Cuma ("Cuma",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()),
	Cumartesi ("Cumartesi",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma()), 
	Pazar ("Pazar",Utility.yemekrandomAlma(),Utility.corbarandomAlma(),Utility.tatlirandomAlma(),Utility.icecekrandomAlma());
	
	String ad;
	Yemek yemek;
	Corba corba;
	Tatli tatli;
	Icecek icecek;
	List<String> sofra;
	
	Gunler(String ad, Yemek yemek, Corba corba, Tatli tatli, Icecek icecek) {
		this.ad = ad+"-";
		this.yemek = yemek;
		this.corba = corba;
		this.tatli = tatli;
		this.icecek = icecek;
		sofra = new ArrayList<>();
		sofra.add(this.ad);
		sofra.add(yemek.toString());
		sofra.add(corba.toString());
		sofra.add(tatli.toString());
		sofra.add(icecek.toString());
	}

	public List<String> getSofra() {
		return sofra;
	}

	public void setSofra(List<String> sofra) {
		this.sofra = sofra;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Yemek getYemek() {
		return yemek;
	}

	public void setYemek(Yemek yemek) {
		this.yemek = yemek;
	}

	public Corba getCorba() {
		return corba;
	}

	public void setCorba(Corba corba) {
		this.corba = corba;
	}

	public Tatli getTatli() {
		return tatli;
	}

	public void setTatli(Tatli tatli) {
		this.tatli = tatli;
	}

	public Icecek getIcecek() {
		return icecek;
	}

	public void setIcecek(Icecek icecek) {
		this.icecek = icecek;
	}
}
