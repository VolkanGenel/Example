package lesson017.otobusuygulamasi;

import lesson017.Otobus;

public class Test {

	public static void main(String[] args) {
		
		Durak durak = new Durak();
		durak.ad="merhaba";
		durak.durakNo=120;
		durak.konum = "Kızılay";
		
		
		Durak durak2 = new Durak();
		durak2.ad="dünya";
		durak2.durakNo=180;
		durak2.konum = "Maltepe";
		
		Durak durak3 = new Durak();
		durak3.ad="mars";
		durak3.durakNo=28;
		durak3.konum = "Ulus";
		
		Durak durak4 = new Durak();
		durak4.ad="selam";
		durak4.durakNo=38;
		durak4.konum = "Çankaya";
		
		Guzergah guzergah = new Guzergah();
		guzergah.hatNo =112;
		guzergah.duraklistesi = new Durak[] {durak,durak2};
		
		Guzergah guzergah2 = new Guzergah();
		guzergah2.hatNo=130;
		guzergah2.duraklistesi = new Durak[] {durak,durak3,durak4};
		
		Otobus otobus = new Otobus();
		otobus.kapiSayisi=3;
		otobus.yolcuKapasitesi=100;
		otobus.klima=true;
		otobus.renk="kırmızı";
		System.out.println(otobus.yolcuSayisi);
		otobus.yolcuAl(5);
		System.out.println(otobus.yolcuSayisi);
		otobus.guzergah = guzergah;
		
		Otobus otobus2 = new Otobus();
		otobus2.kapiSayisi=2;
		otobus2.yolcuKapasitesi=80;
		otobus2.klima=true;
		otobus2.renk="yeşil";
		System.out.println(otobus2.yolcuSayisi);
		otobus2.yolcuAl(5);
		System.out.println(otobus2.yolcuSayisi);
		otobus2.guzergah = guzergah2;
		System.out.println(otobus.guzergah.duraklistesi[0].ad);
		
		durak.otobuslistesi = new Otobus[] {otobus};
		durak2.otobuslistesi = new Otobus[] {otobus2};
		durak3.otobuslistesi = new Otobus[] {otobus,otobus2};
		durak4.otobuslistesi = new Otobus[] {otobus,otobus2};
		
		System.out.println("otobus nesnesinin durak listesi");
		for (int i = 0; i < otobus.guzergah.duraklistesi.length; i++) {
			System.out.println(otobus.guzergah.duraklistesi[i].ad);

		}
	}
}
