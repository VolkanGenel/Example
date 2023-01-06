package lesson022.calisan;

public class InsanKaynaklari extends Calisan implements IInsanKaynaklari {

	public InsanKaynaklari(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		// TODO Auto-generated constructor stub
	}

	public InsanKaynaklari(String isim, String soyisim) {
		super(isim, soyisim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zamYap(Calisan calisan, double zamOrani) {
	double zamliUcret = calisan.getMaas()+ (calisan.getMaas()*zamOrani /100);
	
//	1. yöntem
	if (calisan.getClass().getSimpleName().equals("Muhendis"))
		zamliUcret += 250;
//	2.yöntem
	else if (calisan.getUnvan().contains("Muhendis"))
		zamliUcret += 250;
	
	calisan.setMaas(zamliUcret);
	}
	@Override
	public void unvanBelirle() {
		// TODO Auto-generated method stub
		
	}
	

}
