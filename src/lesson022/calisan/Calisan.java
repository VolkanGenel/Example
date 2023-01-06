package lesson022.calisan;

public class Calisan implements ICrud{

	private String isim;
	private String soyisim;
	private String unvan;
	private double maas;

	public Calisan(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public Calisan(String isim, String soyisim, double maas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
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

	public void setUnvan(double maas) {
		this.unvan = unvan;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public String getIsim() {
		return isim;
	}

	@Override
	public void maasAl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void izinAl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fazlaMaesaiYap() {
		// TODO Auto-generated method stub
		
	}

}
