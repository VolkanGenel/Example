package lesson022.calisan;

public class Muhendis extends Calisan {

	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(10000);
		// setUnvan(getMaas());
		setUnvan("Muhendis");
		

	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setUnvan(maas);

	}

	@Override
	public void setUnvan(double maas) {
		if (maas >= 17000) {
			setUnvan("Uzman M�hendis ");
		} else if (maas >= 12000) {

			setUnvan("K�demli M�hendis");
		} else if (maas >= 10000) {
			setUnvan("Muhendis");
		} else {
			setUnvan("Stajyer");
		}
	}

}
