package lesson026;

import java.util.Random;

public class Kaleci extends Futbolcu {

	private int kurtaris;

	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtaris = rastgeleYetenekPuaniAta();
	}

	@Override
	public int rastgeleYetenekPuaniAta() {
		Random random = new Random();
		return random.nextInt(65, 101);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}
	public int kurtarisSkor() {
		Random random = new Random();
		double bonus = (random.nextInt(2,5) * (getDogalForm()*0.025));
		int skor=(int) (getKurtaris()*0.2+getKararlilik()*0.1+bonus);
		return skor;	
	}
	
}
