package lesson033;

/*
* 
* ürün sınıfı==> isim fiyat ve int son kullanma tarihi 1970,2022
* daha sonra 
* urunManager ==> sınfıı olusturalım 
* bu sınıfta urun yaratma metodumuz olsun 
* eger urun ısmı yoksa ve fiyatı 0ve 0dan kucuk ise null donecek 
* bu kosulların aksinde bir urun olusturup onu donecegiz
* 
* 
*/

public class Urun {
	
	private String isim;
	private double fiyat;
	private int skt;
	
	
	public Urun() {
		super();
	}
	
	
	public Urun(String isim, double fiyat, int skt) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.skt = skt;
	}


	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getSkt() {
		return skt;
	}
	public void setSkt(int skt) {
		this.skt = skt;
	}
	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", skt=" + skt + "]";
	}
	
	
}
