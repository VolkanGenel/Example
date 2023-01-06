package lesson026;

import java.util.Random;

public class Forvet extends AktifFutbolcu {

	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	public Forvet(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.bitiricilik = rastgeleYetenekPuaniAta();
		this.ilkDokunus = rastgeleYetenekPuaniAta();
		this.kafa = rastgeleYetenekPuaniAta();
		this.ozelYetenek = rastgeleYetenekPuaniAta();

	}

	@Override
	public int rastgeleYetenekPuaniAta() {
		Random random = new Random();
		return random.nextInt(70, 101);
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		int bonus = random.nextInt(1,6);
		double skor =  (getPas()*(0.2))+ (getYetenek()*(0.2))+
				getOzelYetenek()*0.2+
				getDayaniklilik()*0.1+getDogalForm()*0.1+
				getSans()*0.1+bonus;
		return (int) skor;
	}

	@Override
	public int golSkor(int kurtaris) {
		Random random = new Random();
		int bonus = random.nextInt(1,5);
		double skor = getYetenek()*0.2+getOzelYetenek()*0.2+getSut()*0.1+getIlkDokunus()*0.1+getKararlilik()*0.1+getSans()*0.1+kafa*0.1+getBitiricilik()*0.2+getDogalForm()*0.1+bonus-kurtaris;
		return (int)skor;	
	}

}
