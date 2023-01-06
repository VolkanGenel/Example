package lesson026;

import java.util.Random;

public class Defans extends AktifFutbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma = rastgeleYetenekPuaniAta();
		this.kafa = rastgeleYetenekPuaniAta();
		this.sicrama = rastgeleYetenekPuaniAta();
	}

	@Override
	public int rastgeleYetenekPuaniAta() {
		Random random = new Random();
		return random.nextInt(60, 91);
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		int bonus = random.nextInt(4);
		double skor =  (getPas()*(0.2))+ (getYetenek()*(0.2))+ 
				getDayaniklilik()*0.1+getDogalForm()*0.1+
				getPozisyonAlma()*0.1+getSans()*0.2+bonus;
		return (int)skor;
	}

	@Override
	public int golSkor(int kurtaris) {
		Random random = new Random();
		int bonus = random.nextInt(2,5);
		double skor = getYetenek()*0.3+getSut()*0.2+getKararlilik()*0.1+getSans()*0.1+getKafa()*0.1+getSicrama()*0.1+getDogalForm()*0.1+bonus-kurtaris;
		return (int)skor;	
	}

}
