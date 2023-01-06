package etut;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kitaplik {

	/*
	 * Kitap listesi => ArrayList kitap.yazar; for 
	 * dongusunde donerken dışardam aldığım yazar 
	 * ismmini listedeki yazar ismi ile karşılaştırırım
	 * eşit ise dönerim.
	 * 
	 * 
	 * Yazara Göre Kitap Listesi => Map
	 * İsmeGoreKitapListesi => Map <isim, kitaplistesi>>
	 * yazarListesi set olarak tutalım.
	 * 
	 */
	
	private List <Kitap> kitaplar;
	private Map <String, List<Kitap>> yazarIsmineGoreKitaplar;
	private Map <String, List<Kitap>> ismeGoreKitaplar;
//	private Map <Integer, List<Kitap>> idyeGoreKitaplar;
//	private Set<Yazar> yazarlar;
	private Map<String, Yazar> ismeGoreYazarlar;
	
	
	
	public Kitaplik() {
        this.kitaplar = new ArrayList<>();
        this.yazarIsmineGoreKitaplar = new LinkedHashMap<>();
        this.ismeGoreKitaplar = new LinkedHashMap<>();
        this.ismeGoreYazarlar = new LinkedHashMap<>();
    }
	public List<Kitap> getKitaplar() {
		return kitaplar;
	}
	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}
	public Map<String, List<Kitap>> getyazarIsmineGoreKitaplar() {
		return yazarIsmineGoreKitaplar;
	}
	public void setyazarIsmineGoreKitaplar(Map<String, List<Kitap>> yazarIsmineGoreKitaplar) {
		this.yazarIsmineGoreKitaplar = yazarIsmineGoreKitaplar;
	}
	public Map<String, List<Kitap>> getIsmeGoreKitaplar() {
		return ismeGoreKitaplar;
	}
	public void setIsmeGoreKitaplar(Map<String, List<Kitap>> ismeGoreKitaplar) {
		this.ismeGoreKitaplar = ismeGoreKitaplar;
	}
	public Map<String, Yazar> getIsmeGoreYazarlar() {
		return ismeGoreYazarlar;
	}
	public void setIsmeGoreYazarlar(Map<String, Yazar> ismeGoreYazarlar) {
		this.ismeGoreYazarlar = ismeGoreYazarlar;
	}
	
	
}
