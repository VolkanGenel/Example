package lesson030;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetOrnek {
	static Scanner scanner;
    static Set<Integer> sayılar = new HashSet<>();
    static Set<Integer> ekledigimSıraIle = new LinkedHashSet<>();
    static Set<Integer> kucuktenbuyuge = new TreeSet<>();
    static Set<String> stringTreeSet = new TreeSet<>();
    static Set<Ogrenci> ogrenciSet= new TreeSet<>(); 
    // treesetler comparable
    // interfacini implement etmiş sınıflar istiyor.
    // tree setler karşılaştırılabilir bir sınıf bekliyor.


    public static void sayıEkle() {

        scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Lütfen Bir sayı giriniz");
            int sayi = scanner.nextInt();
            sayılar.add(sayi);
            ekledigimSıraIle.add(sayi);
            kucuktenbuyuge.add(sayi);
        }
    }
    public static void yazdır(Set<Integer> set) {

 

    	  set.forEach(System.out::println);
//        set.forEach(System.out::println);
    }
    public static void main(String[] args) {
//        sayıEkle();
//        System.out.println("====Has set====");
//        yazdır(sayılar);
//        System.out.println("===========");
//        System.out.println("====Linked set====");
//        yazdır(ekledigimSıraIle);
//        System.out.println("===========");
//        System.out.println("====Tree set====");
//        yazdır(kucuktenbuyuge);
//        System.out.println("===========");
//    	  stringTreeSet.add("Mustafa");
//    	  stringTreeSet.add("Ahmet");
//    	  stringTreeSet.add("Mehmet");
//    	  stringTreeSet.add("Ali");
//    	  stringTreeSet.add("Veli");
//    	  stringTreeSet.forEach(System.out::println);
    	  
    		ogrenciSet.add(new Ogrenci(1));
        	ogrenciSet.add(new Ogrenci(2));
        	ogrenciSet.add(new Ogrenci(3));
        	ogrenciSet.add(new Ogrenci(4));
        	ogrenciSet.add(new Ogrenci(55));
        	ogrenciSet.add(new Ogrenci(15));
        	ogrenciSet.add(new Ogrenci(23));
        	ogrenciSet.add(new Ogrenci(12));      	
        	ogrenciSet.forEach(System.out::println);
}
}