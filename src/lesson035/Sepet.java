package lesson035;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/*
 * 1- Urun sınıfımızda isim ve fiyat değerlerini tutacağız bunlar için gerekli get set
 * ve constructor yapılarını kuracağız.
 * 
 * 2- Sepette Eurunlerden bir arrayimiz olsun - bir de Urun listemiz olsun
 * nir urunolsutur methodu yapıp
 * E urun product arrayindeki enumların değerleri ile urun olsuturup listemizi dolduralım.
 * 
 * 3- bir urun fiyat mapimiz olsun bu mapi urunler listesi üzerinden olusturalım.
 * 
 * 4- Urun ekle metodu ekleyelim listeden donup indexine gore secebiliriz ya da String olarak
 * girebiliriz. Buradaki mapimize dışarıdan bir ürün ekleyeceğiz her seçişte bir tane ekleyecek
 * yani 1 er 1 er artacak.
 * 
 * 5- 2 tane mapimiz var 1.map sepet üzerinde bir ürüne denk geldiğimde bu urunun kaç adet olduğunu
 * biliyorum aynu urun urun fiyat mapinde de tutuluyor. Aynı urun ismiyle de diğer mapten fiyatı
 * çekerim sonra  adet*fiyattan bir fiyat değerim olur. Bunu mapteki her bir eleman için yapcağız
 * ve her bir eleman için bize bir double dönecek bu fiyatları da bir double listede toplayalım
 * ve daha sonra bu double listedeki değerleri toplayalım by bize sepetteki toplam fiyatı verecek.
 */
public class Sepet {

	EUrun [] product = EUrun.values();
	List <Urun> urunler = new ArrayList<>();
	Map <String,Double> urunFiyatMap = new HashMap<>();
	Map<String,Integer> sepet = new HashMap<>();
	double toplam = 0;
	
	
	
	public Sepet() {
		super();
		urunOlustur2();
		urunFiyatMapOlustur();
	}
	public void urunOlustur() {
//		for (int i = 0; i < product.length; i++) {
//			Urun urun = new Urun();
//			urun.setFiyat(product[i].getFiyat());
//			urun.setIsim(product[i].name());
//		    urun.setIsim(product[i].toString());
//			urunler.add(urun);
//		}
		for (EUrun urun : product) {
//			Urun myUrun = new Urun();
//			myUrun.setFiyat(urun.fiyat);
//			myUrun.setIsim(urun.name());
//			urunler.add(myUrun);
			
			urunler.add(new Urun (urun.name(),urun.getFiyat()));
		}	
		}
	public void urunOlustur2() {
		List<EUrun> urunListesi = Arrays.asList(product);
		urunListesi.stream().forEach(x-> urunler.add(new Urun(x.name(),x.getFiyat())));
//		Arrays.asList(product).stream().forEach(x-> urunler.add(new Urun(x.name(),x.getFiyat())));
//		Arrays.stream(product).forEach(x-> urunler.add(new Urun(x.name(),x.getFiyat())));
	}
	public void urunFiyatMapOlustur() {
		urunFiyatMap = urunler.stream().collect(Collectors.toMap(x->x.getIsim(), y-> y.getFiyat()));
//		urunFiyatMap = urunler.stream().collect(Collectors.toMap(Urun::getIsim, Urun::getFiyat));
//		urunler.stream().forEach(x-> urunFiyatMap.put(x.getIsim(), x.getFiyat()));
	}
	
