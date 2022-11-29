package lesson017;

import lesson017.otobusuygulamasi.Durak;
import lesson017.otobusuygulamasi.Guzergah;

public class Otobus {

	public int yolcuKapasitesi;
	public String soforIsmi;
	public String marka;
	public String sofor;
	public String renk;
	public int kapasite;
	public int hız;
	public double beygir;
	public int koltukSayisi;
	public double yakitMiktari;
	public int kapiSayisi;
	public boolean klima;
	public int vites;
	public boolean koruklumu;
	public int yolcuSayisi;
	public Guzergah guzergah; //guzergah -> hat no durak listesi
	// public Durak[] duraklar; // durak adı durak no otobuslistesi konum

public void yolcuAl(int yolcular) {
	yolcuSayisi+=yolcular;
}
}
