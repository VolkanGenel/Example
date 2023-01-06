package lesson028.queue.soru;

public class Musteri implements Comparable<Musteri> {

	private String ad;
	private String tcno;
	private int yas;
	
	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", tcno=" + tcno + ", yas=" + yas + "]";
	}
	public Musteri(String ad, String tcno, int yas) {
		super();
		this.ad = ad;
		this.tcno = tcno;
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public int compareTo(Musteri o) {
		if(o.getYas()>65)
			return 1;
		return -1;
	}

}
