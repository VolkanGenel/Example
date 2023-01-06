package lesson028.queue.soru2;

public class Hasta implements Comparable<Hasta> {

    /*
* isim
* şikayet
* öncelik özelliği 
* 
* şikayete göre önceliği belirliyeceğiz
* 
*      Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
* 
* önceliğe göre kuyruğumuzu oluşturacağız
* 
* 
*/
	
	String ad;
	ESikayet sikayet;
	int oncelik;
	
	
	public int getOncelik() {
		return oncelik;
	}
	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}
	
	@Override
	public String toString() {
		return "Hasta [ad=" + ad + ", sikayet=" + sikayet + "]";
	}
	public Hasta(String ad, ESikayet sikayet) {
		super();
		this.ad = ad;
		this.sikayet = sikayet;
		oncelikBelirle(sikayet);
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public ESikayet getSikayet() {
		return sikayet;
	}
	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}
	public void oncelikBelirle (ESikayet sikayet) {
		if (getSikayet().equals(ESikayet.APANDISIT)) {
			this.oncelik=1;
		}else if (getSikayet().equals(ESikayet.YANIK)) {
			this.oncelik=2;
		}else if (getSikayet().equals(ESikayet.BASAGRISI)) {
			this.oncelik=3;
		} else throw new IllegalArgumentException("Unexpected value: "+sikayet);
	}
	@Override
	public int compareTo(Hasta hasta) {
		if (hasta.oncelik> this.oncelik) 
			return -1;
		else if (hasta.oncelik< this.oncelik) 
			return 1;
		else return 0;
	}
	
}
