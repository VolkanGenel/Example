package lesson021;

public class Muhendis extends Calisan{
	
	
	public Muhendis() {
	
	}
	public Muhendis(String isim, String soyisim) {
		super(isim,soyisim);
		setMaas(10000);
	}	
	public Muhendis(String isim, String soyisim, int maas) {
		super(isim,soyisim,maas);
		if (maas>=10000 && maas<12000)
			setUnvan("Mühendis");
		else if (maas>=12000 && maas<17000)
			setUnvan("Kıdemli Mühendis");
		else if (maas>=17000)
			setUnvan("Uzman Mühendis");
		else setUnvan("Stajyer");
	}
	public void zamYap() {
		if (getMaas()<8000)
		setMaas((int) (getMaas()*1.10)+250);
		else setMaas((int) (getMaas()*1.1));
	}
	
	
	
}
