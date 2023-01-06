package etut;

import java.util.UUID;

public class Kitap {
	private int id;
	private String isimSoyisim;
	private Yazar yazar;
	private int sayfaSayisi;
	private String isbnKodu;
	
	
	public Kitap(String isimSoyisim, int sayfaSayisi) {
		super();
		this.isimSoyisim = isimSoyisim;
		this.sayfaSayisi = sayfaSayisi;
		this.isbnKodu = UUID.randomUUID().toString();
		this.id = ++Utility.kitapId;
	}


	public Kitap(String isimSoyisim, Yazar yazar, int sayfaSayisi) {
		super();
		this.isimSoyisim = isimSoyisim;
		this.yazar = yazar;
		this.sayfaSayisi = sayfaSayisi;
		this.isbnKodu = UUID.randomUUID().toString();
		this.id = ++Utility.kitapId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getisimSoyisim() {
		return isimSoyisim;
	}


	public void setisimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}


	public Yazar getYazar() {
		return yazar;
	}


	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}


	public int getSayfaSayisi() {
		return sayfaSayisi;
	}


	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}


	public String getIsbnKodu() {
		return isbnKodu;
	}


	public void setIsbnKodu(String isbnKodu) {
		this.isbnKodu = isbnKodu;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isimSoyisim=" + isimSoyisim + ", yazar=" + yazar + ", sayfaSayisi=" + sayfaSayisi
				+ ", isbnKodu=" + isbnKodu + "]";
	}
	
	
	
	
}
