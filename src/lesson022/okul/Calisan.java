package lesson022.okul;

public class Calisan extends Kisi {
	
	private	String sicilNo;
	private int calismaSaatleri;
	private double maas;
	
	public Calisan(String ad, String soyad) {
		super(ad, soyad);
	}

	public Calisan(String ad, String soyad, double maas, int calismaSaati) {
		super(ad, soyad);
		this.maas = maas;
		this.calismaSaatleri= calismaSaati;
		
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public int getCalismaSaatleri() {
		return calismaSaatleri;
	}

	public void setCalismaSaatleri(int calismaSaatleri) {
		this.calismaSaatleri = calismaSaatleri;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}
}
