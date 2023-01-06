package lesson025.sepet;

import java.util.ArrayList;
import java.util.List;

/*
*
* "Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt"
* bu ürünleri enum da tutalım
*
*
* daha sonra sepet clasımızda bir urun arrayı olsun bu urun arayıde
* urun enumunu refarans alsın
*
* birde sepetimiz olsun String bir liste olsun
*
* bir menumuz olsun
* 1-ürünleri listele/// 1-Cips 2-kola ........ x-süt  
* (1 e bastıgımzda sepete Cipsi eklesin 2 ye bastığmızda da kolayı  )
* 2-sepete urun ekle
* 3- sepeti yazdır
*
*
*
*/
public class Sepet {

 String[] urunlistesi = new String[Atistirmalik.values().length];	
 List<String> sepet;

 public Sepet() {
	urunListesiOlustur(); 
	this.sepet =new ArrayList<>();
 }
 
 public void menu() {
	 int secim=0;
	 do {
	 System.out.println("1- Ürünleri Listele");
	 System.out.println("2- Sepete Ürün Ekle");
	 System.out.println("3- Sepeti Görüntüle");
	 secim = Utility.intDegerAlma("Lütfen Bir İşlem Seçiniz ");
	 
	 switch (secim) {
	case 1:
		urunleriListele();
		break;
	case 2:
		urunEkle();
		break;
	case 3:
		sepetiGoster();
		break;
	case 0 : System.out.println("Çıkış Yapıldı");
	default:
		break;
	}
 }while (secim!=0);
 }
 
 
 public void urunleriListele() {
	 int i=1;
	 for (String urun : urunlistesi) {
		System.out.println(i+"-"+urun);
		i++;
	}
 }
 public void urunListesiOlustur() {
	
	 for (int i = 0; i < Atistirmalik.values().length; i++) {
		urunlistesi[i] = Atistirmalik.values()[i].toString(); //.getAd() Dene
	}
 }
 public void urunEkle() {
	 urunleriListele();
	 int secim = Utility.intDegerAlma("Lütfen Sepete ekleyeceğiniz urunu seçiniz");
	 sepet.add(urunlistesi[secim-1]);
 }
 public void sepetiGoster() {
	 for (String urun : sepet) {
		System.out.println(urun);
	}
 }
 
 
}
