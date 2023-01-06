package lesson033;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class UrunManager {

	Urun urun1 = new Urun();
	List<Urun> urunler = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public Optional<Urun> urunYarat() {
		System.out.println("Urun adı giriniz");
		String urunAdi = scanner.nextLine();
		System.out.println("Urun fiyatı giriniz");
		double fiyat = Double.parseDouble(scanner.nextLine());
		System.out.println("Urunun son kullanma tarihini giriniz");
		int skt = Integer.parseInt(scanner.nextLine());
		
		if(urunAdi.isBlank() ||fiyat<=0) return Optional.empty();
		else {
		return Optional.of(new Urun(urunAdi,fiyat,skt)); }
	}
	
	public void urunEkle(Optional<Urun> urun) {
		if(urun.isPresent()) {
			urunler.add(urun.get());
		}
	}
	
	public Optional<Urun> urunyarat2(Urun urun) {
		
		if(urun.getIsim()==null || urun.getFiyat()<=0) return Optional.empty();
		else {
		return Optional.of(urun); }
	}
	
	public Urun urunOlustur () {
		System.out.println("Urun adı giriniz");
		String urunAdi = scanner.nextLine();
		System.out.println("Urun fiyatı giriniz");
		double fiyat = Double.parseDouble(scanner.nextLine());
		System.out.println("Urunun son kullanma tarihini giriniz");
		int skt = Integer.parseInt(scanner.nextLine());
		
		if (urunAdi==null || urunAdi.trim().isEmpty()||fiyat<=0) {
			return null;
		} else {
			return new Urun(urunAdi,fiyat,skt);
			}
	}
	
	public void tariheGoreKiyasla() {
		urunler.stream().filter(x-> x.getSkt()<2022).forEach(System.out::println);
		List<Urun> eskiUrunler = urunler.stream()
				.filter(x-> x.getSkt()<2022).collect(Collectors.toList());
	}
	public void zamYap() {
		urunler.stream().filter(x-> x.getSkt()>2022).forEach(x-> {
			x.setFiyat(x.getFiyat()*1.3);
			System.out.println(x);	
		});
		Set <Urun> set = urunler.stream().filter(x->x.getSkt()>2022).
				collect(Collectors.toCollection(TreeSet::new));
		
//		Set <Urun> zamliUrunler = urunler.stream().filter(x->x.getSkt()>2022).map(y->{
//			y.setFiyat(y.getFiyat()*1.54);
//			return y;
//		}).collect(Collectors.toSet());
//		zamliUrunler.forEach(System.out::println);
		
		
//		Set<Urun> zamliUrunler2 = urunler.stream().filter((x) ->{
//		if (x.getSkt() > 2022) {
//		x.setFiyat(x.getFiyat() * 1.54);
//		return true;
//		}
//		return false;
//		}).collect(Collectors.toSet());

	}
		public void fiyatBandi(List<Urun> urunler) {
		double ort = urunler.stream().collect(Collectors.averagingDouble(Urun::getFiyat));
		System.out.println("Ortalama fiyat.....: "+ort);
//		double ort2 = urunler.stream().collect(Collectors.averagingDouble((x)->
//		x.getFiyat()));
		
//		urunler.stream().mapToDouble(Urun::getFiyat).average().ifPresent(System.out::println);
//		DoubleStream stream = urunler.stream().mapToDouble(Urun::getFiyat);
		}
	
}
