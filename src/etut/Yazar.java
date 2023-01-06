package etut;

import java.util.ArrayList;
import java.util.List;

public class Yazar {
	
	private int id;
	private String isim;
	private int yas;
	List<Kitap> kitaplar;
	
	public Yazar(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
		this.id = Utility.yazarId;
		kitaplar = new ArrayList<>();
	}
	
	public List<Kitap> getKitaplar() {
		return kitaplar;
	}


	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Yazar [id=" + id + ", isim=" + isim + ", yas=" + yas + "]";
	}
	
	
}
