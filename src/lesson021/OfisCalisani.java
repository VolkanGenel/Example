package lesson021;

public class OfisCalisani extends Calisan {

	
	public OfisCalisani() {
		super();	
	}
	
	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8000);
	}

	public OfisCalisani(String isim, String soyisim, int maas) {
		super(isim, soyisim, maas);
			if (maas>=8000 && maas<12000)
				setUnvan("Çalışan");
			else if (maas>=12000)
				setUnvan("Kıdemli Çalışan");
			else if (maas<6000)
				setUnvan("Stajyer");
	}
	public void zamYap() {
		setMaas((int) (getMaas()*1.1));
	}
}
