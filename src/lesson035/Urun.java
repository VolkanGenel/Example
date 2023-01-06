package lesson035;

public class Urun {

	private  String isim;
	private double fiyat;
	
	
	public Urun() {
		super();
	}
	
	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
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
	
}
