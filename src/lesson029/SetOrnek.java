package lesson029;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {

	/*
	 * bir tane String setimiz olsun daha sonra dışarıdan bir kategori
	 * istediğim,z method olsun bu kategorileri setimize ekleyelim
	 * 
	 * eger daha önce eklememişsek bize boyle bir kategori eklendi diye
	 * cıktı versin
	 * setimizi yazdıralım.
	 * 
	 */
	
	public static void main(String[] args) {
		
	Set<String> set = new HashSet<>();
	 
    kategoriEkle("Romantik", set);
    kategoriEkle("Dram", set);
    kategoriEkle("Romantik", set);
    kategoriEkle("Bilim Kurgu", set);
}

public static void kategoriEkle(String kategori, Set<String> set) {
    if (set.contains(kategori)) {
        System.out.println(kategori + " kategorisi daha once eklenmiştir bir daha ekleyemezsiniz!!!");
    } else {
        System.out.println(kategori + " basarılı bir şekilde eklenmiştir");
        set.add(kategori);
    }
}

public static void kategoriEkle2(String kategori, Set<String> set) {
    if (!set.add(kategori)) {
        System.out.println(kategori + " kategorisi daha once eklenmiştir bir daha ekleyemezsiniz!!!");
    } else {
        System.out.println(kategori + " basarılı bir şekilde eklenmiştir");
    }
	
}
}
