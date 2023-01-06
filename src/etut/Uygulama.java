package etut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Uygulama implements ICrud {

	Kitaplik kitaplik;
	
	
	public Uygulama(Kitaplik kitaplik) {
		super();
		this.kitaplik = kitaplik;
	}
	
	

	public Uygulama() {
		super();
		this.kitaplik = new Kitaplik();
	}



	@Override
	public void kitapEkle() {
		String ad = Utility.stringDegerAlma("Lütfen kitap ismimi giriniz");
		int sayfasayisi = Utility.intDegerAlma("Lütfen kitabın sayfa sayısını giriniz");
		String yazarIsimSoyIsim = Utility.stringDegerAlma("Lütfen yazar ismini giriniz");
		Yazar yazar = yazarKontrol(yazarIsimSoyIsim);
		Kitap kitap= new Kitap (yazarIsimSoyIsim,yazar,sayfasayisi);
		kitaplik.getKitaplar().add(kitap);
		yazar.getKitaplar().add(kitap);
		kitaplik.getyazarIsmineGoreKitaplar().put(yazarIsimSoyIsim, yazar.getKitaplar());
		ismeGoreKitapEkle(kitap,ad,kitaplik.getIsmeGoreKitaplar());
	}
	
	private void ismeGoreKitapEkle(Kitap kitap,String ad, Map<String, List<Kitap>> map) {
		List<Kitap> kitaplar = new ArrayList<>();
		if(map.containsKey(ad)) {
			kitaplar = map.get(ad);
			kitaplar.add(kitap);
		} else {
			kitaplar.add(kitap);
		}
		map.put(ad, kitaplar);
	
//		for (int i = 0; i < kitaplik.getKitaplar().size(); i++) {
//			if(kitaplik.getKitaplar().get(i).getisimSoyisim().equalsIgnoreCase(ad)) {
//				
//			}	
//		}
	}
	public Yazar yazarKontrol(String yazarIsmi) {
		if(kitaplik.getIsmeGoreYazarlar().containsKey(yazarIsmi)) {
			System.out.println("Yazar Daha Önce Eklenmiş");
			return kitaplik.getIsmeGoreYazarlar().get(yazarIsmi);
		} else {
			int yas = Utility.intDegerAlma("Yazarın yasını giriniz");
			Yazar yazar = new Yazar (yazarIsmi,yas);
			kitaplik.getIsmeGoreYazarlar().put(yazarIsmi, yazar);
			return new Yazar (yazarIsmi,yas);
		}
	}

	@Override
	public void kitapSil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kitap ismeGoreKitapBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> yazarinKitaplariniBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> kitaplariListele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Yazar> yazarlariListele() {
		// TODO Auto-generated method stub
		return null;
	}

}
