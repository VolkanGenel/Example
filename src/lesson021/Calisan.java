package lesson021;

public class Calisan {

	private String isim;
	private String soyisim;
	private String unvan;
	private int maas;
	
	
	public Calisan() {
		super();
	}


	public Calisan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}


	public Calisan(String isim, String soyisim, int maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}


	public String getIsim() {
		return isim;
	}

	public String getSoyisim() {
		return soyisim;
	}


	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}


	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}


	public int getMaas() {
		return maas;
	}


	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	
}
