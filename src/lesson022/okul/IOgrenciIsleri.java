package lesson022.okul;

public interface IOgrenciIsleri {

	Ogrenci ogrenciKaydi();
	boolean ogrenciKaydiSil(String ogrenciNo);
	void bilgilendirmeYap(Ogrenci ogrenci);
	boolean dersKaydiOnayla(Ders ders, Ogrenci ogrenci);
}