	public void sepetiGoster() {
		sepet.forEach((k,v)-> System.out.println(k+" - "+v));
		sepetToplami2();
	}
	public void urunEkle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen ürün ismi giriniz");
		String urunIsmi = sc.nextLine();
		if (sepet.containsKey(urunIsmi)) {
			sepet.replace(urunIsmi, sepet.get(urunIsmi)+1);
		} else {
			sepet.put(urunIsmi, 1);	
		}
		
	}
	
	public void urunEkle2(String urunIsmi) {
		int sayac = sepet.containsKey(urunIsmi) ? sepet.get(urunIsmi) : 0;
		sepet.put(urunIsmi, sayac+1);
	}
	
	public void urunEkle3() {
		
		AtomicInteger i = new AtomicInteger(1);
		urunler.forEach(x-> {
			System.out.println(i+"-"+x.getIsim()+ "===>"+x.getFiyat());
			i.set(i.get()+1);
		});
		System.out.println("Eklemek istediğiniz urun numarasını giriniiz");
		Scanner sc = new Scanner(System.in);
		int urunIndex = sc.nextInt();
		String urunIsmi = urunler.get(urunIndex-1).getIsim();
		
		if (sepet.containsKey(urunIsmi)) {
			sepet.replace(urunIsmi, sepet.get(urunIsmi)+1);
		} else {
			sepet.put(urunIsmi, 1);	
		}
	}
	
	public void fiyatTopla () {
		List <Double> fiyatlar = new ArrayList<>();
		sepet.forEach((x,y)-> { 
			fiyatlar.add((double)y*(urunFiyatMap.get(x)));
		});
		double toplam=0;
		for (Double double1 : fiyatlar) {
			toplam+=double1;
		}
		System.out.println(toplam);
	}
	
	public void sepetToplami() {
        List<Double> fiyatlar = new ArrayList<>();
        DoubleSummaryStatistics toplam;
        for (Entry<String,Integer> urun : sepet.entrySet()) {
            fiyatlar.add(urun.getValue() * urunFiyatMap.get(urun.getKey()));
        }
        toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.println("Sepetin toplam fiyati " + toplam.getSum());
    }
	
    public void sepetToplami2() {
        List<Double> fiyatlar = new ArrayList<>();
        sepet.forEach((isim, adet) -> {
            double fiyat = urunFiyatMap.get(isim) * adet;
            fiyatlar.add(fiyat);
        });
        double toplam = 0;
        for (Double fiyat : fiyatlar) {
            toplam += fiyat;
        }
        System.out.println("Sepetin toplam fiyati " + toplam);
    }

    public void sepetToplami3() {
    	toplam =0;
        sepet.forEach((isim, adet) -> toplam += (urunFiyatMap.get(isim) * adet));
        System.out.println("Sepetin toplam fiyati " + toplam);
    }

    public void sepetToplami4() {
        List<Double> fiyatlar = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
                .collect(Collectors.toList());
        Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();
        Double toplam2 = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
                .reduce((s1, s2) -> s1 + s2).get();
//      System.out.println("Sepetin toplam fiyati " + toplam);
        System.out.println("Sepetin toplam fiyati " + toplam2);
    }
    public void sepetToplami5() {
    	AtomicInteger toplam2 = new AtomicInteger();
    	int toplam3=0;
    	sepet.entrySet().stream().forEach(x->{
    		
        	double fiyat = (toplam2.get()+urunFiyatMap.get(x.getKey())*x.getValue());
        	toplam2.set((int) fiyat);
        			
    	});
    	// Entry set - Map Farkı
        // urunfiyatMap
        // cola=20
        // cips=15
        // urunFiyatMap.get(cola) ===> donen deger 20
        // urunFiyatMap.get(cips) ===> donen deger 15

        // sepet
        // cola=2
        // cips=3
        // sepet.get(cola) ===> donen deger 2
        // sepet.get(cips) ===> donen deger 3

        // sepetEntrySet
        // 0.index ==> cola:2
        // 1.index ==> cips:3

    	// 0.index.getKey()==> donen deger cola 0.index.getValue() ===> donen deger 2
    }
    
    public void urunleriListele() {
    urunFiyatMap.forEach((k,v)->System.out.println(k+" = "+v));	
    }
    public void menu() {
    	int kontrol = 0;
    	Scanner sc = new Scanner(System.in);
    	do {
			System.out.println("-------------");
			System.out.println("1-Ürün Listesi Göster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3- Sepeti Goster");
			System.out.println("0- Çıkış");
			System.out.println("-------------");
			System.out.println("Lütfen Bir İşlem Seçiniz");
			kontrol = sc.nextInt();
			switch (kontrol) {
			case 1:urunleriListele();break;
			case 2:urunEkle3();;break;
			case 3:sepetiGoster();;break;

			default:
				break;
			}
		} while (kontrol !=0);
    }
	
}
