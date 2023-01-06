package lesson034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1- ortalama hesaplayan stream yapısını yazınız hepsi için ayrı hesaplayıp ortalama
 * notlar dpuble listemiz olacak not ortalamalarını bu listede toplayacağız.
 * Bir de sınıf ortalamamız bulunsun.
 * 
 * 2- Bölüme Göre Mapleyelim.
 * @author sezaigenel
 * 3- Sınıf Ortalaması 50 ve altı olanlar için durum güncellemesi Kaldı
 * Diğerleri için Geçti
 */
public class StudentManager {

	List<Student> ogrenciler;
	
	
	
	public StudentManager() {
		super();
		baslangicVerisi();
	}

	public void baslangicVerisi() {
		
		ogrenciler = new ArrayList<>();
        Student student1 = new Student(1, "Mustafa", "mat");
        student1.getNotlar().add(50D);
        student1.getNotlar().add(50.0);
        student1.getNotlar().add(50D);
        Student student2 = new Student(2, "Ayşe", "tm");
        student2.getNotlar().add(80D);
        student2.getNotlar().add(55D);
        student2.getNotlar().add(79.5);
        Student student3 = new Student(3, "Hakan", "tm");
        student3.getNotlar().add(86D);
        student3.getNotlar().add(97.5);
        student3.getNotlar().add(50.5);
        Student student4 = new Student(4, "Mert", "mat");
        student4.getNotlar().add(80D);
        student4.getNotlar().add(30D);
        student4.getNotlar().add(82.5);
        Student student5 = new Student(5, "Gamze", "mat");
        student5.getNotlar().add(10D);
        student5.getNotlar().add(35.7);
        student5.getNotlar().add(58.3);
        Student student6 = new Student(6, "Merve", "tm");
        student6.getNotlar().add(36D);
        student6.getNotlar().add(23.5D);
        student6.getNotlar().add(57.5);
        
        ogrenciler = List.of(student1, student2, student3, student4, student5, student6);
		
	}
	
        public void ortalamaHesapla() {
        	
        	List<Double> notlar = new ArrayList<Double>();
//          1. ÇÖZÜM map li çözüm
//           notlar = ogrenciler.stream().map((x) ->
//           x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)))
//           .collect(Collectors.toList());
//
//            notlar.forEach(System.out::println);
//
//        	2. ÇÖZÜM For Eachli Cozum
//            ogrenciler.stream().forEach((x) -> {
//
//             System.out.println(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//           });
//            
//            ogrenciler.stream().forEach((x) -> {
//                  notlar.add(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//            });
//            notlar.forEach(System.out::println);
//            3.ÇÖZÜM Student Constructorda yapıldı.
            ogrenciler.stream().forEach(x->System.out.println(x.notOrtHesapla()));
            notlar = ogrenciler.stream().map(x->x.notOrtHesapla()).collect(Collectors.toList());
//			1.Çözüm
        	double sinifortalamasi = notlar.stream().collect(Collectors.averagingDouble(x->x));	
        	System.out.println(sinifortalamasi);
//        	2.Çözüm
        	Double ort2 = ogrenciler.stream().collect(
        			Collectors.averagingDouble(x->x.getNotlar().stream()
        			.collect(Collectors.averagingDouble(t->t))));
//        	System.out.println(ort2);
        	
        }
        	public void ogrencileriBolumlereAyir () {
//        	List<Student> matBolumu;
//        	List<Student> tmBolumu;
//        	matBolumu = ogrenciler.stream().filter(x->x.getBolum().equals("mat")).collect(Collectors.toList());	
//        	tmBolumu = ogrenciler.stream().filter(x->x.getBolum().equals("tm")).collect(Collectors.toList());	
//        	System.out.println(matBolumu);
//        	System.out.println(tmBolumu);
        	Map<String, List<Student>> bolumeGoreMap;
        	Map<String, List<Student>> bolumeGoreMap2;
//        	bolumeGoreMap = ogrenciler.stream().collect(Collectors.groupingBy(x->x.getBolum()));
        	bolumeGoreMap = ogrenciler.stream().collect(Collectors.groupingBy(Student::getBolum));	
        	System.out.println(bolumeGoreMap);
        	bolumeGoreMap.forEach((k,v)-> System.out.println(k+" ====> "+v));
        	
        	bolumeGoreMap2 = ogrenciler.stream().collect(Collectors.groupingBy(Student::getBolum));	

        	bolumeGoreMap2.entrySet().forEach(System.out::println);
        	}
        	
        	public void durumGuncellemesi() {
        	ogrenciler.stream().forEach(x->{
        		if (x.notOrtHesapla()<50)
        			x.setDurum("Kaldi");
        		else x.setDurum("Geçti");
        	});
        	ogrenciler.forEach(x-> System.out.println(x));
        	
//        	ogrenciler.stream().filter(x-> {
//        		if(x.notOrtHesapla()>50) {
//        			x.setDurum("Geçti");
//        			return true;
//        		} else {
//        			x.setDurum("Kaldı");
//        			return false;
//        		}
//        	}).forEach(System.out::println);
        	
//        	ogrenciler.stream().forEach(s -> s.setDurum(s.notOrtHesapla() > 50 ? "Geçti" : "Kaldi"));	
//        	ogrenciler.forEach(System.out::println);
        	}
        	
        	public void ogrenciVeNotOrtalamasiMapleme() {
        	Map<Double, List<Student>> notOrtalamasinaGoreMap;
        	notOrtalamasinaGoreMap= ogrenciler.stream().collect(Collectors.groupingBy(x->x.notOrtHesapla()));
        	notOrtalamasinaGoreMap.forEach((k,v)-> System.out.println(k+" ====> "+v));
        	Map<String,Double> notOrtalamasinaGoreMap2 = new HashMap<>();
        	Map<Student,Double> notOrtalamasinaGoreMap3= new HashMap<>();
        	notOrtalamasinaGoreMap2 = ogrenciler.stream().collect(Collectors.toMap(Student::getIsim, Student:: notOrtHesapla));
        	notOrtalamasinaGoreMap2 = ogrenciler.stream().collect(Collectors.toMap(x->x.getIsim(), y->y.notOrtHesapla()));
        	notOrtalamasinaGoreMap3 = ogrenciler.stream().collect(Collectors.toMap(x->x, y->y.notOrtHesapla()));
        	notOrtalamasinaGoreMap2.forEach((k,v)-> System.out.println(k+" ====> "+v));
        	}
        	public void notEkle() {
        		ogrenciler.stream().forEach(x->x.getNotlar().add(80d));
        		ogrenciler.stream().map(x->x.getNotlar().add(80D));
        		ogrenciler.stream()
        		.forEach(x->x.setNotlar(
        				x.getNotlar().stream().map(y->y+5)
        				.collect(Collectors.toList())));
        	}
}
