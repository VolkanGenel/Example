package lesson022.okul;

import java.util.ArrayList;
import java.util.UUID;

public class Ogretmen extends Calisan {

	private	ArrayList <Ders> dersListesi;
	private	boolean nobetciMi;
	
	
	public Ogretmen(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}
	public Ogretmen(String ad, String soyad, double maas, int calismaSaati) {
		super(ad, soyad, maas, calismaSaati);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Ders> getDersListesi() {
		if(dersListesi==null) {
			this.dersListesi = new ArrayList<>(); 
		}
		return dersListesi;
	}
	public void setDersListesi(ArrayList<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}
	public boolean isNobetciMi() {
		return nobetciMi;
	}
	public void setNobetciMi(boolean nobetciMi) {
		this.nobetciMi = nobetciMi;
	}
	public void dersVer() {
		
	}
	public void etutYap() {
		
	}
	public void nobetciOl() {
		
	}
	public void menu () {
		super.menu();
		System.out.println("*********************************");
		System.out.println("****   "+"Ogretmen Paneli"+"    ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Girdiğim Dersleri Listele");
		System.out.println("2- Nöbetçilik Durumu Sorgula");
		System.out.println();
		int secim = OysUtility.intDegerAlma("Lütfen secim yapınız");

	}
	
}
