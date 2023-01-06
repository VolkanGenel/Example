package lesson022.okul;

public class Kisi {

private String ad;
private String soyad;
private String adres;
private Okul okul;

public Okul getOkul() {
	return okul;
}
public void setOkul(Okul okul) {
	this.okul = okul;
}
public Kisi() {
	super();
}
public Kisi(String ad, String soyad) {
	super();
	this.ad = ad;
	this.soyad = soyad;
}
public Kisi(String ad, String soyad, String adres) {
	super();
	this.ad = ad;
	this.soyad = soyad;
	this.adres = adres;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public String getAdres() {
	return adres;
}
public void setAdres(String adres) {
	this.adres = adres;
}
public void menu () {
	System.out.println("Hoşgeldiniz");
}
}
